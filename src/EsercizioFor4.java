

public class EsercizioFor4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i = i + 1) {
            System.out.print(i);

            if (i % 3 == 0) {
                System.out.print(" quack");
            }
            System.out.println();
        }
    }
}