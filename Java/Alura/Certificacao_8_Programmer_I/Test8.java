package Certificacao_8_Programmer_I;


public class Test8 {

    public static void main(String[] args) {
        int a = Integer.parseInt("10",2); // Que trap aqui!
        int b = a == 10 ? null : 3;
        System.out.println(a + b);
    }
}
