package EserciziArray;

public class EsercizioArray5 {
    public static void main(String[] args) {
// Crea un array di 5 double, e assegna ad ogni elemento un valore arbitrario;
// Calcola la somma degli elementi e stampa il risultato.
// Calcola la media degli elementi e stampa anche quello.

        double[] numeri = {5, 7.8, 77, 3, 12.5};
        double sommaElementi = 0;

        for (int i = 0; i < numeri.length; i++) {
        sommaElementi += numeri[i];
        }
        System.out.println(" La somma deli Elementi è " + sommaElementi);
        System.out.println(" La media degli Elementi è " + sommaElementi/numeri.length);
    }
}
