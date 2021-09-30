<%--
    Document   : index
    Created on : 23 de set de 2021, 17:23:42
    Author     : gsutavo
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    private String formatter(Date date, boolean hour, String gmt) {
        SimpleDateFormat sdf = null;
        if(hour) {
            sdf = new SimpleDateFormat("HH:mm:ss");
        } else {
            sdf = new SimpleDateFormat("dd/MM/yyyy");
        }
        sdf.setTimeZone(TimeZone.getTimeZone(gmt));
        return sdf.format(date);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>A data de hoje eh <%= formatter(new Date(), false, "America/Sao_Paulo") %></h1>
        <h1>A hora eh <%= formatter(new Date(), true, "America/Sao_Paulo") %></h1>
        <h1>A data generica eh <%= new Date() %></h1>
        <h1>A hora em Sydney eh <%= formatter(new Date(), true, "Australia/Sydney") %></h1>
        <%
            System.out.println("INFO: Requisicao invocada no JSP");
            Calendar c = Calendar.getInstance();
            c.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
            int hora = c.get(Calendar.HOUR_OF_DAY);
            out.write("<h1>" + c.getTime().toString() + "</h1>");
            if(hora < 18 && hora > 5) {
        %>
        <h1>Dia</h1>
        <% } else { %>
        <h1>Noite</h1>
        <% } %>
        <div style="font-size: <%= new Double(10+Math.random()*40).intValue() %>px">Hello World!</div>
        <%
            System.out.println("INFO: Requisicao invocada no JSP");
            String cor = request.getParameter("cor");
            if(cor == null) {
                cor = "45E412";
            }
        %>
        <div style="color: <%= cor %>"><%= request.getServletPath() %></div>
    </body>
</html>
