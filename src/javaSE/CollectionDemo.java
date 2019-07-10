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
	   * Collection�ӿڷ���
	   * boolean contains(Object o) �ж϶����Ƿ�����ڼ�����,������ڷ���true
	   * ����������Object����
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
	   * Collection�ӿڵķ���
	   * void clear() ��ռ����е�����Ԫ��
	   * ��������������Ȼ����
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
	 * Collection�ӿڷ���
	 * boolean remove(Object o)�Ƴ�������ָ����Ԫ��
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
