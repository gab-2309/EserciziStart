package SpiegazioniMatrici;

public class SpigazMatriccc {
    public static void main(String[] args) {

        // stampare un singolo elemento
//        int[][] array = {
//              // 0  1  2
//                {1, 2, 3}, // 0
//                {4, 5, 6}, // 1
//                {7, 8, 9}, // 2
//                {10, 11, 12}}; // 3
////        System.out.println(array[0][1]);

        //  stampare tutti gli elementi dell'array 2d
//        for (int colonna = 0; colonna < array.length; colonna++) {
//            for (int riga = 0; riga < array[0].length; riga++) {
//                System.out.print(array[colonna][riga] + " ");
//
//            }
//            System.out.println();
//        }
//    }




        char[][] griglia = new char[5][5];
        for(int i = 0; i < griglia.length; i++){
            for(int j = 0; j < griglia[0].length; j++){
                griglia[i][j] = '.';
            }
        }

        griglia[4][2] = 'a';

        for(int i = 0; i < griglia.length; i++){
            for(int j = 0; j < griglia[0].length; j++){
                System.out.print(griglia[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < griglia.length; i++){
            for(int j = 0; j < griglia[0].length; j++){
                if (griglia[i][j] != '.'){
                    System.out.println("Carattere sconosciuto in posizione: " + i + " " + j);
                }
            }
        }

    }
}
