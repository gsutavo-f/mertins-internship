package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Calculadora extends JFrame {
    JLabel label1 = new JLabel("Numero 1");
    JLabel label2 = new JLabel("Numero 2");
    JLabel result = new JLabel("Resultado");
    private JTextField txtNum1 = new JTextField(20);
    private JTextField txtNum2 = new JTextField(20);
    JButton botaoAdd = new JButton("+");
    JButton botaoSub = new JButton("-");
    JButton botaoDiv = new JButton("/");
    JButton botaoMul = new JButton("*");
    
    private double resultado;

    
    
    public Calculadora() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.iniciar();
    }
    
    private void iniciar() {
        this.setLayout(new FlowLayout());
        
        this.add(this.label1);
        this.add(this.txtNum1);
        this.add(this.label2);
        this.add(this.txtNum2);
        this.add(this.botaoAdd);
        this.add(this.botaoSub);
        this.add(this.botaoMul);
        this.add(this.botaoDiv);
        this.add(this.result);
        
        botaoAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado = soma(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()));
                result.setText("Resultado: " + String.valueOf(resultado));
            }
        });
        botaoSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado = subtracao(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()));
                result.setText("Resultado: " + String.valueOf(resultado));
            }
        });
        botaoMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado = multiplicacao(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()));
                result.setText("Resultado: " + String.valueOf(resultado));
            }
        });
        botaoDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado = divisao(Double.parseDouble(txtNum1.getText()), Double.parseDouble(txtNum2.getText()));
                result.setText("Resultado: " + String.valueOf(resultado));
            }
        });
        
        this.setSize(250,350);
    }
    
    private double soma(double num1, double num2) {
        return num1 + num2;
    }
    private double subtracao(double num1, double num2) {
        return num1 - num2;
    }
    private double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
    private double divisao(double num1, double num2) {
        return num1 / num2;
    }
}
