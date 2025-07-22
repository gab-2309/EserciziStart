package CodeWars;

public class whoLikesItt {
    public static void main(String[] args) {

        String[] nomi = new String[0]; //{"Marco", "Gianni", "Giuseppe", "Carlo", "Mario"};

        System.out.println(whoLikesIt(nomi));
    }

    public static String whoLikesIt(String[] names) {

        if (names.length == 0) {
            return "no one likes this";
        } else if (names[0] != null && names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }

        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";

    }
}
