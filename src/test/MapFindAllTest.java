package test;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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

public class MapFindAllTest {

	public static void main(String[] args) {
		Map<Person04,String> map= new HashMap<Person04,String>();
		map.put(new Person04("jjf", 20), "天门");
		map.put(new Person04("bjb", 21), "荆门");
		map.put(new Person04("ljw", 21), "襄阳");
		map.put(new Person04("hhl", 20), "大冶");
		System.out.println("第一种：");
		Set<Person04> keyset = map.keySet();
		for (Person04 per : keyset) {
			String value = map.get(per);
			System.out.println(per.toString()+"  "+value);
		}
		
		System.out.println("第二种：");
		Set<Map.Entry<Person04,String>> set = map.entrySet();
		for (Entry<Person04, String> entry : set) {
			Person04 per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per.toString()+"  "+value);
		}
		

	}

}
