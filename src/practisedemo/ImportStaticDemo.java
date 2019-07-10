package practisedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import static XXX.YYY;   导入后YYY可直接使用。

import java.util.Set;

public class ImportStaticDemo {

	public static void main(String[] args) {
		//Map.Entry的访问，简化后为Entry
		Map<Person04, String> map = new HashMap<Person04, String>();
		map.put(new Person04("jjf", 20), "天门");
		map.put(new Person04("bjb", 21), "荆门");
		map.put(new Person04("ljw", 21), "襄阳");
		map.put(new Person04("hhl", 20), "大冶");
		Set<Entry<Person04,String>> entrySet = map.entrySet();
		for (Entry<Person04, String> entry : entrySet) {
			Person04 per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per+"   "+value);
			
		}
	}

}
