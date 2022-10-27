package collection;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Set;

public class CollectionMap {
	

	
		public static void main(String[] args) {
			Map<Integer,String> mi=new HashMap<Integer,String>();
			mi.put(1, "xyz");
			mi.put(2,"abc");
			//mi.put(1," ");
			
			//System.out.println(mi);
			Set<Entry<Integer, String>> entrySet = mi.entrySet();
			for (Entry<Integer, String> entry : entrySet) {
				System.out.println(entry.getValue());
			}
		}
		
}
	


