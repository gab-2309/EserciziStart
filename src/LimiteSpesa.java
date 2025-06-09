import java.util.Scanner;

public class LimiteSpesa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci limite di spesa giornaliero:  ");
        int limiteSpesaG = input.nextInt();

        System.out.println("Inserisci un budget mensile:  ");
        int budgetMese = input.nextInt();

        System.out.println("Inserisci l'importo giornaliero speso per i seguenti 5 giorni  ");

        int spesaGiorno = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Inserisci spesa giornaliera:  ");
            spesaGiorno = input.nextInt();
            if (spesaGiorno > limiteSpesaG) {
                System.out.println("Attenzione: limite giornaliero superato");
            }
            spesaGiorno = spesaGiorno * i;
        }

        System.out.println("Somma di tutte le spese = " + spesaGiorno);
        if (spesaGiorno > budgetMese) {
            System.out.println("Hai superato il budget mensile");
        }

        input.close();
    }
}