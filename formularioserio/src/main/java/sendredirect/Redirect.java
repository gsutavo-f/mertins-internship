package sendredirect;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gsutavo
 */
@WebServlet(name = "Redirect", urlPatterns = {"/redirect"})
public class Redirect extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random rand = new Random();
        int op = rand.nextInt(4) + 1;
        
        String site = null;
        switch(op) {
            case 1:
                site = "https://www.google.com/";
                break;
            case 2:
                site = "https://br.search.yahoo.com/";
                break;
            case 3:
                site = "https://e-aula.ufpel.edu.br/my/";
                break;
            case 4:
                site = "https://store.steampowered.com/";
                break;
        }
        
        resp.sendRedirect(site);
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
