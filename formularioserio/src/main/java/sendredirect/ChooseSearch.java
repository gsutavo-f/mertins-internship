package sendredirect;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ChooseSearch", urlPatterns = {"/choosesearch"})
public class ChooseSearch extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        try {
            out.println("<html>");
            out.println("   <head>");
            out.println("       <title>Choose Site</title>");
            out.println("   </head>");
            out.println("   <body>");
            
            out.println("<form method='post'>");
            out.println("   <div>");
            out.println("       <label for='busca'>Busca por</label>");
            out.println("       <input type='text' name='busca'");
            out.println("   </div>");
            out.println("   <div>");
            out.println("       <input type='radio' id='google' name='choice' value='google'");
            out.println("       <label for='google'>www.google.com.br</label>");
            out.println("       <input type='radio' id='yahoo' name='choice' value='yahoo'");
            out.println("       <label for='yahoo'>br.search.yahoo.com</label>");
            out.println("       <input type='radio' id='bing' name='choice' value='bing'");
            out.println("       <label for='bing'>www.bing.com</label>");
            out.println("       <input type='radio' id='steam' name='choice' value='steam'");
            out.println("       <label for='steam'>store.steampowered.com</label>");
            out.println("       <input type='submit' value='choice'/>");
            out.println("   </div>");
            out.println("</form>");

            String choice = null;
            
            for(Cookie temp: req.getCookies()) {
                if("choice".equals(temp.getName())) {
                    choice = req.getParameter("choice");
                }
            }
            Cookie cook = new Cookie("choice", choice);
            cook.setMaxAge(600);
            resp.addCookie(cook);
            
            if(cook.getValue() != null) {
                out.println("<h4>Cookie added by value " + cook.getValue() + "</h4>");
            }
            
            String busca = req.getParameter("busca");
            
            if("google".equals(choice)) {
                resp.sendRedirect("https://www.google.com/search?q=" + busca);
            } else if("yahoo".equals(choice)) {
                resp.sendRedirect("https://br.search.yahoo.com/search?p=" + busca);
            } else if("bing".equals(choice)) {
                resp.sendRedirect("https://www.bing.com/search?q=" + busca);
            } else if("steam".equals(choice)) {
                resp.sendRedirect("https://store.steampowered.com/search/?term=" + busca);
            }
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
