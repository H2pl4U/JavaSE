package javaSE;

import java.util.Date;

public class APIDateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Date date1 = new Date(1607616000000L);
		System.out.println(date1);
		System.out.println(date.getTime());				//获取从1970年1月1日0点到当前时刻的总时间 毫秒
		System.out.println(date1.after(date));			//判断date1是否在当前时间之后
		System.out.println(date1.before(date));      //判断date1是否在当前时间之后
		
	}

}
