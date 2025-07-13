import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaSenzaInterfaccia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean bibliotecatoreAcceso = true;

        ArrayList<Libro> libri = new ArrayList<Libro>();

        do {
            System.out.println("""
                    Bibliotecatore 2000
                    1 - Cerca Libro
                    2 - Elenco Libri
                    3 - Aggiungi Libri
                    4 - Rimuovi Libro
                    X - Esci
                    """);
            String selezione = input.nextLine().toUpperCase();

            switch (selezione) {

                case "1":

                    if (!libri.isEmpty()) {
                        boolean libroTrovato = false;
                        System.out.println("Cerca libro: ");
                        String cercaTitolo = input.nextLine();
                        for (int i = 0; i < libri.size(); i++) {
                            if (libri.get(i).getInfoLibro().contains(cercaTitolo)) {
                                System.out.println("Libri Trovati: \n" + libri.get(i).getInfoLibro());
                                libroTrovato = true;
                            }
                        }
                        if (!libroTrovato) {
                            System.out.println("Nessun libro Trovato");
                        }

                    } else {
                        System.out.println("Non ci sono Libri Salvati");
                    }

                    break;

                case "2":
                    if (!libri.isEmpty()) {
                        System.out.println("Elenco Libri: ");
                        for (int i = 0; i < libri.size(); i++) {
                            System.out.println(libri.get(i).getInfoLibro() + "\n ----------");
                        }
                    } else {
                        System.out.println("Non ci sono Libri Salvati");
                    }
                    break;


                case "3":
                    System.out.println("Quanti Libri Vuoi aggiungere? ");
                    int numeroDaAggiungere = input.nextInt();

                    input.nextLine();

                    for (int i = 0; i < numeroDaAggiungere; i++) {
                        Libro nuovoLibro = new Libro();

                        System.out.println("Inserisci il Titolo del Libro: ");
                        nuovoLibro.setTitolo(input.nextLine());

                        System.out.println("Inserisci l'anno di Pubblicazione: ");
                        nuovoLibro.setAnnoPubblicazione(input.nextLine());

                        System.out.println("Inserisci il Genere del libro: ");
                        nuovoLibro.setGenere(input.nextLine());

                        System.out.println("Inserisci il Codice ISBN: ");
                        nuovoLibro.setISBN(input.nextLine());

                        libri.add(nuovoLibro);
                        System.out.println("Libro aggiunto con successo!");
                    }

                    break;

                case "4":
                    System.out.println("Scegli il libro da rimovere: ");
                    if (!libri.isEmpty()) {
                        for (int i = 0; i < libri.size(); i++) {
                            System.out.println((i + 1) + " - " + libri.get(i).getTitolo());
                        }
                        int scelta = input.nextInt() - 1;
                        input.nextLine();

                        if (scelta >= 0 && scelta <= libri.size()) {
                            System.out.println("Libro " + libri.get(scelta).getTitolo() + " Rimosso...");
                            libri.remove(scelta);
                        } else {
                            System.out.println("Scelta non valida! Inserisci un numero tra 1 e " + libri.size());
                        }
                    } else {
                        System.out.println("Non ci sono Libri Salvati");
                    }
                    break;

                case "X":
                    System.out.println("Spegnimento del Bibliotecatore 2000... ");
                    bibliotecatoreAcceso = false;
                    break;
            }
        } while (bibliotecatoreAcceso);

        input.close();
    }
}

