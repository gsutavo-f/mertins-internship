package grenal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/grenal"})
public class Grenal extends HttpServlet {
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>GRENAL</title>");            
            out.println("</head>");
            
            out.println("<form action='gremio' method='post'>");
            out.println("<input type='submit' name='action' value='gremio'>");
            out.println("</form>");
            out.println("<form action='inter' method='post'>");
            out.println("<input type='submit' name='action' value='inter'>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
            
            String action = req.getParameter("action");
            
            out.close();
        }
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
