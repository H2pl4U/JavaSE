package practisedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person04{
	private String name;
	private int age;
	public Person04(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Person04 [name=" + name + ", age=" + age + "]";
	}
	
}

public class MapOOPDemo {

	public static void main(String[] args) {
		Map<Person04, String> map = new HashMap<Person04, String>();
		map.put(new Person04("jjf", 20), "天门");
		map.put(new Person04("bjb", 21), "荆门");
		map.put(new Person04("ljw", 21), "襄阳");
		map.put(new Person04("hhl", 20), "大冶");
		//获取到Map集合中所有的键，返回对应的Set集合
		Set<Person04> setkey = map.keySet();
		//取出元素。键找值方式
		//遍历键的集合，获取到每一个键
		for (Person04 key : setkey) {
			//通过键，找到对应的值
			String value = map.get(key);
			System.out.println(key.toString()+"    "+value);
		}
		System.out.println("---------------------------------");
		
		//取出元素。键值对方式Entry
		//获取Map集合中所有的键值对元素,返回对应的Set集合
		Set<Map.Entry<Person04,String>> entrySet = map.entrySet();
		//遍历键值对元素集合，获取到每一个键值对元素对象
		for (Map.Entry<Person04, String> entry : entrySet) {
			//通过键值对元素对象，获取对应的键，和对应的值
			Person04 per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per+"   "+value);
			
		}
	}

}
