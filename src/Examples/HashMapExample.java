package Examples;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
			HashMap<Integer,String> hmap=new HashMap<>();
			hmap.put(501,"Aswitha");
			hmap.put(502,"Madhuri");
			hmap.put(503,"Neeraja");
			hmap.put(504,"siri");
			hmap.put(505,"Sravani");
			Set set = hmap.entrySet();
		      Iterator it = set.iterator();
		      while(it.hasNext()) {
		         Map.Entry mentry = (Map.Entry)it.next();
		         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
		         System.out.println(mentry.getValue());
		      }
			
	}

}
