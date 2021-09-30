<%-- 
    Document   : timezone
    Created on : 24 de set de 2021, 14:38:00
    Author     : gsutavo
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    private String formatter(Date date, String gmt) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

        sdf.setTimeZone(TimeZone.getTimeZone(gmt));
        return sdf.format(date);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get TimeZone</title>
    </head>
    <body>
        <div>
            <form>
                <label>fuso</label>
                <input type="text" name="fuso" placeholder="input fuso"/>
                <input type="submit" value="ok"/>
            </form>
        </div>
        <%
            String validateFuso = request.getParameter("fuso");
            out.println("<br/>");
            if(validateFuso != null) {
                out.println("<b><font color='green'>" + formatter(new Date(), validateFuso) + "</font></b>");
            } else {
        %>
        <b><font color="red">Insira um fuso</font></b>
        <% } %>
    </body>
</html>
