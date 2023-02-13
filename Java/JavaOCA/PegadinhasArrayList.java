import java.util.ArrayList;

public class PegadinhasArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);

        Integer iObj = 1;


        //Quando utlizamos o Wrapper do Integer ele remove o objeto com o valor
        num.remove(iObj);
        System.out.println(num);

        ArrayList<Integer> num2 = new ArrayList<>();
                        //Index
        num2.add(1);    //0
        num2.add(2);    //1
        num2.add(3);    //2

        int iPri = 2;

        //Quando utlizamos o Primitivo do int ele remove conforme o index.
        num2.remove(iPri);
        System.out.println(num2);

    }
}
