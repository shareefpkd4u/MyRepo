package javaPractice;

public class CallingInterFaceMethodsFromChildClass {

	public static void main(String[] args) {
		
		Animal an = new ChildClassForInterface();
		
		an.catSound();
		
		an.tigetSound();
		
		an.hourseSound();
	}

}
