package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List li=new LinkedList();

		li.add("Deepthi");
		li.add(30);
		li.add("Infosys");
		
		List li2=new LinkedList();
		li2.add("Deepthi");
		li2.add(31);
<<<<<<< HEAD
		li2.add("Wipro");
=======
		li2.add("Dell");
>>>>>>> 8c0bae2cd55a6e448c559673efb590a2a07b22e7
		
		
		//li.addAll(li2);
		li.removeAll(li2);
		//li.retainAll(li2);
		
		System.out.println(li);
		
		for (Object object : li2) {
			System.out.println(object);
		}
		}
		
	}


