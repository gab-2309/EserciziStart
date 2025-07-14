package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class peteTheBaker {
    public static void main(String[] args) {

//Pete likes to bake some cakes. He has some recipes and ingredients.
//Unfortunately he is not good in maths. Can you help him to find out, how many cakes he could bake considering his recipes?
//Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer).
//For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200).
//Ingredients that are not present in the objects, can be considered as 0.

        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200,
                "cinnamon", 300);
        System.out.println(cakes(recipe, available));
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

        HashMap<String, Integer> inventario = new HashMap<>(available);
        for (String chiave : recipe.keySet()) {

            if (!inventario.containsKey(chiave) || inventario.get(chiave) < recipe.get(chiave)) {
                System.out.println("Non possiedi: " + recipe.get(chiave) + " di " + chiave);
                return 0;
            }
        }
        int numTorte = 0;

        while (isSfornabile(recipe, inventario)) {

            for (String chiave : recipe.keySet()) {

                int nuovoValore = inventario.get(chiave) - recipe.get(chiave);
                inventario.put(chiave, nuovoValore);
            }
            numTorte++;
        }

        return numTorte;
    }

    public static boolean isSfornabile (Map<String, Integer> ricetta, Map<String, Integer> inventario) {

        for (String chiave : ricetta.keySet()) {
            if (inventario.get(chiave) < ricetta.get(chiave)) {
                return false;
            }
        }
        return true;
    }
}
