
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

        int dispariValori = 0;
        for (int i = 0; i < posDispari.length; i++) {

            if (posDispari[i] == '0') {
                posDispari[i] = 1;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '1') {
                posDispari[i] = 0;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '2') {
                posDispari[i] = 5;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '3') {
                posDispari[i] = 7;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '4') {
                posDispari[i] = 9;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '5') {
                posDispari[i] = 13;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '6') {
                posDispari[i] = 15;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '7') {
                posDispari[i] = 17;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '8') {
                posDispari[i] = 19;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == '9') {
                posDispari[i] = 21;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'A') {
                posDispari[i] = 1;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'B') {
                posDispari[i] = 0;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'C') {
                posDispari[i] = 5;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'D') {
                posDispari[i] = 7;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'E') {
                posDispari[i] = 9;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'F') {
                posDispari[i] = 13;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'G') {
                posDispari[i] = 15;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'H') {
                posDispari[i] = 17;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'I') {
                posDispari[i] = 19;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'J') {
                posDispari[i] = 21;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'K') {
                posDispari[i] = 2;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'L') {
                posDispari[i] = 4;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'M') {
                posDispari[i] = 18;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'N') {
                posDispari[i] = 20;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'O') {
                posDispari[i] = 11;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'P') {
                posDispari[i] = 3;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'Q') {
                posDispari[i] = 6;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'R') {
                posDispari[i] = 8;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'S') {
                posDispari[i] = 12;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'T') {
                posDispari[i] = 14;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'U') {
                posDispari[i] = 16;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'V') {
                posDispari[i] = 10;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'W') {
                posDispari[i] = 22;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'X') {
                posDispari[i] = 25;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'Y') {
                posDispari[i] = 24;
                dispariValori = dispariValori + posDispari[i];
            } else if (posDispari[i] == 'Z') {
                posDispari[i] = 23;
                dispariValori = dispariValori + posDispari[i];
            }
        }

        int pariValori = 0;
        for (int i = 0; i < posPari.length; i++) {

            if (posPari[i] == '0') {
                posPari[i] = 0;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '1') {
                posPari[i] = 1;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '2') {
                posPari[i] = 2;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '3') {
                posPari[i] = 3;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '4') {
                posPari[i] = 4;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '5') {
                posPari[i] = 5;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '6') {
                posPari[i] = 6;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '7') {
                posPari[i] = 7;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '8') {
                posPari[i] = 8;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == '9') {
                posPari[i] = 9;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'A') {
                posPari[i] = 0;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'B') {
                posPari[i] = 1;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'C') {
                posPari[i] = 2;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'D') {
                posPari[i] = 3;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'E') {
                posPari[i] = 4;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'F') {
                posPari[i] = 5;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'G') {
                posPari[i] = 6;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'H') {
                posPari[i] = 7;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'I') {
                posPari[i] = 8;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'J') {
                posPari[i] = 9;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'K') {
                posPari[i] = 10;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'L') {
                posPari[i] = 11;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'M') {
                posPari[i] = 12;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'N') {
                posPari[i] = 13;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'O') {
                posPari[i] = 14;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'P') {
                posPari[i] = 15;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'Q') {
                posPari[i] = 16;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'R') {
                posPari[i] = 17;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'S') {
                posPari[i] = 18;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'T') {
                posPari[i] = 19;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'U') {
                posPari[i] = 20;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'V') {
                posPari[i] = 21;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'W') {
                posPari[i] = 22;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'X') {
                posPari[i] = 23;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'Y') {
                posPari[i] = 24;
                pariValori = pariValori + posPari[i];
            } else if (posPari[i] == 'Z') {
                posPari[i] = 25;
                pariValori = pariValori + posPari[i];
            }
        }

        String carattereDiControllo = String.valueOf((dispariValori + pariValori) % 26);
        switch (carattereDiControllo) {
            case "0" -> carattereDiControllo = "A";
            case "1" -> carattereDiControllo = "B";
            case "2" -> carattereDiControllo = "C";
            case "3" -> carattereDiControllo = "D";
            case "4" -> carattereDiControllo = "E";
            case "5" -> carattereDiControllo = "F";
            case "6" -> carattereDiControllo = "G";
            case "7" -> carattereDiControllo = "H";
            case "8" -> carattereDiControllo = "I";
            case "9" -> carattereDiControllo = "J";
            case "10" -> carattereDiControllo = "K";
            case "11" -> carattereDiControllo = "L";
            case "12" -> carattereDiControllo = "M";
            case "13" -> carattereDiControllo = "N";
            case "14" -> carattereDiControllo = "O";
            case "15" -> carattereDiControllo = "P";
            case "16" -> carattereDiControllo = "Q";
            case "17" -> carattereDiControllo = "R";
            case "18" -> carattereDiControllo = "S";
            case "19" -> carattereDiControllo = "T";
            case "20" -> carattereDiControllo = "U";
            case "21" -> carattereDiControllo = "V";
            case "22" -> carattereDiControllo = "W";
            case "23" -> carattereDiControllo = "X";
            case "24" -> carattereDiControllo = "Y";
            case "25" -> carattereDiControllo = "Z";

        }

        System.out.println(primaParteCodice + carattereDiControllo);

    }
}



