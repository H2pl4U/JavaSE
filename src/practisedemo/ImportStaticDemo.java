package practisedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import static XXX.YYY;   �����YYY��ֱ��ʹ�á�

import java.util.Set;

public class ImportStaticDemo {

	public static void main(String[] args) {
		//Map.Entry�ķ��ʣ��򻯺�ΪEntry
		Map<Person04, String> map = new HashMap<Person04, String>();
		map.put(new Person04("jjf", 20), "����");
		map.put(new Person04("bjb", 21), "����");
		map.put(new Person04("ljw", 21), "����");
		map.put(new Person04("hhl", 20), "��ұ");
		Set<Entry<Person04,String>> entrySet = map.entrySet();
		for (Entry<Person04, String> entry : entrySet) {
			Person04 per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per+"   "+value);
			
		}
	}

}
