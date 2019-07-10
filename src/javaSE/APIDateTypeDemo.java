package javaSE;

public class APIDateTypeDemo {

	public static void main(String[] args) {
		System.out.println(Byte.parseByte("123")+2);
		System.out.println(Integer.parseInt("123")+2);
		System.out.println(Short.parseShort("123")+2);
		System.out.println(Long.parseLong("123")+2);
		System.out.println(Double.parseDouble("13.1")+0.4);
		System.out.println(Float.parseFloat("12.5")+2.5);
		System.out.println(Boolean.parseBoolean("false")|true);
		
		//将基本数值转成字符串有3种方式
		int j=12;
		String k=j+"";	//1
		System.out.println(k);
		System.out.println(Integer.valueOf(12));	//2
		System.out.println(Integer.toString(12));  //3
		
		//基本数值---->包装对象
		Integer i = new Integer(4);				//使用构造函数函数
		Integer ii = new Integer("4");			//构造函数中可以传递一个数字字符串
		Integer iii = Integer.valueOf(4);		//使用包装类中的valueOf方法
		Integer iiii = Integer.valueOf("4");	//使用包装类中的valueOf方法
		System.out.println(i+" "+ii+" "+iii+" "+iiii);
		
		//包装对象---->基本数值
		int num = i.intValue();
		System.out.println(num);
		
		
		//自动装箱：基本数值转成对象
		Integer a = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
		//自动拆箱：对象转成基本数值
		a = a + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5; 加法运算完成后，再次装箱，把基本数值转成对象。
		
		//自动装箱(byte常量池)细节的演示
		Integer c = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(c==b);//false
		System.out.println(c.equals(b));//true

		System.out.println("---------------------");
		Integer x = 127;
		Integer y = 127;
		//在jdk1.5自动装箱时，如果数值在byte范围之内，不会新创建对象空间而是使用原来已有的空间。
		System.out.println(x==y); //true
		System.out.println(x.equals(y)); //true
	}

}
