public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(metodoBelo(50,10));

        int[][] numeri = new int[3][3];
        for(int i = 0; i < numeri.length; i++){
            for(int j = 0; j < numeri[0].length; j++){
                System.out.print(numeri[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static String metodoBelo (int x, int y){

        return(x > y) ? "Maggiore" : "Minore";
    }
}
