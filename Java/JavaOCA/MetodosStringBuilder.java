public class MetodosStringBuilder {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder("ab");
        StringBuilder ba = new StringBuilder("a");

        ab.append("a");
        ab.compareTo(ba);
        ab.delete(1,1);
        ab.indexOf("a");
        ab.indexOf("a",1);
        ab.insert(1,"b");
        ab.replace(0,1,"x");
        System.out.println(ab);
        System.out.println(ba);


        StringBuilder one = new StringBuilder("1");
        StringBuilder two = new StringBuilder("2");
        StringBuilder three = one.append("3");


        System.out.println(one);
        System.out.println(three);
        System.out.println(one == three);
    }
}
