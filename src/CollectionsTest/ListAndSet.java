package CollectionsTest;

import java.util.ArrayList;
import java.util.List;

public class ListAndSet {
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
		
		//To print alternate values of list
		
		for (int i = 0; i < l.size(); i=i+2) {
		System.out.println(l.get(i));	
		}
		int size = l.size();
		
		//To print last 5 index value of list
		for (int i = l.size() ; i >l.size()+5 ; i--) {
			System.out.println(l.get(i));
		}
		
		//int size = l.size();
		//Integer integer = l.get(size-5);
		//System.out.println(integer);
		//for (Integer x : l) {
		//	System.out.println(l.get(x));
		//}
		
		
		
	}
		
		//for (int i = 0; i < l.size()-5; i++) {
			//System.out.println(l.get(i));

		}
	

