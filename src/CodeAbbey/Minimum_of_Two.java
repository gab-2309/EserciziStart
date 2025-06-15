package CodeAbbey;

import java.util.Scanner;

public class Minimum_of_Two {
    public static void main(String[] args) {

//23
//6421206 7659032
//7492841 -9994130
//-2220342 826092
//-2426954 -3413267
//-6532160 -7441540
//-8481886 2334602
//-1225540 -7198600
//8605110 -9130261
//5539850 2058698
//9475780 3204722
//-1617167 -5553063
//-7245625 -1045069
//8804009 -9559587
//-7678804 -2879153
//1763791 9052861
//-1719727 -6906937
//5377299 -7872014
//-9352826 1416514
//-6143960 -1939725
//8463345 -8145934
//768010 4029471
//8168466 -3913233
//-2026971 -2852767
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numeroPiuBasso = new int[n];

        for (int i = 0; i < n; i++) {
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            if (numero1 < numero2) {
                numeroPiuBasso[i] = numero1;
            } else {
                numeroPiuBasso[i] = numero2;
            }
            System.out.print(numeroPiuBasso[i] + " ");
        }
        sc.close();
    }
}
