package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsutavo
 */
public class Conexao {
    private Connection conexao;
    
    public Conexao() {
        this.conecta();
        this.selecionaRegistro2(120);
        this.close();
    }
    
    public void conecta() {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "teste12");
            this.conexao = DriverManager.getConnection(url, props);
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    
    public void criaEstrututra() {
        try {
            Statement st = this.conexao.createStatement();
            String sqlDDL = "CREATE SEQUENCE SEQTESTEJDBC2";
            st.executeUpdate(sqlDDL);
            sqlDDL = "CREATE TABLE TESTEJDBC("+
                    "ID NUMERIC(3) DEFAULT NEXTVAL('SEQTESTEJDBC2'),"+
                    "DESCRICAO VARCHAR(200),"+
                    "PRIMARY KEY(ID))";
            st.executeUpdate(sqlDDL);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insereRegistros() {
        Logger logs = Logger.getLogger(Conexao.class.getName());
        try {
            Statement st = this.conexao.createStatement();
            String sqlDDL = "INSERT INTO TESTEJDBC (DESCRICAO) VALUES ('VALOR 1')";
            int ret = st.executeUpdate(sqlDDL);
            logs.log(Level.INFO, String.format("Numero de registros inseridos %s", ret));
            sqlDDL = "INSERT INTO TESTEJDBC (DESCRICAO) VALUES ('VALOR 2')";
            ret = st.executeUpdate(sqlDDL);
            logs.log(Level.INFO, String.format("Numero de registros inseridos %s", ret));
            sqlDDL = "INSERT INTO TESTEJDBC (ID, DESCRICAO) VALUES (120, 'VALOR 2')";
            ret = st.executeUpdate(sqlDDL);
            logs.log(Level.INFO, String.format("Numero de registros inseridos %s", ret));
            st.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteRegistros() {
        Logger logs = Logger.getLogger(Conexao.class.getName());
        try {
            Statement st = this.conexao.createStatement();
            String sqlDDL = "DELETE FROM TESTEJDBC";
            int ret = st.executeUpdate(sqlDDL);
            logs.log(Level.INFO, String.format("Numero de registros inseridos %s", ret));
            st.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void selecionaTodosRegistros() {
        Logger logs = Logger.getLogger(Conexao.class.getName());
        try {
            Statement st = this.conexao.createStatement();
            String sqlDDL = "SELECT ID, DESCRICAO AS DESC FROM TESTEJDBC ORDER BY DESCRICAO";
            ResultSet rs = st.executeQuery(sqlDDL);
            while(rs.next()) {
                int id = rs.getInt(1);
                String desc = rs.getString("DESC");
                logs.log(Level.INFO, String.format("\t\tRegistro retornado [%d] - [%s]", id, desc));
            }
            rs.close();
            st.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    
    public void selecionaRegistro(int id) {
        Logger logs = Logger.getLogger(Conexao.class.getName());
        try {
            Statement st = this.conexao.createStatement();
            String sqlDDL = "SELECT * FROM TESTEJDBC WHERE ID=" + id;
            ResultSet rs = st.executeQuery(sqlDDL);
            if(rs.next()) {
                String desc = rs.getString("DESCRICAO");
                logs.log(Level.INFO, String.format("\t\tRegistro retornado [%d] - [%s]", id, desc));
            }
            rs.close();
            st.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    
    public void selecionaRegistro2(int id) {
        Logger logs = Logger.getLogger(Conexao.class.getName());
        try {
            String sqlDDL = "SELECT * FROM TESTEJDBC WHERE ID=?";
            PreparedStatement pst = this.conexao.prepareStatement(sqlDDL);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                String desc = rs.getString("DESCRICAO");
                logs.log(Level.INFO, String.format("\t\tRegistro retornado [%d] - [%s]", id, desc));
            }
            rs.close();
            pst.close();
        } catch(SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
    }
    
    public void close() {
        try {
            this.conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
