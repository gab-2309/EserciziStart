package EserciziArray;

public class EsercizioArray2 {
    public static void main(String[] args) {

// Usa un loop per popolare un array di Integer (int) da 1 a 20.
// Usa un'altro loop per stampare l'array (gli elementi) al contrario.

        int[] numbs = new int[20];

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] += i + 1;
        }

        for (int i = numbs.length - 1; i >= 0; i--) {

            System.out.println(numbs[i]);
        }
    }
}