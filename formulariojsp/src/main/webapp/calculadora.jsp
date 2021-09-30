<%-- 
    Document   : calculadora
    Created on : 24 de set de 2021, 15:35:09
    Author     : gsutavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <div class="form-calculadora">
            <form>
                <div>
                    <label>Valor 1</label>
                    <input type="number" name="num1">
                </div>
                <div>
                    <label>Valor 2</label>
                    <input type="number" name="num2">
                </div>
                <div>
                    <input type="submit" name="sum" value="+">
                    <input type="submit" name="sub" value="-">
                </div>
            </form>
        </div>
        <div>
            <%
                int num1 = Integer.parseInt(request.getParameter("num1"));
                int num2 = Integer.parseInt(request.getParameter("num2"));
                int result = 0;
                
                if(request.getParameter("sum") != null) {
                    result = num1 + num2;
                } else if(request.getParameter("sub") != null) {
                    result = num1 - num2;
                }
            %>
            <h3><%= result %></h3>
        </div>
    </body>
</html>
