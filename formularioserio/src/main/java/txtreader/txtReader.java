package txtreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/txtreader"})
public class txtReader extends HttpServlet {
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            ServletContext cntxt = this.getServletContext();
            String fName = "/WEB-INF/input.txt";
            InputStream ins = cntxt.getResourceAsStream(fName);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TXT Reader</title>");            
            out.println("</head>");
            out.println("<body bgcolor='antiquewhite'>");
            
            if(ins != null) {
                InputStreamReader isr = new InputStreamReader(ins);
                BufferedReader reader = new BufferedReader(isr);
                String text;
                
                while((text = reader.readLine()) != null) {
                    out.println("<h2><i>" + text + "</h2></i></br>");
                }
            }
            out.println("</body>");
            out.println("</html>");
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
