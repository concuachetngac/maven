package servlet.web.Chap6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap6-2")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        

        String url = "/jspFile/jspChap6/chap6_2.html";

        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/jspFile/jspChap6/chap6_2.html";    // the "join" page
        } 
        else if (action.equals("add")) {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String heardFrom = request.getParameter("heardFrom");
        String wantsUpdates = request.getParameter("wantsUpdates");
        String contactVia = request.getParameter("contactVia");

        UserChap6_2 user = new UserChap6_2();
        // process paramters
        if (heardFrom == null) {
            heardFrom = "NA";
        }
        if (wantsUpdates == null) {
            wantsUpdates = "No";
        }
        else {
            wantsUpdates = "Yes";
        }
        if (firstName == null || lastName == null || email == null ||
            firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
            url = "/jspFile/jspChap6/chap6_2.html";
        } 
        else {
            url = "/jspFile/jspChap6/chap6_2.jsp";
        }
        // store data in User object
        
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);        
        user.setHeardFrom(heardFrom);        
        user.setWantsUpdates(wantsUpdates);
        user.setContactVia(contactVia);

        // store User object in request
        request.setAttribute("user", user);

        // forward request to JSP
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}