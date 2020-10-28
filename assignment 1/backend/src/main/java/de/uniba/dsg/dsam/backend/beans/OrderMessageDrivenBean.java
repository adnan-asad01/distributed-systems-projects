package de.uniba.dsg.dsam.backend.beans;

import de.uniba.dsg.dsam.model.BeverageDTO;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import java.util.logging.Logger;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")})

public class OrderMessageDrivenBean implements MessageListener {
    private static final Logger logger = Logger.getLogger(OrderMessageDrivenBean.class.getName());

    @EJB
    BeverageInsertionLocal roomInsertionLocal;

    @EJB
    InsentiveInsertionLocal insentiveInsertionLocal;

    public OrderMessageDrivenBean() {
    }

    public void onMessage(Message message) {
        System.out.println(" on Bean ");

        if (message == null) {
            logger.warning("Received null message via room insertion queue");
            return;
        }

        if (message instanceof ObjectMessage) {
            try {
                Object o = ((ObjectMessage) message).getObject();
                if (validate(o)) {

                    roomInsertionLocal.insertRoom((BeverageDTO) o);

                }

            } catch (JMSException e) {
                logger.severe("Error in accessing object" + e);
            }
        } else {
            logger.warning("Received message of unexpected JMS message type " + message);
        }

    }

    private boolean validate(Object o) {
        if (o == null || !(o instanceof BeverageDTO)) {
            logger.warning("Unexpected object for RawRoomDTO validation " + o);
            return false;
        }
        BeverageDTO rrd = (BeverageDTO) o;
        if (rrd.getName() != null && rrd.getManufacturer() != null)
            return true;
        else {
            logger.warning("Invalid RawRoomDTO attributes " + rrd);
            return false;
        }
    }

}
