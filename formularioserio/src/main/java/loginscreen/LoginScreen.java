package loginscreen;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import jdbc.JDBCOption;

@WebServlet(name = "LoginScreen", urlPatterns = {"/login"})
public class LoginScreen extends HttpServlet {
    private DataSource dataSource;
    private Exception exception;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("   <html>");
        out.println("       <head>");
        out.println("           <title>Login Screen</title>");
        out.println("       </head>");
        out.println("       <body bgcolor='antiquewhite'>");
        out.println("           <div>");

        if(exception == null) {
            try {
                Connection conn = dataSource.getConnection();
                out.println("<h2>Conexao pronta</h2>");
                
                out.println("<form method='post' action='login'>");
                out.println("   <div>");
                out.println("       <label>Username</label>");
                out.println("       <input type='text' name='username'>");
                out.println("   </div>");
                out.println("   <div>");
                out.println("       <label>Password</label>");
                out.println("       <input type='password' name='password'>");
                out.println("   </div>");
                out.println("   <div>");
                out.println("       <input type='submit' value='submit'>");
                out.println("   </div>");
                out.println("</form>");
                Login login = null;
                
                for(Cookie temp: req.getCookies()) {
                    if("login".equals(temp.getName())) {
                        login = new Login(req.getParameter("username"), req.getParameter("password"));
                    }
                }
                Cookie cook = new Cookie("login", String.valueOf(login));
                cook.setMaxAge(600);
                resp.addCookie(cook);
                
                // redirect to page
                
                String sql = ("insert into login(username, password) values('" + login.getUsername() + "','" + login.getPassword() + "');");
                try {
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.executeQuery();
                } catch (SQLException ex) {
                        Logger.getLogger(JDBCOption.class.getName()).log(Level.SEVERE, null, ex);
                }
                conn.close();
            } catch(SQLException ex) {
                out.write("Falha na conexao 1");
                ex.printStackTrace();
            }
        } else {
            out.write("Falha na conexao 2");
            exception.printStackTrace();
        }
        
        out.println("       </div>");
        out.println("   </body>");
        out.println("</html>");
        out.close();
        
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("jdbc/resource1");
        } catch (NamingException ex) {
            exception = ex;
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
