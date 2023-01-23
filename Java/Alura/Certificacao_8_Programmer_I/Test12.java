package Certificacao_8_Programmer_I;

class Test12 {
    public static void main(String[] args) {
        Printer p = null;
        p = () -> System.out.println("Hello World");
        p.printMessage();
    }
}