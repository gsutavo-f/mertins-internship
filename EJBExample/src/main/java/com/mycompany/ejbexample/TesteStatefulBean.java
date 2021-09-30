package com.mycompany.ejbexample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TesteStatefulBean", urlPatterns = {"/testestateful"})
public class TesteStatefulBean extends HttpServlet {
    @EJB
    private EJBStatefulRemote objRemoto;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TesteStatefulBean</title>");
            out.println("</head>");
            out.println("<body>");
            objRemoto.setCaixaAlta(true);
            out.println("<h1>" + objRemoto.toSpace("fRaSe de tESte") + "</h1>");
            objRemoto.setCaixaAlta(false);
            out.println("<h1>" + objRemoto.toSpace("fRaSe de tESte") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}