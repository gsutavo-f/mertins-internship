package filtertest;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "PasswordFilter", urlPatterns = {"/loginses"})
public class PasswordFilter implements Filter {

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String password = req.getParameter("password");
        PrintWriter out = response.getWriter();
        
        if(password == null) {
            password = "pass";
        }
        
        if(password.length() > 2) {
            chain.doFilter(request, response);        
        } else {
            out.println("<h1><font color='red'>Invalid Password</font></h1>");
        }
        
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    
    
    
}
