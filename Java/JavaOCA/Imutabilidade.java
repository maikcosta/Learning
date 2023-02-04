public class Imutabilidade {

    public static void main(String[] args) {
        String s1 = "1";

        String s2 = s1.concat("2");
        //Na linha abaixo não foi atribuido a váriavel s2, portanto a variavel não sofrerá alteraçoes!
        s2.concat("3");

        System.out.println(s2);
    }

}
