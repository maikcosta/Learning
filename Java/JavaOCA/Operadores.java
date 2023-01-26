public class Operadores {
    //Unários
    static int x = 3;
    //Binários
    static double y = 3 + 2;
    //Ternário
    static boolean result = x < y ? true: false;

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(result);

        System.out.println("===Ordem de Precedência de calculo===");

        int p1 = 2 * 5 + 3 * 4 - 8;

        /**
         * int p1= 2 * 5 + 3 * 4 - 8;
         * int p1= 10 + 12 -8
         * int p1= 22 - 8
         * int p1= 14
         */

        System.out.println(p1);

        int p2 =  2 * ((5+3)* 4 - 8);

        /**
         * int p2 =  2 * ((5+3)* 4 - 8);
         * int p2 =  2 * ((8)* 4 - 8);
         * int p2 =  2 * (32 - 8);
         * int p2 =  2 * 24;
         * int p2 =  48;
         */

        System.out.println(p2);

        int x = 3;

        int y = ++x * 5 / x-- + --x;

        /**
         * int y = 4 * 5 / 4 + 2;
         * int y = 20 / 4 + 2;
         * int y = 5 + 2;
         * int y = 7;
         */
    }
}
