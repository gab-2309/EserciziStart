package CodeAbbey;

import java.util.Scanner;

public class Sums_In_Loop {
    public static void main(String[] args) {
//12
//866383 519455
//146901 635528
//632183 415488
//915588 79160
//120471 131585
//201266 443660
//248387 943342
//827518 353541
//205732 453890
//875233 508946
//606957 346532
//536359 668949

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] sommeNumeri = new int[n];

        for (int i = 0; i < n; i++) {
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            int somma = numero1 + numero2;
            sommeNumeri[i] = somma;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sommeNumeri[i] + " ");
        }
    }
}
