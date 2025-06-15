
//Implementare le seguenti operazioni:
//1. Inserisci un Chiedere Nome Film, Anno Pubblcazione, GenereFilm
//2. Visualizza tutti i film
//3. Cancella tutti i film
//4. Cancella un film per posizione
//5. Visualizza il numero totale di film
//6. Ricercare un film per titolo
//-> Utente può digitare un titolo, controllare se è registrato oppure no.
//Utilizzare il metodo equals() per confrontare due stringhe
//X. Esci dal programma.

import java.util.Scanner;

public class Films {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int selezione = 0;
		int posizione = 0;
		int numeroFilm = 100;

		String[] nomiFilm = new String[numeroFilm];
		String[] annoFilm = new String[numeroFilm];
		String[] genereFilm = new String[numeroFilm];
		do {
			System.out.println("-Menu-");
			System.out.println("1 - Inserisci un film \n2 - Visualizza tutti i film \n3 - Cancella tutti i film \n4 - Elimina un film \n5 - Numero di Film inseriti \n6 - Ricerca Film \n7 - Esci");
			selezione = input.nextInt();

			input.nextLine();

			if (selezione == 1) {
				for (int i = 0; i < numeroFilm; i++) {
					if (nomiFilm[i] == null) {
					System.out.println("Inserisci il nome del film: ");
					nomiFilm[posizione] = input.nextLine();


					System.out.println("Inserisci l'anno di pubblicazione: ");
					annoFilm[posizione] = input.nextLine();


					System.out.println("Inserisci il genere del film: ");
					genereFilm[posizione] = input.nextLine();
					posizione++;
					break;
					}
				}
				System.out.println("Film aggiunto alla lista :)");
			}
			if (selezione == 2) {
				System.out.println("Ecco i film salvati:\n ");
				for (int i = 0; i < numeroFilm; i++) {
					if (nomiFilm[i] != null) {
						System.out.println((i + 1) + "° - " + nomiFilm[i] + " " + annoFilm[i] + " " + genereFilm[i]);
					}
				}
			}
			if (selezione == 3) {
				System.out.println("Cancello tutti i film... ");
				for (int i = 0; i < numeroFilm; i++) {
					if (nomiFilm[i] != null) {

						nomiFilm[i] = null;
						annoFilm[i] = null;
						genereFilm[i] = null;
					}
				}
			}

			if (selezione == 4) {
				System.out.println("Scegli un film da Eliminare: ");
				for (int i = 0; i < numeroFilm; i++) {
					if (nomiFilm[i] != null) {
						System.out.println((i + 1) + "° - " + nomiFilm[i] + " " + annoFilm[i] + " " + genereFilm[i]);
					}
				}
				int filmEliminato = input.nextInt();

				nomiFilm[filmEliminato - 1] = null;
				annoFilm[filmEliminato - 1] = null;
				genereFilm[filmEliminato - 1] = null;

			}
			if (selezione == 5) {
				int contatoreFilm = 0;
				for (int i = 0; i < numeroFilm; i++) {
					if (nomiFilm[i] != null) {
						contatoreFilm++;
					}
				}
				System.out.println("Numero di film: " + contatoreFilm);

			}
			if (selezione == 6) {
				System.out.println("Inserisci Titolo del Film:\n ");
				String ricercaTitolo = input.nextLine();
				    for (int i=0; i < numeroFilm; i++ ){
						if (ricercaTitolo.equals(nomiFilm[i])){
							System.out.println(nomiFilm[i] + " " + annoFilm[i] + " " + genereFilm[i]);
						}
					}
			}
		} while (selezione != 7);
		input.close();
	}
}

 
 
