package fluxo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        
//        FileOutputStream fos = null;
//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            fos = new FileOutputStream(arquivo);
//            byte [] dados = "Teste de gravacao".getBytes();
//            fos.write(dados);
//            fos.close();
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//        FileInputStream fis = null;
//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            fis = new FileInputStream(arquivo);
//            int leitura = -1;
//            do {
//                leitura = fis.read();
//                if(leitura != -1) {
//                    System.out.println(leitura + " " + (char)leitura);
//                }
//            } while(leitura != -1);
//            fis.close();
//        } catch(FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }

//        DataOutputStream dos = null;
//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            dos = new DataOutputStream(new FileOutputStream(arquivo));
//            dos.writeUTF("Teste de gravacao");
//            dos.writeDouble(12375.564);
//            dos.writeInt(76849224);
//            dos.close();
//        } catch(FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }
        
//        DataInputStream dis = null;
//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            dis = new DataInputStream(new FileInputStream(arquivo));
//            String msg = dis.readUTF();
//            double val1 = dis.readDouble();
//            int val2 = dis.readInt();
//            dis.close();
//            System.out.printf("Mensagem [%s] val1[%f] val2[%d]\n", msg, val1, val2);
//        } catch(FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            FileWriter fw = new FileWriter(arquivo);
//            fw.write("Teste de gravacao");
//            fw.close();
//        } catch(FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            File arquivo = new File("/home/gsutavo/testePC2/ola.txt");
//            FileReader fr = new FileReader(arquivo);
//            int leitura = -1;
//            do {
//                leitura = fr.read();
//                if(leitura != -1) {
//                    System.out.println(leitura + " " + (char)leitura);
//                }
//            } while(leitura != -1);
//            fr.close();
//        } catch(FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }

        try {
            RandomAccessFile raf = new RandomAccessFile("/home/gsutavo/testePC2/ola.txt", "rw");
            raf.writeChars("Ola pessoal\n");
            raf.seek(0);
            String linha = null;
            while((linha = raf.readLine()) != null) {
                System.out.println("Arquivo: " + linha);
            }
            System.out.println("----");
            raf.seek(0);
            raf.writeChars("Gravei no inicio\n");
            raf.seek(0);
            while((linha = raf.readLine()) != null) {
                System.out.println("Arquivo: " + linha);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
