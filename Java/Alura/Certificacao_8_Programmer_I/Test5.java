package Certificacao_8_Programmer_I;


public class Test5 {
    static long i;

    public static void main(String[] args) {
        i = Integer.valueOf("10",8); // A
       // m1(i); // B
    }

    private static void m1(Integer j) { // C
        System.out.println(j);
    }
}