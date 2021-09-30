<%-- 
    Document   : txtreader
    Created on : 24 de set de 2021, 15:28:18
    Author     : gsutavo
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.InputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TXT Reader</title>
    </head>
    <body bgcolor="antiquewhite">
        <%
            ServletContext cntxt = this.getServletContext();
            String fName = "/WEB-INF/input.txt";
            InputStream ins = cntxt.getResourceAsStream(fName);
            
            if(ins != null) {
                InputStreamReader isr = new InputStreamReader(ins);
                BufferedReader reader = new BufferedReader(isr);
                String text;
                
                while((text = reader.readLine()) != null) {
        %>
        <h2><i>
        <%= text %>
        </h2></i>
        <% } } %>
    </body>
</html>
