<%-- 
    Document   : jdbc
    Created on : 24 de set de 2021, 17:24:56
    Author     : gsutavo
--%>

<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form>
                <select name="databases">
                    <option value="aluno">aluno</option>
                    <option value="funcionario">funcionario</option>
                    <input type="submit" name="show" value="mostrar">
                </select>
                <% if("aluno".equals(request.getParameter("databases"))) { %>
                    <jsp:forward page="jdbc/aluno.jsp"/>
                <% } else if("funcionario".equals(request.getParameter("databases"))) { %>
                    <jsp:forward page="jdbc/funcionario.jsp"/>
                <% } %>
            </form>
        </div>
    </body>
</html>
