package servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author gsutavo
 */
public class Servidor {
    
    public static void main(String[] args) {
        try {
            DatagramSocket dtSocket = new DatagramSocket(8889);
            
            DatagramPacket pacote = new DatagramPacket(new byte[512], 512);
            dtSocket.receive(pacote);
            
            String msgCliente = new String(pacote.getData());
            System.out.println("Nome do cliente: " + msgCliente);
            System.out.println("IP do cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do cliente: " + pacote.getPort());
            
            byte[] buffer = ("Ola cliente " + msgCliente).getBytes();
            pacote = new DatagramPacket(buffer, buffer.length, pacote.getAddress(), pacote.getPort());
            dtSocket.send(pacote);
            
            dtSocket.close();
        } catch (IOException ex) {
            System.out.println("Nao foi possivel montar a conexao no servidor");
            ex.printStackTrace();
        }
    }
    
}
