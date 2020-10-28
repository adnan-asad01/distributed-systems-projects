package de.uniba.dsg.dsam.client;

import de.uniba.dsg.dsam.model.BeverageDTO;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.*;
import java.util.logging.Logger;

@Stateless
public class BeverageManageBean {

    private static final Logger logger = Logger.getLogger(QueueSender.class.getName());

    @Resource(mappedName = "BeverageStoreCF")
    private ConnectionFactory factory;

    @Resource(mappedName = "BeverageStoreQueue")
    private Queue target;


    public void createBeverage(BeverageDTO r) {
        try (Connection connection = factory.createConnection()) {
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(target);
            ObjectMessage message = session.createObjectMessage(r);
            producer.send(message);
            logger.info("Sent room " + r.getManufacturer() + " (" + r.getName() + " qm) to JMS queue");
        } catch (JMSException ex) {
            logger.severe("Could not send message to Queue" + ex);
        }
    }

    public void createPromotionalIntenSive(PromotionalGiftDTO r) {
        try (Connection connection = factory.createConnection()) {
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(target);
            ObjectMessage message = session.createObjectMessage(r);
            producer.send(message);
            logger.info("Sent room " + r.getName() + " (" + " qm) to JMS queue");
        } catch (JMSException ex) {
            logger.severe("Could not send message to Queue" + ex);
        }
    }

}
