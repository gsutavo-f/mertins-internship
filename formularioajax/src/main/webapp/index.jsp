<%-- 
    Document   : index
    Created on : 27 de set de 2021, 15:12:44
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Colorful Letters</title>
        <script type="text/javascript" src="scripts/pgajax.js"></script>
    </head>
    <body>
        <input id="txt-input" name="txt-input" type="text" value="" onkeyup="avaliaTecla()"/>
        <div id="txt-retorno" style="position: relative; width: 600px; background-color: cyan; color: white"/>
    </body>
</html>
