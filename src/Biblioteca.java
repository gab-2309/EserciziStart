import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biblioteca {
    public static void main(String[] args) {

        Libro[] libri = new Libro[2];

        //test
        Libro libro1 = new Libro();
        libro1.setTitolo("Mirco trova l'amore");
        libro1.setAnnoPubblicazione("AnnoPubblicazione");
        libro1.setGenere("Genere");
        libro1.setISBN("ISBN");
        libri[0] = libro1;

        Libro libro2 = new Libro();
        libro2.setTitolo("La Rivincita di Willipet");
        libro2.setAnnoPubblicazione("2025");
        libro2.setGenere("Drammatico/Biografico");
        libro2.setISBN("ISBN212341224");
        libri[1] = libro2;


        JFrame finestraBibli = new JFrame("Bibliotecatore 2000");
        finestraBibli.setSize(500, 500);
        finestraBibli.getContentPane().setBackground(Color.DARK_GRAY);
        finestraBibli.setVisible(true);
        //.setResizable(false);

        finestraBibli.setLayout(new java.awt.FlowLayout());
        //.setLayout(null);

        JLabel titoloFinestra = new JLabel("BIBLIOTECATORE 2000");
        finestraBibli.add(titoloFinestra);
        titoloFinestra.setFont(new Font("Arial", Font.BOLD, 20));
        titoloFinestra.setForeground(Color.white);

        JButton bottoneInserisciLibro = new JButton("Inserisci Libro");
        finestraBibli.add(bottoneInserisciLibro);

        JButton bottoneCercaLibro = new JButton("Cerca Libro");
        finestraBibli.add(bottoneCercaLibro);

        JButton bottoneElenco = new JButton("Elenco Libri");
        finestraBibli.add(bottoneElenco);

        JButton bottoneRimuoviLibro = new JButton("Cancella Libro");
        finestraBibli.add(bottoneRimuoviLibro);

        JButton bottoneEsci = new JButton("Esci");
        finestraBibli.add(bottoneEsci);


        JLabel cercaLibro = new JLabel("");
        finestraBibli.add(cercaLibro);
        cercaLibro.setFont(new Font("Arial", Font.BOLD, 17));
        cercaLibro.setForeground(Color.lightGray);
        //.setBounds(93,5,140,20);

        JTextField campoTestoCerca = new JTextField(12);
        finestraBibli.add(campoTestoCerca);
        campoTestoCerca.setFont(new Font("Arial", Font.BOLD, 15));
        campoTestoCerca.setBackground(new Color(240, 240, 240));
        campoTestoCerca.setBorder(new LineBorder(Color.lightGray, 1));
        //.setBounds(85,28,150,25);
        campoTestoCerca.setVisible(false);

        JButton bottoneCerca = new JButton("Cerca");
        finestraBibli.add(bottoneCerca);
        //.setFont(new Font("Arial", Font.BOLD, 11));
        //.setBackground(new Color(210,210,210));
        //.setFocusPainted(false);
        //.setBounds(80,60,40,40);
        bottoneCerca.setVisible(false);

        JButton bottoneIndietro1 = new JButton("Indietro");
        finestraBibli.add(bottoneIndietro1);
        bottoneIndietro1.setVisible(false);


        bottoneCercaLibro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent CercaLibro) {

                bottoneCercaLibro.setVisible(false);
                bottoneElenco.setVisible(false);
                bottoneRimuoviLibro.setVisible(false);
                bottoneInserisciLibro.setVisible(false);
                bottoneEsci.setVisible(false);
                cercaLibro.setText("Cerca Libro:");
                campoTestoCerca.setVisible(true);
                bottoneCerca.setVisible(true);
                bottoneIndietro1.setVisible(true);


                JLabel outputRisultato = new JLabel("");
                finestraBibli.add(outputRisultato);
                outputRisultato.setFont(new Font("Arial", Font.BOLD, 16));
                outputRisultato.setForeground(Color.lightGray);
                //.setBounds(110,100,250,50);

                bottoneCerca.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Cerca) {
                        if (campoTestoCerca.getText().isEmpty()){
                            return;
                        }
                            for (int i = 0; i < libri.length; i++) {
                                System.out.println(libri[i].getTitolo());
                                if (libri[i].getTitolo().toLowerCase().contains(campoTestoCerca.getText().toLowerCase())) {
                                    outputRisultato.setText(libri[i].getInfoLibro());
                                    outputRisultato.setForeground(Color.lightGray);
                                    break;
                                } else {
                                    outputRisultato.setText("Libro non trovato");
                                    outputRisultato.setForeground(Color.red);
                                }
                            }
                    }
                });

                bottoneIndietro1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Indietro1) {
                        bottoneCercaLibro.setVisible(true);
                        bottoneElenco.setVisible(true);
                        bottoneRimuoviLibro.setVisible(true);
                        bottoneInserisciLibro.setVisible(true);
                        bottoneEsci.setVisible(true);
                        cercaLibro.setText("");
                        campoTestoCerca.setVisible(false);
                        bottoneCerca.setVisible(false);
                        bottoneIndietro1.setVisible(false);
                        outputRisultato.setText("");
                    }
                });
            }
        });

        bottoneElenco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Elenco) {

                bottoneCercaLibro.setVisible(false);
                bottoneElenco.setVisible(false);
                bottoneRimuoviLibro.setVisible(false);
                bottoneInserisciLibro.setVisible(false);
                bottoneEsci.setVisible(false);

                JButton bottoneIndietro2 = new JButton("Indietro");
                finestraBibli.add(bottoneIndietro2);
                bottoneIndietro2.setVisible(true);


                JPanel panelElenco = new JPanel();
                panelElenco.setLayout(new BoxLayout(panelElenco, BoxLayout.Y_AXIS));

                JLabel libriNonTrovati = new JLabel("");
                finestraBibli.add(libriNonTrovati);
                libriNonTrovati.setFont(new Font("Arial", Font.BOLD, 16));
                //.setBounds(110,100,250,50);

                for (int i = 0; i < libri.length; i++) {
                    if (!libri[i].equals(null)) {
                        JLabel labelLibro = new JLabel(libri[i].getInfoLibro());
                        labelLibro.setFont(new Font("Arial", Font.BOLD, 17));
                        labelLibro.setPreferredSize(new Dimension(400, 100));
                        panelElenco.add(labelLibro);
                    } else {
                        libriNonTrovati.setText("Non ci sono libri");
                        libriNonTrovati.setForeground(Color.red);
                    }
                }

                JScrollPane outputElenco = new JScrollPane(panelElenco);
                outputElenco.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                outputElenco.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                panelElenco.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));

                finestraBibli.add(outputElenco);

                bottoneIndietro2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Indietro2) {
                        bottoneCercaLibro.setVisible(true);
                        bottoneElenco.setVisible(true);
                        bottoneRimuoviLibro.setVisible(true);
                        bottoneInserisciLibro.setVisible(true);
                        bottoneEsci.setVisible(true);
                        libriNonTrovati.setText("");
                        bottoneIndietro2.setVisible(false);
                        outputElenco.setVisible(false);
                    }
                });
            }
        });

        bottoneRimuoviLibro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent RimuoviLibro) {
                bottoneCercaLibro.setVisible(false);
                bottoneElenco.setVisible(false);
                bottoneRimuoviLibro.setVisible(false);
                bottoneInserisciLibro.setVisible(false);
                bottoneEsci.setVisible(false);

                JLabel qualeRimuovere = new JLabel("Scegli un Libro da rimuovere");
                finestraBibli.add(qualeRimuovere);
                qualeRimuovere.setFont(new Font("Arial", Font.BOLD, 17));
                qualeRimuovere.setForeground(Color.lightGray);

                JTextField campoTestoRimuovi = new JTextField(12);
                finestraBibli.add(campoTestoRimuovi);
                campoTestoRimuovi.setFont(new Font("Arial", Font.BOLD, 15));
                campoTestoRimuovi.setBackground(new Color(240, 240, 240));
                campoTestoRimuovi.setBorder(new LineBorder(Color.lightGray, 1));
                //.setBounds(85,28,150,25);
                campoTestoRimuovi.setVisible(true);

                JLabel outputRisultato = new JLabel("");
                finestraBibli.add(outputRisultato);
                outputRisultato.setFont(new Font("Arial", Font.BOLD, 16));
                outputRisultato.setForeground(Color.lightGray);
                //.setBounds(110,100,250,50);

                JButton bottoneRimuvi = new JButton("Rimuovi");
                finestraBibli.add(bottoneRimuvi);
                bottoneRimuvi.setVisible(true);

                bottoneRimuvi.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Rimuovi) {
                        for (int i = 0; i < libri.length; i++) {
                            if (libri[i].titolo.equals(campoTestoCerca.getText())) {
                                outputRisultato.setText("Libro " + libri[i].titolo + " Rimosso");
                                libri[i] = null;
                                outputRisultato.setForeground(Color.lightGray);
                            } else {
                                outputRisultato.setText("Il libro non esiste");
                                outputRisultato.setForeground(Color.red);
                            }
                        }
                    }
                });

                JButton bottoneIndietro = new JButton("Indietro");
                finestraBibli.add(bottoneIndietro);
                bottoneIndietro.setVisible(true);

                bottoneIndietro.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent Indietro2) {
                        bottoneCercaLibro.setVisible(true);
                        bottoneElenco.setVisible(true);
                        bottoneRimuoviLibro.setVisible(true);
                        bottoneInserisciLibro.setVisible(true);
                        bottoneEsci.setVisible(true);
                        outputRisultato.setText("");
                        qualeRimuovere.setText("");
                        campoTestoCerca.setVisible(false);
                        bottoneIndietro.setVisible(false);
                        campoTestoRimuovi.setVisible(false);
                        bottoneRimuvi.setVisible(false);
                    }
                });
            }
        });

        //Per chiudere il Bibliotecatore 2000

        bottoneEsci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Esci) {
                System.exit(0);

            }
        });

        finestraBibli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
