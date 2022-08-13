import java.util.PropertyResourceBundle;

import javax.swing.InputMap;
import javax.swing.JOptionPane;

public class Imc {

    public static void main(String[] args) {
        var peso = Double.parseDouble(JOptionPane.showInputDialog("Olá digite seu peso"));
        var altura = Double.parseDouble(JOptionPane.showInputDialog("Olá digite sua altura")) / 100;
        var s = peso / (altura * altura);

        System.out.println(s);
    }
}