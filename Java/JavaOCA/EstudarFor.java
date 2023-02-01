public class EstudarFor {


    private void horasDeEstudo (int qtdHoras){
        for(int horasNecessarias = 4 ; horasNecessarias > qtdHoras ; horasNecessarias--){
            if (horasNecessarias > qtdHoras){
                int tantasHoras = horasNecessarias - qtdHoras;
                System.out.println("Você precisa estudar mais " + tantasHoras +" hora(s).");

            }
        }
        System.out.println("Parabéns vc atingiu a meta!");
    }

    public static void main(String[] args) {

        EstudarFor estudar = new EstudarFor();

        estudar.horasDeEstudo(2);

    }
}
