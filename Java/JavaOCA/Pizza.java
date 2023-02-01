public class Pizza {

    int pedacos = 8;

    public void comerPizza(int qtdFatias){
        while (qtdFatias > 0 && pedacos > 0){
            qtdFatias--;
            if(pedacos==1){
                System.out.println("A pizza acabou =/");
                pedacos--;
            }else{
                pedacos--;
                System.out.println("Restatam "  + pedacos +" pedaço(s) ");
            }
        }
    }
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.comerPizza(8);


    }
}
