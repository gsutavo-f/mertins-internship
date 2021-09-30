package sessionexample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessionExample", urlPatterns = {"/sessao"})
public class SessionExample extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String logout = req.getParameter("logout");
        HttpSession sessao = req.getSession();
        if(sessao != null && logout != null && "true".equals(logout)) {
            sessao.invalidate();
        }
        sessao = req.getSession(true);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCookie</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(String.format("<h1>Id Sessao [%s]</h1>", sessao.getId()));
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
