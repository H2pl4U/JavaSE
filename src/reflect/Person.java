package reflect;

public class Person {
	//��Ա����
	public String name;
	public int age;
	private String address;

	//���췽��
	public Person() {
		System.out.println("�ղ������췽��");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("����String�Ĺ��췽��");
	}
	//˽�еĹ��췽��
	private Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("����String��int�Ĺ��췽��");
	}
	
	public Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("����String, int, String�Ĺ��췽��");
	}
	
	//��Ա����
	//û�з���ֵû�в����ķ���
	public void method1(){
		System.out.println("û�з���ֵû�в����ķ���");
	}
	//û�з���ֵ���в����ķ���
	public void method2(String name){
		System.out.println("û�з���ֵ���в����ķ��� name= "+ name);
	}
	//�з���ֵ��û�в���
	public int method3(){
		System.out.println("�з���ֵ��û�в����ķ���");
		return 123;
	}
	//�з���ֵ���в����ķ���
	public String method4(String name){
		System.out.println("�з���ֵ���в����ķ���");
		return "����" + name;
	}
	//˽�з���
	private void method5(){
		System.out.println("˽�з���");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address+ "]";
	}
}