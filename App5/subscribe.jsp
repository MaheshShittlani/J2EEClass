<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Successful Subscription</title>
</head>
<%@page import="business.User" %>
<%
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");

    User user = new User(firstname, lastname, email);
%>
<body>
    <h1>Thanks for subscribing us</h1>
    <table>
        <tr>
            <th>Firstname</th>
            <td><%=request.getParameter("firstname") %></td>
        </tr>
        <tr>
            <th>Lastname</th>
            <td><%=request.getParameter("lastname") %></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><%=request.getParameter("email") %></td>
        </tr>
    </table>
</body>
</html>