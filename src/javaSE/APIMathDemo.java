package javaSE;

public class APIMathDemo {

	public static void main(String[] args) {
		//取绝对值
		double b1 = Math.abs(-5);			//5.0
		double b2 = Math.abs(5);			//5.0
		System.out.println(b1+" "+b2);
		
		//ceil 向上取整的double类型
		double b3 = Math.ceil(3.1415);//4.0
		double b4 = Math.ceil(-3.5);	//-3.0
		double b5 = Math.ceil(3.9); 	//4.0
		System.out.println(b3+" "+b4+" "+b5);
		
		//floor向下取整的double类型
		double b6 = Math.floor(5.11); //5.0
		double b7 = Math.floor(5.9);//5.0
		double b8 = Math.floor(-5.9);//-6.0
		System.out.println(b6+" "+b7+" "+b8);
		
		//max方法，返回两个参数值中较大的值
		double d1 = Math.max(3.3, 5.5); //d1的值为5.5
		System.out.println(d1);
		//min方法，返回两个参数值中较小的值
		double d2 = Math.min(3.3, 5.5); //d1的值为3.3
		System.out.println(d2);
		
		//pow方法，返回第一个参数的第二个参数次幂的值
		double d3 = Math.pow(2.0, 3.0);
		System.out.println(d3);
		
		//round方法，返回参数值四舍五入的结果
		double d4 = Math.round(4.5); //5
		System.out.println(d4);
		d4=Math.round(-4.5); //-4.0
		System.out.println(d4);
		//random方法，产生一个大于等于0.0且小于1.0的double小数
		double d5 = Math.random();
		System.out.println(d5);
	}

}
