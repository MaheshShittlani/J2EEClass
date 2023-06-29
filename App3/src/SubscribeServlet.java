import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the data from request
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

        response.setContentType("text/html");
        PrintWriter out =  response.getWriter();
        out.println("<html>");
        out.println("<head><title>Successful Subscription</title></head>");
        out.println("<body>");
        out.println("<h1>Thanks for subscribing our email list</h1>");
        out.println("<p>Here is the details you have entered...</p>");
        out.println("<table>");
            out.println("<tr><th>Firstname:</th><td>"+ firstname +"</td></tr>");
            out.println("<tr><th>Lastname:</th><td>" +lastname+ "</td></tr>");
            out.println("<tr><th>Email:</th><td>" +email+ "</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}