package EserciziArray;

public class EsercizioArray3 {
    public static void main(String[] args) {

// Crea un array di Integer di 10 elementi, assegna tu il valore degli elementi.
// Tramite loop, conta quanti numeri pari e quanti numeri dispari ci sono e stampa:
// "Numeri Pari: [num]"
// "Numeri Dispari: [num]"

        int[] numeri = {11, 56, 32, 321, 33, 39, 78, 41, 12, 45};

        int numPari = 0;
        int numDispari = 0;

        for (int i = 0; i <= numeri.length - 1; i++) {

            numeri[i] = numeri[i]%2;
            if (numeri[i] == 0){
                numPari++;
            } else {
                numDispari++;
            }
        }

        System.out.println("Numeri Pari: " + numPari);
        System.out.println("Numeri Dispari: " + numDispari);
    }
}
