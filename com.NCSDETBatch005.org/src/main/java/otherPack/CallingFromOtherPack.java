package otherPack;

import accessModifiersExamples.AccessExample1;

public class CallingFromOtherPack {

	public static void main(String[] args) {

		AccessExample1 ae1 = new AccessExample1();

		System.out.println(ae1.a);
		System.out.println(ae1.str);

		ae1.method1();
		
		
//		AccessExample2 ae2 = new AccessExample2();
//		
//		System.out.println(ae2.l);
//		System.out.println(ae2.name);
//		
//		ae2.method2();
//		
		
		
		
		
		

	}

}
