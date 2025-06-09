
// utente inserisce 3 numeri e li salva in 1 array 
// e poi in un altro devi controllare se i numeri sono uguali nelle medesime posizioni

import java.util.Scanner;

public class ArrayES2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeri1 = new int[3];


		for (int i = 0; i < 3; i++) {
			System.out.println("Inserisci il " + (i + 1) + "° numero" + ": ");
			numeri1[i] = input.nextInt();
		}

		int[] numeri2 = new int[3];


		for (int i = 0; i < 3; i++) {
			System.out.println("Inserisci il " + (i + 1) + "° numero" + ": ");
			numeri2[i] = input.nextInt();
		}

		if (numeri1[0] == numeri2[0] && numeri1[1] == numeri2[1] && numeri1[2] == numeri2[2]) {
			System.out.println("I numeri negli array sono in posizioni uguali");
		} else {
			System.out.println("I numeri negli array sono  in posizioni diverse");
		}

		input.close();
	}
}
 
 
