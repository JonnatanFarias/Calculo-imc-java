
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.concurrent.Flow;

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

        JFrame f = new JFrame("Calcular IMC");

        f.setSize(300, 300);
        // Set the layout to null
        f.setLayout(null);
        // Create label
        JLabel labelpeso = new JLabel("Seu peso :");
        JLabel labelaltura = new JLabel("Sua altura: ");
        // Create button
        JButton btn = new JButton("Calcular");
        // Define the position and size of the label
        labelpeso.setBounds(0, 50, 200, 40);
        labelaltura.setBounds(0, 60, 200, 40);
        // Define the position and size of the button
        btn.setBounds(45, 150, 200, 40);
        f.add(btn);
        f.add(labelpeso);
        f.add(labelaltura);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        /*
         * button.addActionListener((e) -> {
         * var peso =
         * Double.parseDouble(JOptionPane.showInputDialog("Olá digite seu peso"));
         * var altura =
         * Double.parseDouble(JOptionPane.showInputDialog("Olá digite sua altura")) /
         * 100;
         * var s = peso / (altura * altura);
         * label.setText(String.valueOf(s));
         * });
         */

    }
}