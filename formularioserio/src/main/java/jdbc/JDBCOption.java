package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "JDBCOption", urlPatterns = {"/jdbc"})
public class JDBCOption extends HttpServlet {
    private DataSource dataSource;
    private Exception exception;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>JDBC Option</title>");
        out.println("</head>");
        out.println("<body bgcolor='antiquewhite'>");
        out.println("<div>");
        
        if(exception == null) {
            try {
                Connection conn = dataSource.getConnection();
                out.println("<h2>Conexao pronta</h2>");
                
                String opcao = req.getParameter("opcao");
                if("aluno".equals(opcao)) {
                    String sql = "select * from aluno";
                    List<Aluno> retorno = new ArrayList<>();
                    try {
                        PreparedStatement pst = conn.prepareStatement(sql);
                        ResultSet resultado = pst.executeQuery();
                        while(resultado.next()) {
                            Aluno aluno = new Aluno();
                            aluno.setIdade(resultado.getString("idade"));
                            aluno.setMatricula(resultado.getString("matricula"));
                            aluno.setNome(resultado.getString("nome"));
                            retorno.add(aluno);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JDBCOption.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for(Aluno a: retorno) {
                        out.println("<p>" + a.getMatricula() + " - " + a.getNome() + ", " + a.getIdade() + "</p>");
                    }
                } else if("funcionario".equals(opcao)) {
                    String sql = "select cod, nome, cargo, salario from funcionario";
                    List<Funcionario> retorno = new ArrayList<>();
                    try {
                        PreparedStatement pst = conn.prepareStatement(sql);
                        ResultSet resultado = pst.executeQuery();
                        while(resultado.next()) {
                            Funcionario funcionario = new Funcionario();
                            funcionario.setCod(resultado.getString("cod"));
                            funcionario.setNome(resultado.getString("nome"));
                            funcionario.setCargo(resultado.getString("cargo"));
                            funcionario.setSalario(resultado.getString("salario"));
                            retorno.add(funcionario);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JDBCOption.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for(Funcionario f: retorno) {
                        out.println("<p>" + f.getCod() + " - " + f.getNome() + ", " + f.getCargo() + " R$" + f.getSalario() + "</p>");
                    }
                }
                
                conn.close();
            } catch (SQLException ex) {
                out.write("Falha na conexao 1");
                ex.printStackTrace();
            }
        } else {
            out.write("Falha na conexao 2");
            exception.printStackTrace();
        }
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
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
