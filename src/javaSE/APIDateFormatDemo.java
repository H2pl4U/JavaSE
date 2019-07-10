package javaSE;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class APIDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
		Date date = new Date(1607616000000L);
		String str_time = df.format(date);
		System.out.println(str_time);//2020��12��11��
		String str1 = "2020��12��11��";
		DateFormat df1 = new SimpleDateFormat("yyyy��MM��dd��");
		Date date1 = df1.parse(str1);
		System.out.println(date1.getTime());
		
		
		
	}

}
