package javaSE;
class Person01{
	public void eat(){
		System.out.println("�Է�");
}
}
class Demo02 {
	public static Person01 getPerson01(){
		//��ͨ��ʽ
		//Person01 p = new Person01();	
		//return p;
		
		//����������Ϊ��������ֵ
		return new Person01(); 
	}
	
	public static void method(Person01 p){}
}
public class OOPUnknownObjDemo {

	public static void main(String[] args) {
		//����getPerson01�������õ�һ��Person01����
				Person01 Person01 = Demo02.getPerson01();
				
				//����method����
				Demo02.method(Person01);
				//����������Ϊ�������յĲ���
				Demo02.method(new Person01());
		
	}

}
