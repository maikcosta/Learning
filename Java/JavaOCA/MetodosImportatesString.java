public class MetodosImportatesString {
    public static void main(String[] args) {
        String string = "animais";
        //Verificar tamanho string. Retorno int tamanho da string
        System.out.println("Esse é o tamanho da string: " + string.length());
        //Busca por index ... OBS: Lembre-se que sempre começa na posição 0 e não 1. Retorno:  qual caracter está na posição informada.
        System.out.println("Temos essa informação na posição da string: " + string.charAt(5));
        //IndexOf. Retorno int posição que encontrou o char
        System.out.println("Encontramos esse caracter na posição : " + string.indexOf("m"));
        //IndexOf com Index. Retorno int posição que encontrou o char a partir fromIndex
        System.out.println("Encontramos esse caracter na posição considerando o index : " +string.indexOf('m',4));
        //SubString imprimir apartir do index. Retorno string apartir ...
        System.out.println("Substring apartir do index: " +string.substring(3));
        //SubString imprimir apartir do index com limite de impressao até o index. Retorno string de até
        System.out.println("Substring de ... até: " +string.substring(3,5));
    }
}
