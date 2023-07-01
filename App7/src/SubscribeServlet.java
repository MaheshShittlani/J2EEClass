import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import  business.User;
import model.UserModel;

@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

        HashMap<String,String> errors = new HashMap<>();
        if(firstname.isEmpty()) {
            errors.put("firstname", "Firstname is required");
        }

        if(lastname.isEmpty()) {
            errors.put("lastname","Lastname is required");
        }

        if(email.isEmpty()) {
            errors.put("email","Email is required");
        }

        String dispatchURL;
        if(!errors.isEmpty()) {
            dispatchURL = "index.jsp";
            request.setAttribute("errors", errors);
        } else {
            User user = new User(firstname, lastname, email);
            ServletContext application  = request.getServletContext();
            String path = application.getRealPath("/WEB-INF/subscribers.txt");
            UserModel.addUser(user, path);
            
            request.setAttribute("user", user);    

            dispatchURL = "subscriber.jsp";
        }
        RequestDispatcher dispatcher =  request.getRequestDispatcher(dispatchURL);
        dispatcher.forward(request, response);
    }
}
