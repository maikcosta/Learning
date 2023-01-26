public class PromocaoNumerica {
    public static void main(String[] args) {
        Byte b1 = 2;
        Short s1 = 3;

        //Necessário realizar o cast
        Double d1 = (double) (b1 + s1);

        System.out.println(d1);

    }
}
