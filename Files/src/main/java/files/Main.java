package files;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        File path = new File(".");
        File[] lista;
        lista = path.listFiles();
        System.out.println("Path: " + path.getAbsolutePath());
        for(int i = 0; i < lista.length; i++) {
            if(lista[i].isDirectory()) {
                System.out.println("\t Diretorio: " + lista[i].getName());
            } else {
                System.out.println("\t Arquivo: " + lista[i].getName() + " Tamanho(bytes): " + lista[i].length());
            }
        }
        
        File f1 = new File("/home/gsutavo/testePC2");
        if(f1.exists()) {
            System.out.println("Ja existe um diretorio ou arquivo com este nome");
        } else {
            if(f1.mkdir()) {
                System.out.println("Diretorio criado com sucesso");
            } else {
                System.out.println("Falha na cricao do diretorio");
            }
        }
        
        File f2 = new File("/home/gsutavo/testePC2/ola.txt");
        if(f2.exists()) {
            System.out.println("Ja existe um diretorio ou arquivo com este nome");
        } else {
            try {
                if(f2.createNewFile()) {
                    System.out.println("Diretorio criado com sucesso");
                } else {
                    System.out.println("Falha na cricao do diretorio");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
