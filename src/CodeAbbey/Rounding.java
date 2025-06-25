package CodeAbbey;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            double risultato = (double) num1 / num2;

            double parteDeciamale = Math.abs(risultato%1);

            if (parteDeciamale == 0.5) {
                if (risultato > 0) {
                    risultato += parteDeciamale;
                } else {
                    risultato -= parteDeciamale;
                }
            }
            System.out.print((int) Math.round(risultato) + " ");
        }
    }
}
