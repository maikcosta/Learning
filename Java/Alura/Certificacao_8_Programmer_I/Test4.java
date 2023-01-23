package Certificacao_8_Programmer_I;

public class Test4 {
    public static void main(String[] args) {
        System.out.printf(">%-(8.2f<",12.45);//A
        System.out.println("\n");
        System.out.printf(">%0,8.2f<",12.45);//B
        System.out.println("\n");
        System.out.format(">%1$08.2f<",12.45);//C
        System.out.println("\n");
        System.out.printf(">%0,(8.2f<",12.45);//D
        System.out.println("\n");
        System.out.format(">%0(8.2f<",12.45);//E
    }
}
