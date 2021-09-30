package boasvindas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(urlPatterns = {"/BoasVindas"})
public class BoasVindas extends HttpServlet {
    private DataSource dataSource;
    private Exception exception;
    
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
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        if(exception == null) {
            try {
                Connection conn = dataSource.getConnection();
                out.write("Conexao pronta");
                conn.close();
            } catch (SQLException ex) {
                out.write("Falha na conexao 1 ");
                ex.printStackTrace();
            }
        } else {
            out.write("Falha na conexao 2 ");
            exception.printStackTrace(out);
        }
        out.close();
    }   
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("over");
    }
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet BoasVindas</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet BoasVindas at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        processRequest(request, response);
//    }

}
