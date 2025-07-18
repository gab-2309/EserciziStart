package SpiegazioniMatrici;

import java.util.ArrayList;
import java.util.Collections;

public class EsercizioMatrice2 {
    public static void main(String[] args) {

//        Esercizio 2:
//        Trova il massimo e il minimo in una matrice
//        Scrivi un programma che trova il valore massimo e il valore minimo in una matrice di interi.
        int[][] matrice = {{18, 25, 3000}, {43, 5, 62}, {7, 8, 90}};

        ArrayList<Integer> numeri = new ArrayList<>();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                numeri.add(matrice[i][j]);
            }
        }
        int numMin = numeri.get(0), numMax = numeri.get(0);

        for (int i = 0; i < numeri.size(); i++) {
            if (numMin > numeri.get(i)) {
                numMin = numeri.get(i);
            }
            if (numMax < numeri.get(i)) {
                numMax = numeri.get(i);
            }
        }


        System.out.println("Numero minore: " + numMin + " Numero Maggiore: " + numMax);
    }
}
