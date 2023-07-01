<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subscribe our newsletter</title>
</head>
<body>
    <%@page import="java.util.HashMap" %>
    <%
        HashMap<String,String> errors = (HashMap<String,String>)request.getAttribute("errors");
    %>
    <form action="subscribe" method="post">
        <p>
            Firstname: <input type="text" name="firstname" id="firstname" placeholder="Enter Firstname" >
            <%
                if(errors != null && errors.containsKey("firstname")) {
                    out.println("<span>"+errors.get("firstname")+"</span>");
                }
            %>
        </p>
        <p>
            Lastname: <input type="text" name="lastname" id="lastname" placeholder="Enter Lastname" >
            <%
                if(errors != null && errors.containsKey("lastname")) {
                    out.println("<span>"+errors.get("lastname")+"</span>");
                }
            %>
        </p>
        <p>
            Email: <input type="email" name="email" id="email" placeholder="Enter Email" >
            <%
                if(errors != null && errors.containsKey("email")) {
                    out.println("<span>"+errors.get("email")+"</span>");
                }
            %>
        </p>
        <p><button type="submit">Submit</button></p>
    </form>
</body>
</html>