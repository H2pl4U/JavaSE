package test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("b");
		list.add("f");
		list.add("e");
		list.add("c");
		list.add("a");
		list.add("d");
		sort(list);
		System.out.println(list); // a, b, c, d, e, f

	}

	private static void sort(List<String> list) {
		for(int i =0;i<list.size();i++){
			for(int j = 0;j<list.size();j++){
				if(list.get(i).toCharArray()[0]<list.get(j).toCharArray()[0]){
					String temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}

}
