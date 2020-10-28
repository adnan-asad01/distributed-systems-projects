package de.uniba.dsg.dsam.client;


import de.uniba.dsg.dsam.BeverageMgtRemote;
import de.uniba.dsg.dsam.IncensiveMgtRemote;
import de.uniba.dsg.dsam.model.BeverageDTO;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/new", urlPatterns = {"/new"})

public class BeveragesServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(BeveragesServlet.class.getName());

    @EJB
    BeverageMgtRemote beverageMgtRemote;

    @EJB
    IncensiveMgtRemote incensiveMgtRemote;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // sampleBean.sayHello();
        logger.info("on method get ");


        List<Incentive> allList = incensiveMgtRemote.getAllIncentives();
        System.out.println("size "+allList.size());

        for (int i = 0; i <allList.size() ; i++) {
            System.out.println(allList.get(i).getType());
            System.out.println(allList.get(i).getName());
        }
        req.getRequestDispatcher("new.jsp").include(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("div_name").trim();
        String manufuctererNamne = req.getParameter("div_manu_name").trim();
        double price = Double.valueOf(req.getParameter("div_price").trim());
        int quantity = Integer.valueOf(req.getParameter("div_quantity"));
        logger.info("val " + name + quantity + manufuctererNamne + price);
        PromotionalGiftDTO promotionalGiftDto = new PromotionalGiftDTO();
        promotionalGiftDto.setName("beverage test");
        BeverageDTO beverageDTO = new BeverageDTO();
        beverageDTO.setName(name);
        beverageDTO.setManufacturer(manufuctererNamne);
        beverageDTO.setPrice(price);
        beverageDTO.setQuantity(quantity);
        beverageDTO.setIncentive(promotionalGiftDto);
        //beverageManageBean.createBeverage(beverageDTO);
        beverageMgtRemote.createBeverage(beverageDTO);
        res.sendRedirect("/frontend");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {
    }
}
