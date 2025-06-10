package EserciziArray;

import java.util.Scanner;

public class EsercizioArray6 {
    public static void main(String[] args) {

        //Scrivi un programma che chiederà all'utente di elencare la sua top 5 dei cibi preferiti, e conserva
        // le risposte in un array di stringhe.
        //Tuttavia, crea l'array in modo che possa solo contenere un massimo di 3 stringhe.
        //Dopo che l'utente ha scritto il suo terzo cibo preferito, stampa il messaggio:
        //"Spazio memoria insufficiente", e poi stampa i contenuti dell'array in questo formato:
        //Top 5 cibi preferiti
        //-Pasta al tonno
        //-Lasagne
        //-Pollo fritto
        //
        //Nota:
        //Per questo programma, conviene usare il metodo "scanner.nextLine()" , poichè se l'utente dovesse scrivere
        //"Pasta al sugo", un comando "scanner.next()" prenderebbe solo "pasta".

        Scanner sc = new Scanner(System.in);

        String[] risposte = new String[3];

        System.out.println("Elenca la top 5 dei tuoi cibi preferiti: ");
        for (int i = 0; i < risposte.length; i++) {
            risposte[i] = sc.nextLine();

        }

        System.out.println("\nSpazio memoria insufficiente \nTop 5 cibi preferiti");
        for (String cibiPreferiti : risposte) {
            System.out.println(cibiPreferiti);
        }
    }
}
