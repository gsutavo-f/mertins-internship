package cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CookieExercicio", urlPatterns = {"/cookies"})
public class CookieExercicio extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        int vezesAcesso = 1;
        
        for (Cookie temp: req.getCookies()) {
            if("vezesAcesso".equals(temp.getName())) {
                vezesAcesso += Integer.parseInt(temp.getValue());
            }
        }
        Cookie cook = new Cookie("vezesAcesso", String.valueOf(vezesAcesso));
        cook.setMaxAge(10);
        resp.addCookie(cook);
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCookie</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(String.format("<h1>Acesso [%d] - Data [%s]</h1>", vezesAcesso, new Date()));
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
