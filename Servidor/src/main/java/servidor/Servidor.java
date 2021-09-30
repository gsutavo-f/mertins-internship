package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gsutavo
 */
public class Servidor {
    
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            String msgCliente = in.readUTF();
            System.out.println("Nome do cliente: " + msgCliente);
            System.out.println("IP do cliente: " + socket.getInetAddress().getHostAddress());
            System.out.println("Porta do cliente: " + socket.getPort());
            
            String msgServidor = "Ola cliente " + msgCliente;
            out.writeUTF(msgServidor);
            
            in.close();
            out.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println("Nao foi possivel montar a conexao no servidor");
            ex.printStackTrace();
        }
    }
    
}
