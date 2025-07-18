package SpiegazioniMatrici;

import java.util.ArrayList;

public class EsercizioMatrice3 {
    public static void main(String[] args) {

//        Esercizio 3:
//        Somma delle righe e delle colonne
//        Calcola la somma degli elementi di ciascuna riga e di ciascuna colonna.

        int[][] matrice = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };
        ArrayList<Integer> sommeOriz = new ArrayList<>();
        ArrayList<Integer> sommeVert = new ArrayList<>();
        int somma = 0;

        for (int i = 0; i < matrice.length; i++) {

            for (int j = 0; j < matrice[i].length; j++) {
                somma += matrice[i][j];
            }
            sommeOriz.add(somma);
            somma = 0;

            for (int v = 0; v < matrice[i].length; v++){
                somma += matrice[v][i];
            }
            sommeVert.add(somma);
            somma = 0;
        }

        System.out.println("Somme Orizzontali: " + sommeOriz + "\nSomme Verticali: " + sommeVert);
    }
}
