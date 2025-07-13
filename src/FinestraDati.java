import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class FinestraDati {
    public static void main(String[] args) {

        JFrame finestra = new JFrame("Dati Persona");
        finestra.setSize(600, 525);
        finestra.getContentPane().setBackground(Color.white);

        finestra.setLayout(new java.awt.FlowLayout());

        Persona persona1 = new Persona();

        JLabel campoNome = new JLabel("Inserisci Nome e");
        //campoNome.setBounds(250, 10, 200, 10);
        JTextField textFieldNome = new JTextField(12);
        //textFieldNome.setBounds(250, 30, 100, 20);

        JLabel campoCognome = new JLabel("Cognome:");
        //campoCognome.setBounds(250, 50, 200, 10);
        JTextField textFieldCognome = new JTextField(12);
        //textFieldCognome.setBounds(250, 80, 100, 20);

        JButton button = new JButton("Mostra dati");
        //button.setBounds(250, 100, 200, 20);
        JLabel outputLabel = new JLabel("");
        //campoNome.setBounds(250, 120, 400, 20);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //nome
                persona1.nome = textFieldNome.getText();

                //cognome
                persona1.cognome = textFieldCognome.getText();
                if (!Objects.equals(persona1.nome, "") && !Objects.equals(persona1.cognome, "")) {
                    outputLabel.setText("Hai inserito " + persona1.presentati());
                } else if (!Objects.equals(persona1.nome, "")) {
                    outputLabel.setText("Non hai inserito il cognome");
                } else if (!Objects.equals(persona1.cognome, "")) {
                    outputLabel.setText("Non hai inserito il nome");
                } else {
                    outputLabel.setText("Non hai inserito niente");
                }
            }
        });

        finestra.add(campoNome);
        finestra.add(campoCognome);
        finestra.add(textFieldNome);
        finestra.add(textFieldCognome);
        finestra.add(button);
        finestra.add(outputLabel);
        finestra.setVisible(true);
    }
}
