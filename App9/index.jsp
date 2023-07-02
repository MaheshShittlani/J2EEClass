<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Panel</title>
</head>
<body>
    <h1>Login</h1>
    <%
        String username = (String)session.getAttribute("username");
        if(username != null && !username.isEmpty()) {
            response.sendRedirect("home.jsp");
        }
        String msg = (String)session.getAttribute("msg");
        if(msg != null) {
    %>
        <p style="color: red;"><%=msg %></p>
    <% 
        session.removeAttribute("msg");
    } %>
    <form action="login" method="post">
        <p><input type="text" name="username" placeholder="Enter your username"></p>
        <p><input type="password" name="password" placeholder="Enter your password"></p>
        <p><button type="submit">Login</button></p>
    </form>
</body>
</html>