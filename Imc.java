
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Imc {

    /**
     * @param args
     */
    public static void main(String[] args) {

        JFrame f = new JFrame("Calcular IMC");

        f.setSize(250, 320);
        // Set the layout
        f.setLayout(null);
        f.setResizable(false);

        // Create label
        JLabel labelnome = new JLabel("Seu nome: ");
        JLabel labelidade = new JLabel("Sua idade: ");
        JLabel labelpeso = new JLabel("Seu peso :");
        JLabel labelaltura = new JLabel("Sua altura: ");

        JLabel labelresultadonome = new JLabel("Resultado nome aqui");
        JLabel labelresultadoidade = new JLabel("Resultado idade aqui");
        JLabel labelresultadopeso = new JLabel("Resultado peso aqui");
        JLabel labelresultadoaltura = new JLabel("Resultado altura aqui");
        JLabel labellinha = new JLabel("=============================");
        JLabel labelsobre = new JLabel("Resultado da tabela IMC");
        JLabel labelresultadotabela = new JLabel("Sua condição fisica aqui", SwingConstants.CENTER);
        JLabel labelresultado = new JLabel("Resultado ", SwingConstants.CENTER);

        // Create button
        JButton btn = new JButton("Calcule aqui");

        // Define the position and size of the label
        labelnome.setBounds(10, 10, 200, 40);
        labelidade.setBounds(10, 25, 200, 40);
        labelpeso.setBounds(10, 40, 200, 40);
        labelaltura.setBounds(10, 55, 200, 40);

        labelresultadonome.setBounds(75, 10, 200, 40);
        labelresultadoidade.setBounds(75, 25, 200, 40);
        labelresultadopeso.setBounds(75, 40, 200, 40);
        labelresultadoaltura.setBounds(75, 55, 200, 40);
        labellinha.setBounds(10, 80, 240, 40);
        labelsobre.setBounds(10, 100, 200, 40);
        labelresultadotabela.setBounds(20, 130, 200, 40);
        labelresultadotabela.setFont(new Font("Arial", 1, 16));
        labelresultado.setBounds(20, 150, 200, 40);

        // Define the position and size of the button
        btn.setBounds(40, 220, 150, 40);
        // add obejcts of the frame
        f.add(btn);
        f.add(labelnome);
        f.add(labelidade);
        f.add(labelpeso);
        f.add(labelaltura);
        f.add(labelresultadonome);
        f.add(labelresultadoidade);
        f.add(labelresultadopeso);
        f.add(labelresultadoaltura);
        f.add(labellinha);
        f.add(labelsobre);
        f.add(labelresultadotabela);
        f.add(labelresultado);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        // action button imc
        btn.addActionListener((e) -> {
            var nome = JOptionPane.showInputDialog("Digite seu nome");
            var idade = JOptionPane.showInputDialog("Sua idade");
            var peso = Double.parseDouble(JOptionPane.showInputDialog("Olá digite seu peso"));
            var altura = Double.parseDouble(JOptionPane.showInputDialog("Olá digite sua altura")) / 100;
            var s = peso / (altura * altura);
            labelresultadonome.setText(nome);
            labelresultadoidade.setText(idade + " anos");
            labelresultadopeso.setText(peso + " Kg");
            labelresultadoaltura.setText(altura + " M");

            if (s < 17) {
                labelresultadotabela.setText("Muito abaixo do peso");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 17 && s < 18.9) {
                labelresultadotabela.setText("Abaixo do peso");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 18.9 && s < 24.99) {
                labelresultadotabela.setText("Peso normal");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 25 && s < 29.99) {
                labelresultadotabela.setText("Acima do peso");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 30 && s < 34.99) {
                labelresultadotabela.setText("Obesidade |");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 30 && s < 39.99) {
                labelresultadotabela.setText("Obesidade ||");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else if (s > 40) {
                labelresultadotabela.setText("Obesidade |||");
                labelresultado.setText(String.valueOf("IMC " + s));
            } else {

            }

        });

    }
}