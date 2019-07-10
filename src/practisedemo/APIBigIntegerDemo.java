package practisedemo;

import java.math.BigDecimal;

public class APIBigIntegerDemo {

	public static void main(String[] args) {
//		int a=1;
//		int b=1;
//		int c=0;
		BigDecimal a = new BigDecimal(1);
		BigDecimal b = new BigDecimal(1);
		BigDecimal c = new BigDecimal(0);	
		int i=1;
		while(i<=100){
			c=b;
			b=a;
			b=b.add(c);
			a=c;
			i++;
		}
		System.out.println(b);

	}

}
