package javaSE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFindAllDemo {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		//��map�����Ԫ��
		map.put("�˳�", "��ٳ");
		map.put("�", "������");
		map.put("���»�", "����Ҷ");
		//��ȡMap�е�����key
		Set<String> keySet = map.keySet();
		//�����������key��Set����
		//ע�⣺Map���ϲ���ֱ��ʹ�õ���������foreach���б���������ת��Set֮��Ϳ���ʹ���ˡ�
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			System.out.println(key+"��"+value);
		}	
	}

}
