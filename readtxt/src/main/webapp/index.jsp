<%-- 
    Document   : index
    Created on : 28 de set de 2021, 14:19:38
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Read File</title>
        <script type="text/javascript" src="read.js"></script>
    </head>
    <body>
        <input id="txt-local" name="txt-local" type="text" value="" placeholder="Insira o local do arquivo"></input>
        <input id="txt-file" name="txt-file" type="text" value="" placeholder="Insira o nome do arquivo"></input>
        <button id="submit-btn" name="submit-btn" type="button" onclick="leTxt()">pesquisar</button>
        <div id="first-line" style="position: relative; width: 600px"></div>
        <div id="second-line" style="position: relative; width: 600px"></div>
    </body>
</html>
