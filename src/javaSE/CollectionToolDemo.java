package javaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionToolDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("4");
		list.add("9");
		list.add("8");
		list.add("10");
		// ����Ԫ������
		Collections.sort( list ); 
		System.out.println(list);
		//  ����Ԫ�ش洢λ�ô���
		//ÿ��ִ�и÷����������д洢��Ԫ��λ�ö����������
		Collections.shuffle(list);
		System.out.println(list);
	}

}
