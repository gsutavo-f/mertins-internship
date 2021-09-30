/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsutavo
 */
public class ConexaoProcedimento {
    
    
    public static void main(String[] args) {
        Conexao c1 = new Conexao();
//        Connection conexao;
//        try {
//            Class.forName("org.postgresql.Driver");
//            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "teste12");
//            CallableStatement cs = conexao.prepareCall("{call insereusuario(?,?)}");
//            cs.setString(1, "usuario1");
//            cs.setString(2, "Senha1");
//            cs.execute();
//            System.out.println("Procedimento executado com sucesso.");
//            cs.close();
//            conexao.close();
//        } catch(SQLException ex) {
//            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
//            System.exit(1);
//        } catch(ClassNotFoundException ex) {
//            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
//            System.exit(2);
//        }
    }
    
}
