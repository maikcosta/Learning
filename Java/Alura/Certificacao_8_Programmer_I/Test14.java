package Certificacao_8_Programmer_I;

import java.util.function.Predicate;

class Test14{
    int a = 0;

    public static void main(String[] args) {
        //new A().method(1, a -> a > 0); // A
    }

    private void method(int a, Predicate<Integer> d) {
        if(d.test(a)){ // B
            System.out.println(a);
        }
    }
}