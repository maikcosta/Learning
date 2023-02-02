public class PizzaDoWhile {

    public void comerPizza(int qtdFatias){
        int pedacos = 8;
        do {
            System.out.println("Restatam "  + pedacos +" pedaço(s) ");
            pedacos--;
            qtdFatias--;
        }while (pedacos<8 && qtdFatias >= 0);
    }
    public static void main(String[] args) {
        PizzaDoWhile pizzaDoWhile = new PizzaDoWhile();
        pizzaDoWhile.comerPizza(6);
    }

}

