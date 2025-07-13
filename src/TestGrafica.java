import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGrafica {
    public static void main(String[] args) {
        // Creazione Finestra

        JFrame finestra = new JFrame("Esercizio Pari/Dispari");
        finestra.setSize(455, 525);
        finestra.getContentPane().setBackground(Color.white);

        finestra.setLayout(new java.awt.FlowLayout());

        //Crea i componenti
        JLabel campo = new JLabel("Inserisci un valore");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Mostra");
        JLabel outputLabel = new JLabel("");


        //Aggiungi l'azione al pulsante
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valoreInseritoUtente = textField.getText(); // Ottieni il testo del campo
                if (Integer.parseInt(valoreInseritoUtente)%2 == 0) {
                outputLabel.setText("Hai inserito pari: " + valoreInseritoUtente);
                finestra.getContentPane().setBackground(Color.green);
                } else {
                    outputLabel.setText("Hai inserito dispari: " + valoreInseritoUtente);
                    finestra.getContentPane().setBackground(Color.red);
                }
            }
        });

        finestra.add(campo);
        finestra.add(textField);
        finestra.add(button);
        finestra.add(outputLabel);
        finestra.setVisible(true);
    }
}
