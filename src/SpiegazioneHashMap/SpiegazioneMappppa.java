package SpiegazioneHashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiegazioneMappppa {
    public static void main(String[] args) {

        HashMap<String, Integer> mappa = new HashMap<>();
//        mappa.put("Gabriele", "Botti");
//        mappa.put("Vincenzo", "D'onofrio");
//        mappa.put("Stefano", "Abati");

//        List<String> nomi = List.of("Gabriele", "Vincenzo" ,"Vincenzo", "Stefano", "Mirco");
//        for(String nome : nomi){
//            if(mappa.containsKey(nome)){
//                mappa.put(nome, mappa.get(nome) + 1);
//            }else{
//                mappa.put(nome, 1);
//            }
//        }
//        System.out.println(mappa);

        String nome = "Asdrubalini";

        HashMap<Character, Integer> mappaChar = new HashMap<>();

        for (int i = 0; i < nome.length(); i++){
            char carattere = nome.toLowerCase().charAt(i);

            mappaChar.computeIfPresent(carattere, (k, v) -> v + 1);

            mappaChar.computeIfAbsent(carattere, k -> 1);


            /*if (!mappaChar.containsKey(carattere)){
                mappaChar.put(carattere, 1);
            } else {
                mappaChar.put(carattere, mappaChar.get(carattere) + 1);
            }*/
        }

        System.out.println(mappaChar);

        for (char c : mappaChar.keySet()){
            System.out.print(c + " ");
        }

        System.out.println();

        for (int n : mappaChar.values()){
            System.out.print(n + " ");
        }

        System.out.println();

        for (Map.Entry<Character, Integer> mappaLoop : mappaChar.entrySet()) {
            System.out.println("Chiave: " + mappaLoop.getKey() + ", Valore: " + mappaLoop.getValue());
        }
    }
}
