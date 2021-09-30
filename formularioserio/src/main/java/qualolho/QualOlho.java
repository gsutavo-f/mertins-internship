package qualolho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/qualolho"})
public class QualOlho extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        Date date = new Date();
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + date.toString() + "</title>");     
            out.println("<link rel='stylesheet' type='text/css' href='smile.css'/>");
            out.println("<script type='text/javascript' src='smile.js'></script>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<section class='container'>");
            out.println("<div class='head'>");
            out.println("<div class='eye'></div>");
            out.println("<div class='eye'></div>");
            out.println("<div class='nose'></div>");
            
            out.print("<div class='mouth'");  
            String olho = req.getParameter("olho");
            if("esq".equals(olho)) {
                out.println(" onmouseover='fechaolhoesq(event)' onmouseout='abreolhoesq(event)'");
            } else if("dir".equals(olho)) {
                out.println(" onmouseover='fechaolhodir(event)' onmouseout='abreolhodir(event)'");
            } out.print("></div>");
            
            out.println("</div>");
            out.println("</section>");
            
            out.println("</body>");
            out.println("</html>");
        }
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
