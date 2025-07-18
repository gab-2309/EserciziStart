package SpiegazioniMatrici;

public class EsercizioMatrice1 {
    public static void main(String[] args) {

        // 1. Somma degli elementi di una matrice
        // Scrivi un programma che calcola la somma di tutti gli elementi in una matrice di interi.

        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int somma = 0;
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[0].length; j++){
                somma = somma + matrice[i][j];
            }
        }
        System.out.println(somma);
    }
}
