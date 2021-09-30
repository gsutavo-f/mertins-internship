<%-- 
    Document   : qualolho
    Created on : 24 de set de 2021, 16:26:24
    Author     : gsutavo
--%>

<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    private String formatter(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(date);
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= formatter(new Date()) %></title>
        <link rel='stylesheet' type='text/css' href='smile.css'/>
        <script type='text/javascript' src='smile.js'></script>
    </head>
    <body>
        <section class="container">
            <div class="head">
                <div class="eye"></div>
                <div class="eye"></div>
                <div class="nose"></div>
                <div class="mouth" 
                    <% if("dir".equals(request.getParameter("olho"))) { %>
                        onmouseover="fechaolhodir(event)" onmouseout="abreolhodir(event)"
                    <% } else if("esq".equals(request.getParameter("olho"))) { %>
                        onmouseover="fechaolhoesq(event)" onmouseout="abreolhoesq(event)"
                    <% } %>
                ></div>
            </div>
        </section>
    </body>
</html>
