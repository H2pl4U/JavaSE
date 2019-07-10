package javaSE;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//创建Map对象
		Map<String, String> map =  new HashMap<String, String>();
		//给map对象添加元素
		map.put("jjf", "fzk");
		map.put("lrh", "yzl");
		System.out.println(map);
		//取出map对象的key值对应的value值
		System.out.println(map.get("jjf"));				  //fzk
		//当给Map中添加元素，会返回key对应的原来的value值，若key没有对应的值，返回null
		System.out.println(map.put("jjf", "ljw"));        //fzk   返回修改之前的值
		System.out.println(map.get("jjf"));			      //ljw		修改后的值
		System.out.println(map.put("aaa", "bbb"));   //   "aaa" 添加之前不在map对象中，返回null
		System.out.println(map.get("aaa"));    		  // bbb
		System.out.println(map);
		 
		//根据key删除元素,会返回key对应的value值
		System.out.println(map.remove("aaa"));     //返回当前被删除key值对应的value值
		System.out.println(map);
	}

}
