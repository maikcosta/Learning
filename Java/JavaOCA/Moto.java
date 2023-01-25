public class Moto {
    private String modelo = "XRE 190";
    {System.out.println("1 - Atributo setado ->" + modelo);
    }
    public Moto(){
        modelo = "Fazer 250";
        System.out.println("2 - Atribuição Contrutor ->" + modelo);
    }
    public static void main (String [] args){
        Moto moto = new Moto();
        System.out.println(moto.modelo);
    }
}