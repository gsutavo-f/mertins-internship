<%-- 
    Document   : index
    Created on : 27 de set de 2021, 16:47:34
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JDBC Similars</title>
        <script type="text/javascript" src="scripts/jdbc.js"></script>
    </head>
    <body>
        <input id="txt-input" name="txt-input" type="text" value="" placeholder="Insira um nome"/>
        <button id="submit-btn" name="submit-btn" type="button" onclick="pesquisaNome()">pesquisar</button>
        <div id="txt-nomes" style="position: relative; width: 600px"></div>
    </body>
</html>
