<%-- 
    Document   : logedid
    Created on : 24 de set de 2021, 17:00:24
    Author     : gsutavo
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Logged Session</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String logout = request.getParameter("logout");
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        

            HttpSession sessao = request.getSession();
            if(sessao != null && logout != null && "true".equals(logout)) {
                sessao.invalidate();
            }
            sessao = request.getSession(true);
            sessao.putValue("username", username);
            sessao.setMaxInactiveInterval(600000);
            if("true".equals(logout)) {
                response.sendRedirect("/formularioserio/loginsession");
            }
        %>
        <h3>Usuario logado: <%= username %></h3>
        <h6>Senha do usuario: <%= password %></h6>
        <b><font color="brown">ID da sessao: </font></b><%= sessao.getId() %><br/>
        <b><font color="blue">Data criacao: </font></b><%= formatter.format(sessao.getCreationTime()) %><br/>
        <b><font color="blue">Ultimo acesso: </font></b><%= formatter.format(sessao.getLastAccessedTime()) %><br/>
        <b><font color="blue">Tempo Inatividade: </font></b><%= sessao.getMaxInactiveInterval() / 60000 %> min<br/>
    </body>
</html>
