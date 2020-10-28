package de.uniba.dsg.dsam.client;

import de.uniba.dsg.dsam.BeverageMgtRemote;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "/all", urlPatterns = {"/all"})
public class ShowAllBeverageServlet extends HttpServlet {
    private static final Logger logger = Logger.getLogger(ShowAllBeverageServlet.class.getName());

    @EJB
    private BeverageMgtRemote divMgt;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" severage all info");
        try {
            request.setAttribute("rooms", divMgt.getAllBeverage());
            request.getRequestDispatcher("/beverage.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            logger.severe("Invalid data for division id: Must be int" + e);
        }

    }
}
