<%-- 
    Document   : loginid
    Created on : 24 de set de 2021, 16:52:11
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Session</title>
    </head>
    <body>
        <div>
            <form>
                <input type="text" id="username" name="username" placeholder="username">
                <input type="password" id="password" name="password" placeholder="password">
                <input type="submit" name="submit" value="submit">
            </form>
        </div>
        <% if(request.getParameter("submit") != null) { %>
            <jsp:forward page="loggedid.jsp">
                <jsp:param name="username" value="<%= request.getParameter("username") %>"/>
                <jsp:param name="password" value="<%= request.getParameter("password") %>"/>
            </jsp:forward>
        <% } %>
    </body>
</html>
