package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List li=new LinkedList();


		li.add("Sita");

		li.add(30);
		li.add("Infosys");
		
		List li2=new LinkedList();
		li2.add("Deepthi");
		li2.add(31);

		li2.add("Wipro");

		li2.add("Dell");

		
		
		//li.addAll(li2);
		li.removeAll(li2);
		//li.retainAll(li2);
		
		System.out.println(li);
		
		for (Object object : li2) {
			System.out.println(object);
		}
		}
		
	}


