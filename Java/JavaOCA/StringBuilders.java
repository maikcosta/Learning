public class StringBuilders {
    public static void main(String[] args) {

        //Menos performatico.
        long tempoInicial = System.currentTimeMillis();
        String alpha = "a";

        for (char current = 'b'; current <= 'z';current ++){
            alpha += current;
        }
        System.out.println(alpha);
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);


        //Mais performatico.
        long tempoInicial1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++){
            sb.append(current);
        }
        System.out.println(sb);
        long tempoFinal1 = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinal1 - tempoInicial1) / 1000d);
    }
}
