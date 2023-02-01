public class EstadosSwitch {
    public static void main(String[] args) {
        String estado = "rs";
        final String caseEstado = "rs";
        switch (estado){
            default:
                System.out.println("Estado não informado");
                break;
            case "sp":
                System.out.println("São Paulo");
                break;
            case "rj":
                System.out.println("Rio de Janeiro");
                break;
            case caseEstado:
                System.out.println("Rio Grande do Sul");
                break;
        }
    }
}
