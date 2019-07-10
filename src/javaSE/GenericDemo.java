package javaSE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		HashSet<Integer> itg = new HashSet<Integer>();
		str.add("jjf");
		str.add("bjb");
		itg.add(18);
		itg.add(19);
		Iterator(str);
		Iterator(itg);
	}

	private static void Iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
