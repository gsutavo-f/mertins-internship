package cliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author gsutavo
 */
public class Cliente {
    
    public static void main(String[] args) {
        try {
            DatagramSocket dtSocket = new DatagramSocket();
            InetAddress addr = InetAddress.getByName("127.0.0.1");
            byte[] buffer = "Cliente 1".getBytes();
            
            DatagramPacket pacote = new DatagramPacket(buffer, buffer.length, addr, 8889);
            System.out.println("IP do cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do cliente: " + dtSocket.getLocalPort());
            dtSocket.send(pacote);
            
            pacote = new DatagramPacket(new byte[512], 512);
            dtSocket.receive(pacote);
            
            String msgServidor = new String(pacote.getData());
            System.out.println("Nome do cliente: " + msgServidor);
            System.out.println("IP do cliente: " + pacote.getAddress().getHostAddress());
            System.out.println("Porta do cliente: " + pacote.getPort());
            
            dtSocket.close();
        } catch (IOException ex) {
            System.out.println("Nao foi possivel montar a conexao no cliente");
            ex.printStackTrace();
        }
    }
    
}
