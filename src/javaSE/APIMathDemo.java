package javaSE;

public class APIMathDemo {

	public static void main(String[] args) {
		//ȡ����ֵ
		double b1 = Math.abs(-5);			//5.0
		double b2 = Math.abs(5);			//5.0
		System.out.println(b1+" "+b2);
		
		//ceil ����ȡ����double����
		double b3 = Math.ceil(3.1415);//4.0
		double b4 = Math.ceil(-3.5);	//-3.0
		double b5 = Math.ceil(3.9); 	//4.0
		System.out.println(b3+" "+b4+" "+b5);
		
		//floor����ȡ����double����
		double b6 = Math.floor(5.11); //5.0
		double b7 = Math.floor(5.9);//5.0
		double b8 = Math.floor(-5.9);//-6.0
		System.out.println(b6+" "+b7+" "+b8);
		
		//max������������������ֵ�нϴ��ֵ
		double d1 = Math.max(3.3, 5.5); //d1��ֵΪ5.5
		System.out.println(d1);
		//min������������������ֵ�н�С��ֵ
		double d2 = Math.min(3.3, 5.5); //d1��ֵΪ3.3
		System.out.println(d2);
		
		//pow���������ص�һ�������ĵڶ����������ݵ�ֵ
		double d3 = Math.pow(2.0, 3.0);
		System.out.println(d3);
		
		//round���������ز���ֵ��������Ľ��
		double d4 = Math.round(4.5); //5
		System.out.println(d4);
		d4=Math.round(-4.5); //-4.0
		System.out.println(d4);
		//random����������һ�����ڵ���0.0��С��1.0��doubleС��
		double d5 = Math.random();
		System.out.println(d5);
	}

}
