public class TestDefaultStatic {

    interface I {
        default int m1(){
            return 0;
        }
        static int m2(){
            return 2;
        }
    }

    interface I2 extends I{
        default void m3(){
            // Métodos Default podem ser chamados diretos através da herança
            int i = m1();
            // Métodos Static não são herdados precisa chamar a interface para depois chamar o método.
            int y = I.m2();
        }
    }
}
