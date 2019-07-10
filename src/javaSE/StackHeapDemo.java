package javaSE;
class Car{
	int num=0;
	String color="white";
	public void run(){
		System.out.println("this car run!");
	}
}
public class StackHeapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.num = 5;
		c.color="red";
		Car c1 =c;			//c1指向c的堆内存地址
		c1.num=6;			//c1改变c中num的值
		c1.color="green";
		c1.run();
		c.run();
		System.out.println(c.num);
		System.out.println(c.color);
		System.out.println(c1.num);
		System.out.println(c1.color);
		
		
		

	}

}
