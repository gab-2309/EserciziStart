package CodeAbbey;

import java.util.Scanner;

public class Maximum_of_Array {
    public static void main(String[] args) {

//This problem introduces popular algorithm of the "linear search", which should be learnt thoroughly as it is often used in programming more complex tasks (sorting etc.)
//
//Very common operation on sequence of values, or arrays is to find its extremal value - maximum or minimum.
//To achieve this one need to store current maximum (or minimum respectively) in a separate variable, and then run through array, comparing each of its elements to this variable.
//Whenever next value is greater than this temporary variable, this value should be copied into it (as a new maximum).
//
//At the end of the pass this temporary variable will hold the extremum value.
//
//Input data will give you exactly 300 numbers in a single line.
//Answer should contain maximum and minimum of these values, separated by space.

        Scanner sc = new Scanner(System.in);

        int[] Numeri = new int[300];
        for (int i = 0; i < 300; i++) {

            Numeri[i] = sc.nextInt();
        }

        int min = Numeri[0];
        int max = Numeri[0];

        for (int i = 0; i < 300; i++) {

            if (min > Numeri[i]) {
                min = Numeri[i];
            }
            if (max < Numeri[i]) {
                max = Numeri[i];
            }
        }

        System.out.print(max + " " + min );
    }
}
