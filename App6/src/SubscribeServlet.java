import java.io.IOException;

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

        User user = new User(firstname, lastname, email);
        ServletContext application  = request.getServletContext();
        String path = application.getRealPath("/WEB-INF/subscribers.txt");
        UserModel.addUser(user, path);

        request.setAttribute("user", user);
        RequestDispatcher dispatcher =  request.getRequestDispatcher("subscriber.jsp");
        dispatcher.forward(request, response);
    }
}
