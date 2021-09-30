package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author gsutavo
 */
public class Cliente {
    
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8888);
            
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            
            out.writeUTF("Cliente 1");
            
            String msgServidor = in.readUTF();
            
            System.out.println("Mensagem do servidor: " + msgServidor);
            System.out.println("IP do servidor: " + clientSocket.getInetAddress().getHostAddress());
            System.out.println("Porta do servidor: " + clientSocket.getPort());
            System.out.println("IP do cliente: " + clientSocket.getLocalAddress().getHostAddress());
            System.out.println("Porta do cliente: " + clientSocket.getLocalPort());
        } catch (IOException ex) {
            System.out.println("Nao foi possivel montar a conexao no cliente");
            ex.printStackTrace();
        }
    }
    
}
