package servlet.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doGet(request, response);
        // get current action
        // String action = request.getParameter("action");
        // if (action == null) {
        //     action = "join";  // default action
        // }
        // // perform action and set URL to appropriate page
        // if (action.equals("join")) {
        //     url = "/index.html";    // the "join" page
        // }
        // else if (action.equals("add")) {                
        //     // get parameters from the request
        //     String firstName = request.getParameter("firstName");
        //     String lastName = request.getParameter("lastName");
        //     String email = request.getParameter("email");

        //     // store data in User object and save User object in db
        //     User user = new User(firstName, lastName, email);
        //     DatabaseConnection.insert(user);
        //     // set User object in request object and set URL
        //     request.setAttribute("user", user);
        //     url = "";   // the "thanks" page
        // }
        // forward request and response objects to specified URL
        

    }    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        String url = "/jspFile/login.jsp";


        getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);

    }
}
