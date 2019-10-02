package javaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionToolDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("4");
		list.add("9");
		list.add("8");
		list.add("10");
		// 集合元素排序
		Collections.sort( list ); 
		System.out.println(list);
		//  集合元素存储位置打乱
		//每次执行该方法，集合中存储的元素位置都会随机打乱
		Collections.shuffle(list);
		System.out.println(list);
	}

}
