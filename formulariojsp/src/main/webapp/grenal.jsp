<%-- 
    Document   : grenal
    Created on : 24 de set de 2021, 15:50:31
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GRENAL</title>
    </head>
    <body>
        <div>
            <form>
                <input type="text" name="tname" placeholder="nome">
                <input type="submit" name="gremio" value="gremio">
                <input type="submit" name="inter" value="inter">
            </form>
            <% if(request.getParameter("gremio") != null) { %>
                <jsp:forward page="times/gremio.jsp">
                    <jsp:param name="tname" value="<%= request.getParameter("tname") %>"/>
                </jsp:forward>
            <% } else if(request.getParameter("inter") != null) { %>
                <jsp:forward page="times/inter.jsp">
                    <jsp:param name="tname" value="<%= request.getParameter("tname") %>"/>
                </jsp:forward>
            <% } %>
        </div>
    </body>
</html>
