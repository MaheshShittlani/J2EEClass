<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Successful Subscription</title>
</head>
<%@page import="Business.User, Model.UserIO" %>
<%
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    User user = new User(firstname,lastname,email);

    String path = application.getRealPath("WEB-INF/subscribers.txt");
    UserIO.addUser(user, path);
%>
<body>
    <h1>Thanks for subscribing us</h1>
    <table>
        <tr>
            <th>Firstname</th>
            <td><%=user.getFirstname() %></td>
        </tr>
        <tr>
            <th>Lastname</th>
            <td><%=user.getLastname() %></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><%=user.getEmail() %></td>
        </tr>
    </table>
</body>
</html>