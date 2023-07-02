<% 
    String username = (String)session.getAttribute("username");
    if(username == null || username.trim().isEmpty()) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page</title>
</head>
<body>
    <p>Welcome <%=username%></p>
    <p>
    <form action="logout" method="post">
        <button type="submit">Logout</button>
    </form>
    </p>
</body>
</html>