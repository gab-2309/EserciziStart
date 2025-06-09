
// chiedere all'utente quanti numeri vuole inserire, salvarli in un array e poi stamparli

import java.util.Scanner;

public class ArrayES1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.println("Quanti numeri vuoi inserire?");
		int quantitaN = input.nextInt();

		int[] numeriA = new int[quantitaN];

		for (int i = 0; i < quantitaN; i++) {
			System.out.println("Inserisci il numero: ");
			numeriA[i] = input.nextInt();
		}

		for (int i = 0; i < quantitaN; i++) {
			System.out.println(numeriA[i]);
		}
		input.close();
	}
}
 
