package serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
//        pessoa.setId(1201);
//        pessoa.setNome("Joao");
//        try {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/gsutavo/testePC2/objetopersistido.obj"));
//            oos.writeObject("Gravando objeto");
//            oos.writeObject(pessoa);
//            oos.close();
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/gsutavo/testePC2/objetopersistido.obj"));
            String s = (String) ois.readObject();
            Pessoa p1 = (Pessoa) ois.readObject();
            System.out.println("Id da Pessoa: " + p1.getId());
            System.out.println("Nome da Pessoa: " + p1.getNome());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
