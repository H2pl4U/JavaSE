package javaSE;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//����Map����
		Map<String, String> map =  new HashMap<String, String>();
		//��map�������Ԫ��
		map.put("jjf", "fzk");
		map.put("lrh", "yzl");
		System.out.println(map);
		//ȡ��map�����keyֵ��Ӧ��valueֵ
		System.out.println(map.get("jjf"));				  //fzk
		//����Map�����Ԫ�أ��᷵��key��Ӧ��ԭ����valueֵ����keyû�ж�Ӧ��ֵ������null
		System.out.println(map.put("jjf", "ljw"));        //fzk   �����޸�֮ǰ��ֵ
		System.out.println(map.get("jjf"));			      //ljw		�޸ĺ��ֵ
		System.out.println(map.put("aaa", "bbb"));   //   "aaa" ���֮ǰ����map�����У�����null
		System.out.println(map.get("aaa"));    		  // bbb
		System.out.println(map);
		 
		//����keyɾ��Ԫ��,�᷵��key��Ӧ��valueֵ
		System.out.println(map.remove("aaa"));     //���ص�ǰ��ɾ��keyֵ��Ӧ��valueֵ
		System.out.println(map);
	}

}
