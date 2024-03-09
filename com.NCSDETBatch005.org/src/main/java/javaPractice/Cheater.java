package javaPractice;

public class Cheater {

	public static void main(String[] args) {

		Student std = new Student();
		
		int no = std.getRollNo();
		String name = std.getStdName();
		long number = std.getContactNo();

		System.out.println(no);
		System.out.println(name);
		System.out.println(number);
		
		
		std.setRollNo(102);
		std.setStdName("Shareef");
		std.setContactNo(9000488893L);

	}

}
