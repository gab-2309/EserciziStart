package EserciziArray;

import java.util.Scanner;

public class EsercizioArray7 {
    public static void main(String[] args) {
//Sei stato assegnato per aiutare il buttafuori di questo locale VIP.
//Crea un array di Stringhe, e chiamalo "listaNomi", e inserisci nell'array dei nomi a tua scelta.
//Chiedi all'utente di scrivere un nome e conserva l'input in una stringa.
//Tramite loop, controlla se l'input dell'utente è presente nell'array,
//se non è presente stampa "Il nome inserito non è nella lista",
//se invece è presente, stampa "{nome} è nella lista" e la sua posizione (nella lista).
//
//es:
//"L'invitato {nome} è nella lista, in posizione {posizione}"
//
//Nota:
//Le lista in vita reale non partono da 0, ma da 1.

        Scanner sc = new Scanner(System.in);

        String[] listaNomi = {"Mario", "Filippo", "Carlo", "Teresa", "Giovanna", "Pippo", "Claudia", "Elsa" };

        System.out.println("Inserisci il nome: ");
        String nome = sc.nextLine();

        int conteggioLista = 0;

        for (int i = 0; i < listaNomi.length; i++) {
            if (listaNomi[i].toLowerCase().equals(nome)) {
                conteggioLista++;
                System.out.println("L'invitato " + nome + " è nella lista, in posizione " + conteggioLista);
                break;
            }
            conteggioLista++;
            if (conteggioLista == listaNomi.length) {
                System.out.println("Il nome inserito non è nella lista");
            }

        }
    }
}
