import java.util.Scanner;

public class SpiegazioneArray {
    public static void main(String[] args) {


//        int[] numeri = new int[3];
        int[] numeri = {75, 29, 350, 7, 4192, 204, 88, 67};
        String[] nomi = {"Marco", "Giulia"};

//        esercizio 1
//        int maggiore100 = 0;
//        for (int i = 0; i < numeri.length; i++) {
//            if (numeri[i] > 100) {
//                maggiore100++;
//            }
//        }
//        System.out.println("I numeri maggiori di 100 sono " + maggiore100);

//        esercizio 2
//        int sommaNumeri = 0;
//        for (int i = 0; i < numeri.length; i++) {
//            sommaNumeri += numeri[i];
//        }
//        System.out.println((double)sommaNumeri / numeri.length);

//        esercizio 3
//        Scanner sc = new Scanner(System.in);
//        String[] previsioni = {
//                "un pioniere",
//                "amato da molti",
//                "molto ricco"};
//
//        System.out.println("Predirrò il tuo futuro scegli un numero da 1, 2 o 3");
//        int risposta = sc.nextInt();
//
//        System.out.println("in futuro sarai " + previsioni[risposta - 1]);

        String[] lista = {"Marco", "Giulia", "Mirco", "Cesare"};
        
        for(String nome : lista){
            System.out.println(nome);
        }
        
    }
}
