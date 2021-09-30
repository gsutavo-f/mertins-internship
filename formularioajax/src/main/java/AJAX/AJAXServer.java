package AJAX;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AJAXServer", urlPatterns = {"/ajaxserver"})
public class AJAXServer extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conteudo = req.getParameter("conteudo");
        if(conteudo == null) {
            conteudo = "parametro nao recebido";
        }
        resp.setContentType("text/xml");
        resp.setHeader("Cache-Control", "no-cache");
        resp.getWriter().write(String.format("<retornoajax cor='%s'>%s</retornoajax>", pegaCor(), conteudo.toUpperCase()));
    }
    
    private String pegaCor() {
        String[] cores = {"blue", "yellow", "green", "red", "black", "brown", "gold", "orange", "purple", "skyblue"};
        Double pos = Math.random() * 10;
        return cores[pos.intValue()];
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
