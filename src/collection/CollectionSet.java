package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add("Deepthi");
		li.add(10);
		
		System.out.println(li);
		Set se=new HashSet(li);
		System.out.println(se);
	}
	
	
	

}
