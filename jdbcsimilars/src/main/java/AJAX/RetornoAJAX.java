package AJAX;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import jdbc.Funcionario;

@WebServlet(name = "RetornoAJAX", urlPatterns = {"/retornoajax"})
public class RetornoAJAX extends HttpServlet {
    private DataSource dataSource;
    private Exception exception;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conteudo = req.getParameter("conteudo");
        if(conteudo == null) {
            conteudo = "parametro nao recebido";
        }
        resp.setContentType("text/xml");
        resp.setHeader("Cache-Control", "no-cache");
        resp.getWriter().write(String.format("<retornoajax>%s</retornoajax>", pegaNomes(conteudo)));
    }
    
    private String pegaNomes(String conteudo) {
        String funcionarios = "";
        if(exception == null) {
            try {
                Connection conn = dataSource.getConnection();
                String sql = ("select nome from funcionario where nome like '%" + conteudo + "%';");
                List<Funcionario> retorno = new ArrayList<>();
                
                try {
                    PreparedStatement pst = conn.prepareStatement(sql);
                    ResultSet resultado = pst.executeQuery();
                    while(resultado.next()) {
                        Funcionario funcionario = new Funcionario();
                        funcionario.setNome(resultado.getString("nome"));
                        retorno.add(funcionario);
                    }
                } catch(SQLException ex) {
                    Logger.getLogger(RetornoAJAX.class.getName()).log(Level.SEVERE, null, ex);
                }
                for(Funcionario f: retorno) {
                    funcionarios = funcionarios.concat(f.getNome() + " ");
                }
                return funcionarios;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return "Falha na Conexao 1";
            }
        } else {
            return "Falha na Conexao 2";
        }
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
