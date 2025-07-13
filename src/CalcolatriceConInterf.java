import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcolatriceConInterf {
    public static void main(String[] args) {

        Numero numero1 = new Numero();
        Numero numero2 = new Numero();

        JFrame finestraCalc = new JFrame("Calcolatrice molto bella");
        finestraCalc.setSize(350, 300);
        finestraCalc.getContentPane().setBackground(Color.DARK_GRAY);
        finestraCalc.setVisible(true);
        finestraCalc.setResizable(false);

        //finestraCalc.setLayout(new java.awt.FlowLayout());
        finestraCalc.setLayout(null);

        /*JLabel campoNumero1 = new JLabel("Primo numero:");
        JTextField textFieldNumero1 = new JTextField(10);
        finestraCalc.add(campoNumero1);
        finestraCalc.add(textFieldNumero1);*/

        JLabel campoNumero2 = new JLabel("Inserisci numero:");
        finestraCalc.add(campoNumero2);
        campoNumero2.setFont(new Font("Arial", Font.BOLD, 15));
        campoNumero2.setForeground(Color.lightGray);
        campoNumero2.setBounds(100,5,140,20);





        JTextField textFieldNumero2 = new JTextField(12);
        finestraCalc.add(textFieldNumero2);
        textFieldNumero2.setFont(new Font("Arial", Font.BOLD, 13));
        textFieldNumero2.setBackground(new Color(240,240,240));
        textFieldNumero2.setBorder(new LineBorder(Color.lightGray,1));
        textFieldNumero2.setBounds(90,30,140,20);

        JButton bottoneAddizione = new JButton("+");
        finestraCalc.add(bottoneAddizione);
        bottoneAddizione.setFont(new Font("Arial", Font.BOLD, 11));
        bottoneAddizione.setBackground(new Color(210,210,210));
        bottoneAddizione.setFocusPainted(false);
        bottoneAddizione.setBounds(80,60,40,40);

        JButton bottoneSottrazione = new JButton("-");
        finestraCalc.add(bottoneSottrazione);
        bottoneSottrazione.setFont(new Font("Arial", Font.BOLD, 14));
        bottoneSottrazione.setBackground(new Color(210,210,210));
        bottoneSottrazione.setFocusPainted(false);
        bottoneSottrazione.setBounds(120,60,40,40);

        JButton bottoneMoltiplicazione = new JButton("x");
        finestraCalc.add(bottoneMoltiplicazione);
        bottoneMoltiplicazione.setFont(new Font("Arial", Font.BOLD, 11));
        bottoneMoltiplicazione.setBackground(new Color(210,210,210));
        bottoneMoltiplicazione.setFocusPainted(false);
        bottoneMoltiplicazione.setBounds(160,60,40,40);

        JButton bottoneDivisione = new JButton(":");
        finestraCalc.add(bottoneDivisione);
        bottoneDivisione.setFont(new Font("Arial", Font.BOLD, 14));
        bottoneDivisione.setBackground(new Color(210,210,210));
        bottoneDivisione.setFocusPainted(false);
        bottoneDivisione.setBounds(200,60,40,40);

        JLabel outputRisultato = new JLabel("");
        finestraCalc.add(outputRisultato);
        outputRisultato.setFont(new Font("Arial", Font.BOLD, 13));
        outputRisultato.setForeground(Color.lightGray);
        outputRisultato.setBounds(115,100,250,50);

        //int risultato = 0;

        bottoneAddizione.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //numero1.valore = textFieldNumero1.getText();

                numero2.valore = Integer.parseInt(textFieldNumero2.getText());

                numero1.valore = numero1.valore + numero2.valore;

                outputRisultato.setText("Risultato: " + numero1.valore);
            }
        });
        bottoneSottrazione.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //numero1.valore = textFieldNumero1.getText();

                numero2.valore = Integer.parseInt(textFieldNumero2.getText());

                numero1.valore = numero1.valore - numero2.valore;

                outputRisultato.setText("Risultato: " + numero1.valore);
            }
        });
        bottoneMoltiplicazione.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //numero1.valore = textFieldNumero1.getText();

                numero2.valore = Integer.parseInt(textFieldNumero2.getText());

                numero1.valore = numero1.valore * numero2.valore;

                outputRisultato.setText("Risultato: " + numero1.valore);
            }
        });
        bottoneDivisione.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                //numero1.valore = textFieldNumero1.getText();

                numero2.valore = Integer.parseInt(textFieldNumero2.getText());

                numero1.valore = numero1.valore / numero2.valore;

                outputRisultato.setText("Risultato: " + numero1.valore);
            }
        });

        /*JLabel campoRisultato = new JLabel("Risultato: " + risultato);
        finestraCalc.add(campoNumero1);
        finestraCalc.add(textFieldNumero1);*/
    }
}
