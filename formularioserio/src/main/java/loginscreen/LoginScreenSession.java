package loginscreen;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginScreenSession", urlPatterns = {"/loginsession"})
public class LoginScreenSession extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        try {
            out.println("<html>");
            out.println("   <head>");
            out.println("       <title>Servlet Session</title>");
            out.println("   </head>");
            out.println("   <body>");
            out.println("       <div>");
            out.println("           <form method='post' action='loginses'>");
            out.println("               <div>");
            out.println("                   <label>Username</label>");
            out.println("                   <input type='text' id='username' name='username'/>");
            out.println("               </div>");
            out.println("               <div>");
            out.println("                   <label>Password</label>");
            out.println("                   <input type='password' id='password' name='password'/>");
            out.println("               </div>");
            out.println("               <div>");
            out.println("                   <input type='submit' value='submit'>");
            out.println("               </div>");
            out.println("           </form>");
            out.println("       </div>");
            out.println("   </body>");
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
