package collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Shareef");
		al.add(10);
		al.add('T');
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(2));
	}
}

class Example2 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add('T');
		ll.add('T');
		ll.add("Shareef");
		ll.add(true);
		ll.addFirst(10);

		System.out.println(ll);
	}
}

class Example3 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add("shareef");
		hs.add(10);
		hs.add('T');
		hs.add(true);
		hs.add(100L);

		System.out.println(hs);

	}
}

class Example4 {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(10);
		lhs.add("shareef");
		lhs.add(10);
		lhs.add('T');
		lhs.add(true);
		lhs.add(100L);

		System.out.println(lhs);

	}
}











