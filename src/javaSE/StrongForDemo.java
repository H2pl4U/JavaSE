package javaSE;

import java.util.ArrayList;

class Person04{
	String name;
	int id;
	public Person04(String name,int id){
		super();
		this.name=name;
		this.id=id;
	}
}

public class StrongForDemo {

	public static void main(String[] args) {
		
		 /*
		   *  实现for循环,遍历数组
		   *  好处: 代码少了,方便对容器遍历
		   *  弊端: 没有索引,不能操作容器里面的元素
		   */
		
//		String[] str={"jjf","is","jrf"};
//		for (String s : str) {
//			System.out.println(s);
//			System.out.println(s.length());
//		}
		
		ArrayList<Person04> list = new ArrayList<Person04>();
		list.add(new Person04("jjf",10));
		list.add(new Person04("jrf",11));
		for (Person04 per : list) {
			System.out.println(per.name+" "+per.id);
			System.out.println(per);
		}
	}

}
