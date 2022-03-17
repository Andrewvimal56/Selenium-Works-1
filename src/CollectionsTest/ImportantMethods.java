package CollectionsTest;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class ImportantMethods {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(90);
		l.add(60);
		l.add(70);
		System.out.println(l);
		// To get Value with Index
		Integer a = l.get(0);
		System.out.println(a);
		// To get length of the list
		int size = l.size();
		System.out.println(size);
		// To get the middle length value
		Integer integer = l.get(size / 2);
		System.out.println(integer);
		// To Copy value from list to set
		Set<Integer> s = new HashSet<>();
		s.addAll(l);
		System.out.println(s);
		// To get Last index value of list
		Integer integer2 = l.get(size - 1);
		System.out.println(integer2);

		System.out.println("Forloop");
		// Iterate list Using forloop
		for (int i = 0; i < size; i++) {

			System.out.println(l.get(i));

		}
		System.out.println("Enhanced Forloop");
		// Iterate list Using Enhanced forloop
		for (Integer x : l) {

			System.out.println(x);
		}
		// TO get first 5 values
		System.out.println("First 5 values");
		for (int i = 0; i < 5; i++) {
			System.out.println(l.get(i));

		}

		// int indexOf = l.indexOf(70);
		// System.out.println(indexOf);

		// for (int i = 0 ; i < size; i++) {

		// System.out.println(l.get(i));

		// }

	}
}
