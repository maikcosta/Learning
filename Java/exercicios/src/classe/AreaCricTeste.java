package classe;

public class AreaCricTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi= 10;
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi= 100;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(100));
		System.out.println(Math.PI);
		System.out.println(AreaCirc.area(100));
		
	}

}
