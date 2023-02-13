import java.util.ArrayList;

public class MetodosArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("José");
        arrayList.add("Maria");
        arrayList.add("Ana");
        arrayList.add("Sarah");

        System.out.println(arrayList);

        //Inclusão com index
        arrayList.add(0,"João");

        System.out.println(arrayList);

        //Remoção por objeto
        arrayList.remove("Maria");

        System.out.println(arrayList);

        //Remoção por index. Cuidado o Index deve ser válido.
        arrayList.remove(1);

        System.out.println(arrayList);

        //Set ou replace
        arrayList.set(2,"Nádia");
        System.out.println(arrayList);

        //IsEmpty retorno Boolean verifica se está vázio
        System.out.println("Verifica se está vázio: " + arrayList.isEmpty());

        // size - Retorno int
        System.out.println("Tamanho do array: " + arrayList.size());

        //Contains - verfica se existe conteúdo no objeto.
        System.out.println("Conteins: " + arrayList.contains("Nádia"));

        //Clear - limpa o array
        arrayList.clear();

        System.out.println(arrayList);

        ArrayList one = new ArrayList();
        ArrayList two = new ArrayList();

        one.add(1);
        two.add(1);

        System.out.println("Comparação de arrays com equals: "+ one.equals(two));

    }
}

