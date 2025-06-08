
//Esercizio 2: Tabellina del numero
//Scrivi un programma che chiede un numero intero tra 1 e 10(per bonus points aggiungi un messaggio d'errore se il numero è >10)
//
//stampa la sua tabellina
//es:
//Se l'utente scrive "3" stampa 3 x 1 = 3\n3 x 2 = 6 ecc ecc...

import java.util.Scanner;

public class EsercizioFor2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero intero da 1 a 10: ");
        int numero = input.nextInt();

        if (numero <= 10 && numero >= 1) {
            System.out.println("Tabellina del " + numero + "\n");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } else {
            System.out.println("ERROR3: NVM3R0 N0N V4L1D0");
        }

    }

}
