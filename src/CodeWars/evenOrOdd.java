package CodeWars;

public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(1));
        System.out.println(evenOrOdd(2));
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) return "Even";
        return "Odd";
    }
}

