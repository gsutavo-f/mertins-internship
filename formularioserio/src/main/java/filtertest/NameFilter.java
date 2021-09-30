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

@WebFilter(filterName = "NameFilter", urlPatterns = {"/loginses"})
public class NameFilter implements Filter {

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String username = req.getParameter("username");
        PrintWriter out = response.getWriter();
        
        if(username == null) {
            username = "user";
        }
        
        if(username.length() > 2) {
            chain.doFilter(request, response);        
        } else {
            out.println("<h1><font color='red'>Invalid Username</font></h1>");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
    
}
