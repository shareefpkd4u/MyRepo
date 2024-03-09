package constructorExample;

public class Example2 {

	public static void main(String[] args) {

//		Example1 ex1 = new Example1(101, "Shareef", 9848022338L);
		Example1 ex1 = new Example1();
		System.out.println(ex1.a);
		System.out.println(ex1.str);
		System.out.println(ex1.l);
	}

}
