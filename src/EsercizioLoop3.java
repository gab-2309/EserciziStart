public class EsercizioLoop3 {
    public static void main(String[] args) {

        int sommaNumeri = 0;
        for (int i = 1; i <= 10; i++) {

            System.out.println(sommaNumeri + "+" + i + "=" + (sommaNumeri += i));
        }
        System.out.println(sommaNumeri);
    }

}
