package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calc"})
public class CalculadoraServlet extends HttpServlet {
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("INFO: Invocou um Servlet no metodo init");
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("INFO: Requisicao invocada no metodo Service");
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
            String oper = req.getParameter("oper");
            String elem1 = req.getParameter("elem1");
            String elem2 = req.getParameter("elem2");
            out.println("<button type='button' name='soma' width='10'>+</button>");
            out.println("<button type='button' name='sub' width='10'>-</button>");
            if(oper.equals("soma")) {
                out.println("<h1>Resultado: " + Soma(elem1, elem2) + "</h1>");
            } else if(oper.equals("sub")) {
                out.println("<h1>Resultado: " + Subtracao(elem1, elem2) + "</h1>");
            } else {
                out.println("<h1>Operacao nao encontrada</h1>");
            }
            out.println("</body>");
            out.println("</html>");
            out.close();  
        }
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
    
    private int Soma(String elem1, String elem2) {
        return Integer.parseInt(elem1) + Integer.parseInt(elem2);
    }
    
    private int Subtracao(String elem1, String elem2) {
        return Integer.parseInt(elem1) - Integer.parseInt(elem2);
    }

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CalculadoraServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CalculadoraServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
    
}
