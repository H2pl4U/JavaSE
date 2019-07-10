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
		map.put(new Person04("jjf", 20), "����");
		map.put(new Person04("bjb", 21), "����");
		map.put(new Person04("ljw", 21), "����");
		map.put(new Person04("hhl", 20), "��ұ");
		//��ȡ��Map���������еļ������ض�Ӧ��Set����
		Set<Person04> setkey = map.keySet();
		//ȡ��Ԫ�ء�����ֵ��ʽ
		//�������ļ��ϣ���ȡ��ÿһ����
		for (Person04 key : setkey) {
			//ͨ�������ҵ���Ӧ��ֵ
			String value = map.get(key);
			System.out.println(key.toString()+"    "+value);
		}
		System.out.println("---------------------------------");
		
		//ȡ��Ԫ�ء���ֵ�Է�ʽEntry
		//��ȡMap���������еļ�ֵ��Ԫ��,���ض�Ӧ��Set����
		Set<Map.Entry<Person04,String>> entrySet = map.entrySet();
		//������ֵ��Ԫ�ؼ��ϣ���ȡ��ÿһ����ֵ��Ԫ�ض���
		for (Map.Entry<Person04, String> entry : entrySet) {
			//ͨ����ֵ��Ԫ�ض��󣬻�ȡ��Ӧ�ļ����Ͷ�Ӧ��ֵ
			Person04 per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per+"   "+value);
			
		}
	}

}
