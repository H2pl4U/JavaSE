package javaSE;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		function01();
		function02();
		function03();
		function04();
	}

	private static void function01() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("lw");
		coll.add("25k");
		coll.add("ambition");
		coll.add("rich");
		coll.add("happiness");
		Object[] object = coll.toArray();
		for(int i=0;i<object.length;i++){
			System.out.println(object[i]);
		}
	}
	
	 /*
	   * Collection接口方法
	   * boolean contains(Object o) 判断对象是否存在于集合中,对象存在返回true
	   * 方法参数是Object类型
	   */
	private static void function02() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("lw");
		coll.add("25k");
		coll.add("ambition");
		coll.add("rich");
		coll.add("happiness");
		boolean b = coll.contains("rich");
		System.out.println(b);
	}
	
	/*
	   * Collection接口的方法
	   * void clear() 清空集合中的所有元素
	   * 集合容器本身依然存在
	   */	
	private static void function03() {
		Collection<String> coll =new ArrayList<String>();
		coll.add("jjf");
		coll.add("chicken");
		System.out.println(coll);
		coll.clear();
		System.out.println(coll);
	}
	
	/*
	 * Collection接口方法
	 * boolean remove(Object o)移除集合中指定的元素
	 */
	private static void function04() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("lw");
		coll.add("25k");
		coll.add("ambition");
		coll.add("rich");
		coll.add("happiness");
		boolean b = coll.remove("25k");
		System.out.println(b);
		System.out.println(coll);
	}
}
