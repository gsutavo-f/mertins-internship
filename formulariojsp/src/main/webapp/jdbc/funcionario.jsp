<%-- 
    Document   : funcionario.jsp
    Created on : 24 de set de 2021, 17:51:12
    Author     : gsutavo
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jdbc.Funcionario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
        <h1>Funcionarios</h1>
        <table id="exemplo">
            <tbody>
                <tr>
                    <th style="width: 20%">Codigo</th>
                    <th>Nome</th>
                    <th>Cargo</th>
                    <th>Salario</th>
                </tr>
                <%
                    PreparedStatement pst = conn.prepareStatement("select cod, nome, cargo, salario from funcionario");
                    ResultSet rs = pst.executeQuery();
                    List<Funcionario> retorno = new ArrayList<>();
                    
                    while(rs.next()) {
                        Funcionario funcionario = new Funcionario();
                            funcionario.setCod(rs.getString("cod"));
                            funcionario.setNome(rs.getString("nome"));
                            funcionario.setCargo(rs.getString("cargo"));
                            funcionario.setSalario(rs.getString("salario"));
                            retorno.add(funcionario);
                    }
                %>
                <% for(Funcionario f: retorno) { %>
                    <tr>
                        <td><%= f.getCod() %></td>
                        <td><%= f.getNome() %></td>
                        <td><%= f.getCargo() %></td>
                        <td><%= f.getSalario() %></td>
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
