package de.uniba.dsg.dsam.client;

import de.uniba.dsg.dsam.IncensiveMgtRemote;
import de.uniba.dsg.dsam.model.PromotionalGiftDTO;
import de.uniba.dsg.dsam.model.TrialPackageDTO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/intensive", urlPatterns = {"/intensive"})
public class CreateIntensiveServlet extends HttpServlet {
    @EJB
    IncensiveMgtRemote incensiveMgtRemote;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("div_name").trim();
        String packegeType = request.getParameter("selectIncentive");
        System.out.println("packegeType " + packegeType);

        if (packegeType.equals("2")) {
            TrialPackageDTO trialPackageDTO = new TrialPackageDTO();
            trialPackageDTO.setName(name);
            incensiveMgtRemote.createTrialIncentive(trialPackageDTO);
        } else {
            PromotionalGiftDTO promotionalGiftDto = new PromotionalGiftDTO();
            promotionalGiftDto.setName(name);
            incensiveMgtRemote.createPromotionalIncentive(promotionalGiftDto);
        }

        response.sendRedirect("/frontend");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("intensive.jsp").include(request, response);
    }
}
