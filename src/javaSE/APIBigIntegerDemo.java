package javaSE;

import java.math.BigDecimal;

public class APIBigIntegerDemo {

	public static void main(String[] args) {
		System.out.println(0.09 + 1.01);
	    System.out.println(1.0 - 0.32);
	    System.out.println(1.015 * 100);
	    System.out.println(1.301 / 100);
	    /*double和float类型在运算中很容易丢失精度,
	     * 造成数据的不准确性
	     */
	    System.out.println("----------------------");
	    
	    BigDecimal bd1 = new BigDecimal(0.09);
	    BigDecimal bd2 = new BigDecimal(1.01);
	    BigDecimal AddBd = bd1.add(bd2);
	    System.out.println(AddBd);
	    BigDecimal big3 = new BigDecimal("1.0");
        BigDecimal big4 = new BigDecimal("0.32");
        System.out.println(big3.subtract(big4));
        BigDecimal big5 = new BigDecimal("1.105");
        BigDecimal big6 = new BigDecimal("100");
        System.out.println(big5.multiply(big6));
        
	}

}
