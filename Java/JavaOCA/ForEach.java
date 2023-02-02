import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maik");
        nomes.add("Igor");
        nomes.add("Sarah");

        for(String nome : nomes){
            String sobreNome = " da Costa";
            String nomeCompleto = nome + sobreNome;
            System.out.println(nomeCompleto);
        }
    }
}
