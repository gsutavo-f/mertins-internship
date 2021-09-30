package AJAX;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReadTxt", urlPatterns = {"/retornoajax"})
public class ReadTxt extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String file = req.getParameter("localfile");
        Path path = Paths.get(file);
        
        resp.setContentType("text/xml");
        resp.setHeader("Cache-Control", "no-cache");
        resp.getWriter().write("<retornoajax>");
        List<String> linhasArquivo = Files.readAllLines(path);
        for(String linha : linhasArquivo) {
            if(linha.equals(linhasArquivo.get(0))) {
                resp.getWriter().write("<ajaxstyles>" + linha + "</ajaxstyles>");
            } else if(linha.equals(linhasArquivo.get(1))) {
                resp.getWriter().write("<ajaxtitle>" + linha + "</ajaxtitle>");
            } else {
                resp.getWriter().write("<ajaxlines>" + linha + "</ajaxlines>");
            } 
        }
        resp.getWriter().write("</retornoajax>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    

}
