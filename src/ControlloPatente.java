import java.util.Scanner;

public class ControlloPatente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quante persone vuoi controllare?  ");
        int numeroPersone = input.nextInt();

        input.nextLine();

        for (int i = 1; i <= numeroPersone; i++) {
            System.out.println("Inserisci il tuo nome:  ");
            String nome = input.nextLine();

            System.out.println("Inserisci il tuo cognome:  ");
            String cognome = input.nextLine();

            System.out.println("Inserisci il tua età:  ");
            int eta = input.nextInt();
            boolean eMaggiorenne;
            if (eta >= 18) {
                eMaggiorenne = true;
            } else {
                eMaggiorenne = false;
            }

            input.nextLine();

            System.out.println("Hai la patente?  ");
            System.out.println("\n" + " 1 - Sì" + "\n" + " 2 - No" + "\n");
            int verificaPatente = input.nextInt();

            input.nextLine();
            boolean haPatente;
            if (verificaPatente == 1) {
                haPatente = true;
            } else {
                haPatente = false;
            }

            System.out.println(" Utenti Controllati: ");

            if (haPatente && eMaggiorenne) {
                System.out.println(i + ". " + nome + " " + cognome + " ha " + eta + " anni, ed ha la patente.");

            } else {
                if (haPatente && !eMaggiorenne) {
                    System.out.println(i + ". " + nome + " " + cognome + " è minorenne, non può guidare");
                } else if (!haPatente && eMaggiorenne) {
                    System.out.println(i + ". " + nome + " " + cognome + " è maggiorenne, ma non ha la patente");
                } else {
                    System.out.println(i + ". " + nome + " " + cognome + " è minorenne e non ha la patente");
                }
            }
        }
        input.close();
    }
}