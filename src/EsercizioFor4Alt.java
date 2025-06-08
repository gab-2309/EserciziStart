

public class EsercizioFor4Alt {
    public static void main(String[] args) {

        int b = 0;
        for (int i = 1; i <= 30; i++) {

            System.out.println(i);

            b++;
            if (b == 3) {
                System.out.println(" quack");
                b = 0;
            }

        }

    }
}
