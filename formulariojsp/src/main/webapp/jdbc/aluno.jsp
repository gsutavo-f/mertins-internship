<%-- 
    Document   : aluno.jsp
    Created on : 24 de set de 2021, 17:51:03
    Author     : gsutavo
--%>

<%@page import="java.util.List"%>
<%@page import="jdbc.Aluno"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Context context = new InitialContext();
            DataSource dataSource = (DataSource) context.lookup("jdbc/resource1");
            Connection conn = null;
            try {
                conn = dataSource.getConnection();
        %>
        <h1>Alunos</h1>
        <table id="exemplo">
            <tbody>
                <tr>
                    <th style="width: 30%">Matricula</th>
                    <th>Nome</th>
                    <th>Idade</th>
                </tr>
                <%
                    PreparedStatement pst = conn.prepareStatement("select matricula, nome, idade from aluno");
                    ResultSet rs = pst.executeQuery();
                    List<Aluno> retorno = new ArrayList<>();
                    
                    while(rs.next()) {
                        Aluno aluno = new Aluno();
                        aluno.setIdade(rs.getString("idade"));
                        aluno.setMatricula(rs.getString("matricula"));
                        aluno.setNome(rs.getString("nome"));
                        retorno.add(aluno);
                    }
                %>
                <% for(Aluno a: retorno) { %>
                    <tr>
                        <td><%= a.getMatricula() %></td>
                        <td><%= a.getNome() %></td>
                        <td><%= a.getIdade() %></td>
                    </tr>
                <% } %>
                <% 
                    } finally {
                        conn.close();
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
