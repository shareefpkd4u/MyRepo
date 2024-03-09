package accessModifiersExamples;

public class CallingWithInPack {

	public static void main(String[] args) {

		AccessExample1 ae = new AccessExample1();
		System.out.println(ae.a);
		System.out.println(ae.str);

		ae.method1();

		AccessExample2 ae2 = new AccessExample2();

		System.out.println(ae2.l);
		System.out.println(ae2.name);

	}
}
