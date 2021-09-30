package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Janela extends JFrame {
    JLabel label = new JLabel("Nome");
    private JTextField txtNome = new JTextField(20);
    JButton botao = new JButton("ok");
    
    public Janela() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.iniciar();
    }
    
    private void iniciar() {
        this.setLayout(new FlowLayout());
        this.txtNome.setText("Coloque seu nome");
        this.add(this.label);
        this.add(this.txtNome);
        this.add(this.botao);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Caixa de texto: " + txtNome.getText());
            }
        });
        this.setSize(400,300);
    }
    
}

