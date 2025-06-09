
// PIN se pin corretto = operazione completata
// se non corretto far eseguire altre tre volte

import java.util.Scanner;

public class PIN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean controllo = false;
		int tentativi = 0;
		int pinC = 2323;
		do {
			System.out.println("Inserisci il PIN: ");
			int pinI = input.nextInt();
			if (pinI == pinC) {
				System.out.println("OPERAZIONE COMPLETATA");
				controllo = true;
			}
			tentativi++;
			if (tentativi == 3) {
				controllo = true;
				System.out.println("tentativi massimi raggiunti");
			}

		} while (!controllo); //se è true ripete il blocco do
	}
}
