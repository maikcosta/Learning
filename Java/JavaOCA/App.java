public class App {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }

    /* String[] args -> Funciona
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
    */

    /* String args[] -> Funciona
        public static void main(String args[]) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
     */

    /*  String ...args -> Funciona
        public static void main(String ...args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
     */

    /*   String args... -> Não funciona
       public static void main(String args...) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
     */

}
