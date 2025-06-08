
// Esercizio 1: Somma dei numeri da 1 a N
//Scrivi un programma che chiede all’utente di inserire un numero intero N
//somma tutti i numeri da 1 a N usando un ciclo for
//stampa il risultato

import java.util.Scanner;

public class EsercizioFor1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int n = input.nextInt();
        int sommaNumeri = 0;

        for (int i = 1; i <= n; i++) {
            sommaNumeri += i;
        }
        System.out.println("La somma dei numeri da 1 a " + n + " è " + sommaNumeri);
    }
}
