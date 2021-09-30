package loginscreen;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginSes", urlPatterns = {"/loginses"})
public class LoginSes extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String logout = req.getParameter("logout");
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        

        HttpSession session = req.getSession();
        if(session != null && logout != null && "true".equals(logout)) {
            session.invalidate();
        }
        session = req.getSession(true);
        session.putValue("username", username);
        session.setMaxInactiveInterval(600000);
        if("true".equals(logout)) {
            resp.sendRedirect("/formularioserio/loginsession");
        }
        
        try {
            out.println("<h3>Usuario logado: " + username + "</h3>");
            out.println("<h6>Senha do usuario: " + password + "</h6>");
            out.println("<b><font color='brown'>ID da sessao: </font></b>" + session.getId() + "<br/>");
            out.println("<b><font color='blue'>Data criacao: </font></b>" + formatter.format(session.getCreationTime()) + "<br/>");
            out.println("<b><font color='blue'>Ultimo acesso: </font></b>" + formatter.format(session.getLastAccessedTime()) + "<br/>");
            out.println("<b><font color='blue'>Tempo inatividade: </font></b>" + session.getMaxInactiveInterval() / 60000 + " min<br/>");
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
