
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CalcoloCodiceFiscale2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        DatiPersona dati = new DatiPersona();

        System.out.println("Inserisci Nome: ");
        dati.setNome(input.nextLine());

        System.out.println("Inserisci Cognome: ");
        dati.setCognome(input.nextLine());

        System.out.println("Inserisci Sesso (M/F): ");
        dati.setSesso(input.nextLine().toUpperCase());

        System.out.println("Inserisci data di Nascita (Giorno/Mese/Anno): ");
        dati.setDataNascita(input.nextLine());

        System.out.println("Inserisci Comune di Nascita: ");
        dati.setComuneNascita(input.nextLine());

        String consonantiCognome = dati.cognome.toUpperCase().replaceAll("[AEIOU]", "");
        String consonantiNome = dati.nome.toUpperCase().replaceAll("[AEIOU]", "");
        String vocaliCognome = dati.cognome.toUpperCase().replaceAll("[BCDFGHLMNPQRSTVZJKWXY]", "");
        String vocaliNome = dati.nome.toUpperCase().replaceAll("[BCDFGHLMNPQRSTVZJKWXY]", "");

        String cognomeNelCodice = "";
        if (consonantiCognome.length() == 2 && vocaliCognome.length() >= 1) {
            cognomeNelCodice = consonantiCognome + vocaliCognome.charAt(0);
        } else if (consonantiCognome.length() == 1 && vocaliCognome.length() >= 2) {
            cognomeNelCodice = consonantiCognome + vocaliCognome.substring(0, 2);
        } else if (consonantiCognome.length() == 0 && vocaliCognome.length() >= 3) {
            cognomeNelCodice = consonantiCognome + vocaliCognome.substring(0, 3);
        } else if (vocaliCognome.length() == 0 && dati.cognome.length() == 2) {
            cognomeNelCodice = consonantiCognome + "X";
        } else if (vocaliCognome.length() == 0 && dati.cognome.length() == 1) {
            cognomeNelCodice = consonantiCognome + "XX";
        } else {
            cognomeNelCodice = consonantiCognome.substring(0, 3);
        }

        String nomeNelCodice = "";
        if (consonantiNome.length() == 2 && vocaliNome.length() >= 1) {
            nomeNelCodice = consonantiNome + vocaliNome.charAt(0);
        } else if (consonantiNome.length() == 1 && vocaliNome.length() >= 2) {
            nomeNelCodice = consonantiNome + vocaliNome.substring(0, 2);
        } else if (consonantiNome.length() == 0 && vocaliNome.length() >= 3) {
            nomeNelCodice = consonantiNome + vocaliNome.substring(0, 3);
        } else if (consonantiNome.length() == 3) {
            nomeNelCodice = consonantiNome.substring(0, 3);
        } else {
            nomeNelCodice = consonantiNome.charAt(0) + consonantiNome.substring(2, 4);
        }

        // Conversione mese nascita in carattere 00/00/0000

        String meseNascita = dati.dataNascita.substring(3, 5);
        switch (meseNascita) {
            case "01" -> meseNascita = "A";
            case "02" -> meseNascita = "B";
            case "03" -> meseNascita = "C";
            case "04" -> meseNascita = "D";
            case "05" -> meseNascita = "E";
            case "06" -> meseNascita = "H";
            case "07" -> meseNascita = "L";
            case "08" -> meseNascita = "M";
            case "09" -> meseNascita = "P";
            case "10" -> meseNascita = "R";
            case "11" -> meseNascita = "S";
            case "12" -> meseNascita = "T";
        }


        String giornoNascita = dati.dataNascita.substring(0, 2);
        if (!dati.sesso.equals("M")) {
            int F = Integer.parseInt(giornoNascita) + 40;
            giornoNascita = String.valueOf(F);
        }

        String annoNascita = dati.dataNascita.substring(8, 10);

        //Codice Catastale

        String filePath = "C:\\Users\\Guben-PC\\Desktop\\Java test\\lista_comuni_completa.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line = "";
        String codiceCatastale = "";
        while ((line = br.readLine()) != null) {
            String[] partiComune = line.split(":");
            // partiComune[0]  nome del comune
            // partiComune[1]  codice catastale
            if (partiComune[0].equals(dati.comuneNascita)) {
                codiceCatastale = partiComune[1];
            }
        }

        String primaParteCodice = cognomeNelCodice + nomeNelCodice + annoNascita + meseNascita + giornoNascita + codiceCatastale;

        char[] posDispari = new char[8]; //1 , 3 , 5 , 7 , 9 , 11 , 13 , 15
        char[] posPari = new char[7]; //2 , 4 , 6 , 8 , 10 , 12, 14

        for (int i = 0; i < 16; i = i + 2) {
            if (i == 0) {
                posDispari[i] = primaParteCodice.charAt(i);

            } else if (i == 2) {
                posDispari[i - 1] = primaParteCodice.charAt(i);

            } else if (i == 4) {
                posDispari[i - 2] = primaParteCodice.charAt(i);

            } else if (i == 6) {
                posDispari[i - 3] = primaParteCodice.charAt(i);

            } else if (i == 8) {
                posDispari[i - 4] = primaParteCodice.charAt(i);

            } else if (i == 10) {
                posDispari[i - 5] = primaParteCodice.charAt(i);

            } else if (i == 12) {
                posDispari[i - 6] = primaParteCodice.charAt(i);

            } else if (i == 14) {
                posDispari[i - 7] = primaParteCodice.charAt(i);

            }
        }
        System.out.println();

        for (int i = 1; i < 14; i = i + 2) {
            if (i == 1) {
                posPari[i - 1] = primaParteCodice.charAt(i);

            } else if (i == 3) {
                posPari[i - 2] = primaParteCodice.charAt(i);

            } else if (i == 5) {
                posPari[i - 3] = primaParteCodice.charAt(i);

            } else if (i == 7) {
                posPari[i - 4] = primaParteCodice.charAt(i);

            } else if (i == 9) {
                posPari[i - 5] = primaParteCodice.charAt(i);

            } else if (i == 11) {
                posPari[i - 6] = primaParteCodice.charAt(i);
            } else if (i == 13) {
                posPari[i - 7] = primaParteCodice.charAt(i);
            }
        }

        int[] caratteriPosDispari = new int[8];
        String filePath2 = "C:\\Users\\Guben-PC\\Desktop\\Java test\\caratteriAlfanumerici-PosizioneDispari.txt";
        br = new BufferedReader(new FileReader(filePath2));
        String line2 = "";
        for (int i = 0; i < 8; i++) {
            while ((line2 = br.readLine()) != null) {
                String[] partiConversioneDispari = line2.split(":");
                if (partiConversioneDispari[0].equals(String.valueOf(posDispari[i]))) {
                    caratteriPosDispari[i] = Integer.parseInt(partiConversioneDispari[1]);
                    System.out.println(caratteriPosDispari[i]);
                }
            }
        }
        

        System.out.println(primaParteCodice);

    }
}



