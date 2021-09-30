<%-- 
    Document   : ipcomp
    Created on : 24 de set de 2021, 15:13:01
    Author     : gsutavo
--%>

<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IP Compare</title>
    </head>
    <body>
        <%
            String clientIp = request.getRemoteAddr();
            String serverIp = request.getLocalAddr();
        %>
        <b><font color="blue">IP Address of request: </font></b><%= clientIp %></br>
        <b><font color="blue">Local IP address:  </font></b><%= clientIp %></br>
        <% if(serverIp.equals(clientIp)) { %>
        <b><font color="brown">CASA</font></b>
        <% } else { %>
        <b><font color="brown">ESTRANGEIRO</font></b>
        <% } %>
    </body>
</html>
