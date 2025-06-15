package CodeAbbey;

import java.util.Scanner;

public class Minimum_of_Three {
    public static void main(String[] args) {

//25
//-4713225 7977593 -5632777
//9276275 -2610175 7701131
//-7600441 6345334 4879136
//1566268 4600302 -9991220
//-5734963 5009410 -8895557
//-7097732 4959053 -3267887
//-7888255 -2912829 -1036745
//3581192 5279527 7863469
//8225233 9829535 6006085
//6032410 9819884 9652645
//-6596339 520483 1477247
//1247031 1243429 -9034774
//9654829 -9038877 7741710
//-1746888 3371049 -1918862
//2459450 -4788534 -2806723
//-4893644 3259364 4195086
//-6110367 -4716880 -6104648
//8403035 6803727 -3634698
//6450776 7616327 1664266
//3176266 -660693 -4889212
//9035325 4559040 -3694184
//-8019299 -6600257 3836491
//-5202969 247473 1348612
//7589796 1956029 4905821
//6345251 -1916066 -7110767

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();
            int numero3 = sc.nextInt();
            if (numero1 < numero2 && numero1 < numero3) {
                System.out.print(numero1 + " ");
            } else if (numero2 < numero1 && numero2 < numero3) {
                System.out.print(numero2 + " ");
            } else {
                System.out.print(numero3 + " ");
            }
        }
        sc.close();
    }
}
