<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subscriber INFO</title>
    <%@page import ="business.User" %>
    <% 
        User user = (User)request.getAttribute("user");
        if(user == null) {
            user = new User();
        }
    %>
</head>
<body>
    <h1>Thanks for subscription</h1>
    <p>Here is the detail you have entered below...</p>
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
            <td><%=user.getEmail()%></td>
        </tr>
    </table>
</body>
</html>