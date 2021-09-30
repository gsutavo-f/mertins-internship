<%-- 
    Document   : redirectpages
    Created on : 27 de set de 2021, 14:31:30
    Author     : gsutavo
--%>

<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Random Site</title>
    </head>
    <body>
        <form method="post">
            <input type="submit" name="redirect" value="redirect">
        </form>
        <% 
            if(request.getParameter("redirect") != null) { 
                Random rand = new Random();
                int op = rand.nextInt(4) + 1;

                String site = null;
                switch(op) {
                    case 1:
                        site = "https://www.google.com/";
                        break;
                    case 2:
                        site = "https://br.search.yahoo.com/";
                        break;
                    case 3:
                        site = "https://e-aula.ufpel.edu.br/my/";
                        break;
                    case 4:
                        site = "https://store.steampowered.com/";
                        break;
                }
                response.sendRedirect(site);
            }
        %>
    </body>
</html>
