package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//定义方法统计集合中指定元素出现的次数，如"a" 3,"b" 2,"c" 1
public class CollectionTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("e");
		list.add("d");
		list.add("e");
		list.add("d");
		list.add("d");
		list.add("d");
		System.out.println(frequency(list,"a"));
		System.out.println(frequency(list,"b"));
		System.out.println(frequency(list,"c"));
		System.out.println(frequency(list,"d"));
		System.out.println(frequency(list,"e"));
	}

	private static int frequency(List<String> list, String string) {
		Iterator<String> it = list.iterator();
		int count=0;
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase(string)){
				count++;
			}
		}
		
		return count;
	}

}
