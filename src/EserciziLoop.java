public class EserciziLoop {
    public static void main(String[] args) {

        int sommaDeiNumeri = 0;
        System.out.println(sommaDeiNumeri);

        for (int i = 0; i <= 10; i++) {
            System.out.println(sommaDeiNumeri + " + " + i + " = " + (sommaDeiNumeri + i));
            sommaDeiNumeri += i;
        }
        System.out.println(sommaDeiNumeri);
    }
}
