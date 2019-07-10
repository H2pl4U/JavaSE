package javaSE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFindAllDemo {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		//给map中添加元素
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		map.put("刘德华", "朱丽叶");
		//获取Map中的所有key
		Set<String> keySet = map.keySet();
		//遍历存放所有key的Set集合
		//注意：Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+"与"+value);
		}	
	}

}
