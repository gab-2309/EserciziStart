
//Esercizio 3: Fattoriale di un numero
//Scrivi un programma che chiede un numero intero N, e calcola il fattoriale
//stampa il risultato
//es: 5! = 5*4*3*2*1 = 120)
//hint: così come c'è ++ come simbolo di incremento, esiste anche --

import java.util.Scanner;

public class EsercizioFor3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        long numero = input.nextInt();
        long fattoriale = 1;


        for (long i = numero; i >= 1; i--) {

            System.out.println(fattoriale + " * " + i + " = " + (fattoriale *= i));
        }

    }
}
