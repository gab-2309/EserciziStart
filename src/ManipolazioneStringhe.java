import java.util.Arrays;

public class ManipolazioneStringhe {
    public static void main(String[] args) {
        String stringa = "c1i1a1o1";
//        if (!stringa.contains("iao")) {
//            System.out.println("è un esclamazione!");
//        }

//        if (stringa.isEmpty()){
//            System.out.println("La stringa è vuota");
//        }

//        int numeroVocali = 0;
//        System.out.println(stringa.charAt(1));
//        for (int i = 0; i < stringa.length(); i++) {
//            char carattere = stringa.toLowerCase().charAt(i);
//            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
//                numeroVocali++;
//                System.out.println("vocale trovata");
//            }
//        }
//        System.out.println("numero vocali: " + numeroVocali);

//        System.out.println(stringa);
//        stringa = stringa.replaceAll("1" , "");
//        System.out.println(stringa);

//        String nome = "Vince-D'on";
//        String[] splittato = nome.split("-");
//        String nomeProprio = splittato[0];
//        String cognome = splittato[1];
//        System.out.println("NOME: " + nomeProprio + "\nCognome: " + cognome);

        String nomeGhebs = "Gabriele";
//        char[] caratteriNome = nomeGhebs.toCharArray();
//        for(char carattere : caratteriNome){
//            System.out.println(carattere);
//        }

        String[] caratteriNome2 = nomeGhebs.split("");
        for(String carattere : caratteriNome2){
            System.out.println(carattere);
        }
    }
}
