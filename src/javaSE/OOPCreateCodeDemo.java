package javaSE;
class Person03 {
	private String name;
	private int age;
	
	Person03(){
		System.out.println("Person03�޲����Ĺ��캯��ִ��");
	}
	Person03(int age){
		this.age = age;
		System.out.println("Person03��age�������Ĺ��캯��ִ��");
	}
	   //��������
		{
			System.out.println("��������ִ����");
		}
		//���쾲̬�����  �����ڹ�������
		static{
			System.out.println("��̬�����ִ����");
		}
		@Override
		public String toString() {
			return "Person03 [name=" + name + ", age=" + age + "]";
		}
		
}
public class OOPCreateCodeDemo {
	static{
		System.out.println("Demo�еľ�̬�����");
	}

	public static void main(String[] args) {
		{
			System.out.println("�����");
		}
		Person03 p = new Person03();
		Person03 p1 = new Person03(23);
		System.out.println("p:"+p+" p1:"+p1);
		
	}

}
