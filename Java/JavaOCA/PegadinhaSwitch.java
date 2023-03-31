public class PegadinhaSwitch {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade)

        {
            case a:
            case 'B':
                //No caso a resposta deveria ser "great" mas por conta da ausência do break neste ponto ele pela para o outro case executa e depois realiza o break!
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }

    }
}
