
import java.awt.Dimension;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Imc {

    /**
     * @param args
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calcular imc");
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        button.setSize(400, 400);
        button.setVisible(true);
        button.setText("Calcular");
        frame.add(button);
        panel.add(button);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        button.addActionListener((e) -> {
            var peso = Double.parseDouble(JOptionPane.showInputDialog("Olá digite seu peso"));
            var altura = Double.parseDouble(JOptionPane.showInputDialog("Olá digite sua altura")) / 100;
            var s = peso / (altura * altura);
            label.setText(String.valueOf(s));
        });

    }
}