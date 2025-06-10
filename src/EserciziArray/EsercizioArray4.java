package EserciziArray;

public class EsercizioArray4 {
    public static void main(String[] args) {

// Con lo stesso array dell'esercizio 3, tramite loop, Stampa solo il numero più piccolo presente nella lista.

        int[] numeri = {77, 56, 32, 321, 33, 70, 78, 41, 46, 45};

        int minore = numeri[0];

        for (int i = 0; i < numeri.length ; i++) {

            if (numeri[i] < minore) {
                minore = numeri [i];
            }

        }   System.out.println(minore);
    }
}