package javaSE;

import java.util.Date;

public class APIDateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Date date1 = new Date(1607616000000L);
		System.out.println(date1);
		System.out.println(date.getTime());				//��ȡ��1970��1��1��0�㵽��ǰʱ�̵���ʱ�� ����
		System.out.println(date1.after(date));			//�ж�date1�Ƿ��ڵ�ǰʱ��֮��
		System.out.println(date1.before(date));      //�ж�date1�Ƿ��ڵ�ǰʱ��֮��
		
	}

}
