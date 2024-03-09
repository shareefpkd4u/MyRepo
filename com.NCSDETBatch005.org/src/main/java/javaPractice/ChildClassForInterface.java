package javaPractice;

public class ChildClassForInterface implements Animal {

	@Override
	public void catSound() {
		System.out.println("Meow");
	}

	@Override
	public void tigetSound() {
		
		System.out.println("Rorar");
		
	}

	@Override
	public void hourseSound() {
		System.out.println("");
	}

}
