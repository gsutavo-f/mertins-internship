package context;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContextExample", urlPatterns = {"/context"})
public class ContextExample extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        Integer count = (Integer)sc.getAttribute("count");
        if(count == null) {
            count = 1;
        } else {
            count++;
        }
        String appOpc = (String)sc.getAttribute("opc");
        String opc = (String)req.getParameter("opc");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TesteContext</title>");
            out.println("</head>");
            out.println("<body>");
            out.println(String.format("<h1>Ultima opcao recebida [%s]</h1>", appOpc));
            out.println(String.format("<h1>Numero de requests desde o startup [%d]</h1>", count));
            out.println(String.format("<h1>Opcao desta pagina [%s]</h1>", opc));
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        sc.setAttribute("count", count);
        sc.setAttribute("opc", opc);
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
