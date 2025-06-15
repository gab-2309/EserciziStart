package CodeAbbey;

import java.util.Scanner;

public class Sum_In_Loop {
    public static void main(String[] args) {

//30
//1069 79 784 1165 858 83 176 608 436 786 255 693 415 503 191 17 215 640 1137 314 791 74 266 203 770 1196 966 811 1044 1144

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int somma = 0;
        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            somma += numero;
        }
        System.out.println(somma);
    }
}
