package ipcompare;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ipcomp"})
public class ipCompare extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("INFO: Invocou um Servlet no metodo init");
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("INFO: Requisicao invocada no metodo Service");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            String name = req.getParameter("name");
            if(name == null) {
                name = "desconhecido";
            }
            
            String clientIp = req.getRemoteAddr();
            String serverIp = req.getLocalAddr();
            String result = null;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>IP Compare</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Locale currentLocale = req.getLocale();
            
            out.println("<h3>Your current browser language is: " + currentLocale.getDisplayLanguage() + ", " + name +"<br/>");
            out.println("<b><font color='blue'>IP Address of request: </font></b>" + clientIp + "<br/>");
            out.println("<b><font color='blue'>local IP Address: </font></b>" + serverIp + "</h3>");
            
            if(currentLocale.getLanguage().equals("pt")) {
                if(clientIp.equals(serverIp)) {
                    result = "CASA";
                } else {
                    result = "ESTRANGEIRO";
                }
            } else if(currentLocale.getLanguage().equals("en")) {
                if(clientIp.equals(serverIp)) {
                    result = "HOME";
                } else {
                    result = "STRANGER";
                }
            }
            out.println("<h2><b><font color='brown'>" + result + "</font></b></h2>");
            
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("over");
    }

}
