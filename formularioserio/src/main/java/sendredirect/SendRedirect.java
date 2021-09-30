package sendredirect;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SendRedirect", urlPatterns = {"/sendred"})
public class SendRedirect extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = null;
        
        String opc = req.getParameter("opc");
        if("google".equals(opc)) {
            rd = req.getRequestDispatcher("https://www.google.com/");
        } else if ("e-aula".equals(opc)) {
            rd = req.getRequestDispatcher("https://e-aula.ufpel.edu.br/my/");
        } else if ("insta".equals(opc)) {
            rd = req.getRequestDispatcher("https://www.instagram.com/");
        } else if("local".equals(opc)) {
            rd = req.getRequestDispatcher("local.jsp");
            req.setAttribute("Forward", "Observe a URL no browser");
        } else {
            rd = req.getRequestDispatcher("local.jsp");
        }
        rd.forward(req, resp);
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
