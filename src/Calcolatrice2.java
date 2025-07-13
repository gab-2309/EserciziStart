import java.util.Scanner;

public class Calcolatrice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean calcAccesa = true;
        boolean operazioneIncorso = true;
        do {
            System.out.println("""
                    Calcolatrice 
                    1 - Accendi Calcolatrice
                    X - Esci 
                    """);

            String selezione = input.nextLine();

            int numero1 = 0;
            switch (selezione) {

                case "1":
                    System.out.println("Inserisci il primo numero: ");
                    numero1 = input.nextInt();

                    input.nextLine();

                    /*System.out.println("""
                                Scegli l'operazione che vuole svolgere 
                                + addizione
                                - sottrazione
                                x moltiplicazione
                                : divisione
                                Scrivi "esci" per finire il calcolo
                                """);*/
                    do {
                        System.out.println("""
                                Scegli l'operazione che vuole svolgere 
                                + addizione
                                - sottrazione
                                x moltiplicazione
                                : divisione
                                Scrivi "esci" per finire il calcolo
                                """);
                        String operazione = input.nextLine();
                        switch (operazione) {

                            case "+":
                                System.out.println("A quale numero vuoi sommarlo? ");
                                int numeroAddizione = input.nextInt();
                                numero1 = numero1 + numeroAddizione;
                                System.out.println("Risultato: " + numero1);
                                break;
                            case "-":
                                System.out.println("A quale numero vuoi sottrarlo? ");
                                int numeroSottrazione = input.nextInt();
                                numero1 = numero1 - numeroSottrazione;
                                System.out.println("Risultato: " + numero1);
                                break;
                            case "x":
                                System.out.println("Per quale numero vuoi moltiplicarlo? ");
                                int numeroMoltiplicazione = input.nextInt();
                                numero1 = numero1 * numeroMoltiplicazione;
                                System.out.println("Risultato: " + numero1);
                                break;
                            case ":":
                                System.out.println("Per quale numero vuoi dividerlo? ");
                                int numeroDivisione = input.nextInt();
                                numero1 = numero1 / numeroDivisione;
                                System.out.println("Risultato: " + numero1);
                                break;
                            case "esci":
                                System.out.println("Risultato finale: " + numero1);
                                operazioneIncorso = false;
                                break;

                        }

                    } while (operazioneIncorso != false);
                case "X":
                    System.out.println("Spegnimento... ");
                    calcAccesa = false;
                    break;
            }
        } while (calcAccesa != false);
        input.close();
    }
}
