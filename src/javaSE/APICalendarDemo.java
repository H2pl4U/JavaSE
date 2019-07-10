package javaSE;

import java.util.Calendar;
import java.util.Date;

public class APICalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		int month = c.get(Calendar.MONTH);
		System.out.println(month);   //0是一月，11是12月
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		c.add(Calendar.DATE, 3);    //修改当前时间增加三天
		c.add(Calendar.HOUR, 5);	//修改当前时间为5小时后
		//设置时间为2020年5月20日
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
		//获取该日历对象转成的日期对象
		Date d = c.getTime();
		System.out.println(d.getTime());
		
	}

}
