package sendredirect;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RedirectSearch", urlPatterns = {"/redirectsearch"})
public class RedirectSearch extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Random Site</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<form action='redirect' method='post'>");
            out.println("<input type='submit' value='redirect'/>");
            out.println("</form>");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
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
