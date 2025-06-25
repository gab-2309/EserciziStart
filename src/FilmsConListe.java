import java.util.ArrayList;
import java.util.Scanner;

public class FilmsConListe {
    public static void main(String[] args) {
//Implementare le seguenti operazioni:
//1. Inserisci un Chiedere Nome Film, Anno Pubblcazione, GenereFilm
//2. Visualizza tutti i film
//3. Cancella tutti i film
//4. Cancella un film per posizione
//5. Visualizza il numero totale di film
//6. Ricercare un film per titolo
//-> Utente può digitare un titolo, controllare se è registrato oppure no.
//Utilizzare il metodo equals() per confrontare due stringhe
//X. Esci dal programma

//        .get(indice) per prendere un elemento
//        .indexOf(nomeElemento) per prendere l'indice di un elemento
//        .add(valore) per aggiungere un elemento
//        .contains(elemento) restiuisce true o false se contiene o no l'elemento
//        .remove(indice/valoreElemento) rimuove l'elemento
//        .clear() rimuove tutto dalla lista

        ArrayList<String> nomiFilm = new ArrayList<>();
        ArrayList<String> dateUscita = new ArrayList<>();
        ArrayList<String> generi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ------------Menu------------
                1 - Aggiungi film alla lista
                2 - Visualizza lista
                3 - Cancella tutti i film
                4 - Cancella film per posizione
                5 - Visualizza numero totale film
                6 - Cerca film per titolo
                7 - Visualizza menù
                X - Esci""");
        boolean listando = true;

        while (listando) {

            String selezione = sc.nextLine().toLowerCase();

            switch (selezione) {
                case "1":
                    System.out.println("Inserisci il nome del film: ");
                    String nomeFilm = sc.nextLine();
                    nomiFilm.add(nomeFilm);
                    System.out.println("Inserisci l'anno di uscita: ");
                    dateUscita.add(sc.nextLine());
                    System.out.println("Inserisci il genere del film: ");
                    generi.add(sc.nextLine());
                    System.out.println("Film \"" + nomeFilm + "\" aggiunto alla lista :)");
                    break;
                case "2":
                    if (nomiFilm.isEmpty()) {
                        System.out.println("Non ci sono Film nella lista");
                        break;
                    }
                    System.out.println("------------Lista Film------------");
                    for (int i = 0; i < nomiFilm.size(); i++) {
                        System.out.println((i + 1) + "° - \"" + nomiFilm.get(i) + "\" " + dateUscita.get(i) + " " + generi.get(i));
                    }
                    break;
                case "3":
                    System.out.println("Cancellati tutti i film...");
                    nomiFilm.clear();
                    dateUscita.clear();
                    generi.clear();
                    break;
                case "4":
                    System.out.println("Inserisci il numero di un film da eliminare: ");
                    int posizioneFilm = sc.nextInt() - 1;
                    if (posizioneFilm > nomiFilm.size()) {
                        System.out.println("Numero non valido");
                        break;
                    }
                    System.out.println("Film rimosso: \"" + nomiFilm.get(posizioneFilm) + "\"");
                    nomiFilm.remove(posizioneFilm);
                    dateUscita.remove(posizioneFilm);
                    generi.remove(posizioneFilm);
                    break;
                case "5":
                    System.out.println("Numero totale di film: " + nomiFilm.size());
                    break;
                case "6":
                    boolean isTrovato = false;
                    System.out.println("Inserisci il nome del film da cercare: ");
                    String ricercaNome = sc.nextLine();
                    for (String film : nomiFilm) {

                        if (film.equalsIgnoreCase(ricercaNome)) {
                            int indice = nomiFilm.indexOf(film);
                            System.out.println("\"" + nomiFilm.get(indice) + "\" " + dateUscita.get(indice) + " " + generi.get(indice));
                            isTrovato = true;
                            break;
                        }
                    }
                    if (!isTrovato) {
                        System.out.println("Il Film \"" + ricercaNome + "\" non esiste");
                    }
                    break;

                case "7":
                    System.out.println("""
                            ------------Menu------------
                            1 - Aggiungi film alla lista
                            2 - Visualizza lista
                            3 - Cancella tutti i film
                            4 - Cancella film per posizione
                            5 - Visualizza numero totale film
                            6 - Cerca film per titolo
                            7 - Visualizza menù
                            X - Esci""");
                case "x":
                    System.out.println("Spegnimentazione dell'avanzato sistema di salvamento dei films...");
                    listando = false;
                    break;
                default:
                    System.out.println("""
                            Numero non valido
                            
                             ------------Menu------------
                            1 - Aggiungi film alla lista
                            2 - Visualizza lista
                            3 - Cancella tutti i film
                            4 - Cancella film per posizione
                            5 - Visualizza numero totale film
                            6 - Cerca film per titolo
                            7 - Visualizza menù
                            X - Esci""");
            }
        }
    }
}
