public class ForPegadinhas {

    private void forSimples(int informeNumeroMenorQueDez){
        for( ; informeNumeroMenorQueDez < 10 ; informeNumeroMenorQueDez++){
            System.out.println(informeNumeroMenorQueDez);
        }
    }

    private void forCompativeis(){
        for (int x = 1,y = 10; x <= y || y >= x ; x++, y--){
            System.out.println("Valor de x:" + x + " e de y:" + y +"." );
        }
    }

//    private void forIncompativeis(){
//        for (int x = 1, long y = 10; x <= y || y >= x ; x++, y--){
//            System.out.println("Valor de x:" + x + " e de y:" + y +"." );
//        }
//    }
    public static void main(String[] args) {

        ForPegadinhas forPegadinhas = new ForPegadinhas();

        forPegadinhas.forSimples(0);
        System.out.println("---------");
        forPegadinhas.forCompativeis();
        System.out.println("---------");
        //forPegadinhas.forIncompativeis();

    }

}
