package javaSE;

import java.util.Calendar;
import java.util.Date;

public class APICalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month);   //0��һ�£�11��12��
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		c.add(Calendar.DATE, 3);    //�޸ĵ�ǰʱ����������
		c.add(Calendar.HOUR, 5);	//�޸ĵ�ǰʱ��Ϊ5Сʱ��
		//����ʱ��Ϊ2020��5��20��
		c.set(Calendar.YEAR, 1998);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DATE, 18);
		Calendar today = Calendar.getInstance();
		int day1=c.get(Calendar.DATE);
		int day2=today.get(Calendar.DATE);
		int m1=c.get(Calendar.MONTH);
		int m2=today.get(Calendar.MONTH);
		int y1=c.get(Calendar.YEAR);
		int y2=today.get(Calendar.YEAR);
		int d1 = day2-day1+(m2-m1)*30+(y2-y1)*365;
		System.out.println(d1);
		//��ȡ����������ת�ɵ����ڶ���
		Date d = c.getTime();
		System.out.println(d.getTime());
		
	}

}
