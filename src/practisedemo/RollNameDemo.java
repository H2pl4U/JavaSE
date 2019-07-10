package practisedemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Student{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
}

public class RollNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>(); //1.1����һ�����Դ洢���ͬѧ���ֵ�����
		/*
		 * 1.�洢ȫ��ͬѧ��Ϣ
		 */
		addStudent(list);
		/*
		 * 2.��ӡȫ��ͬѧÿһ���˵���Ϣ�����������䣩
		 */
		printStudent(list);
		/*
		 * 3.�����ѧ����������ӡѧ����Ϣ
		 */
		randomStudent(list);

	}

	private static void randomStudent(ArrayList<Student> list) {
		int index = new Random().nextInt(list.size());
		Student s = list.get(index);
		System.out.println("��α����������ѧ�����֣�"+s.getName());
	}

	private static void printStudent(ArrayList<Student> list) {
		for(int i =0;i<list.size();i++){
			Student s = list.get(i);
			System.out.println("ѧ��������"+s.getName()+"ѧ�����䣺"+s.getAge());
		}
	}

	private static void addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			Student stu = new Student();
			System.out.println("�洢��"+(i+1)+"��ѧ��������");
			String name = sc.next();
			stu.setName(name);
			System.out.println("�洢��"+(i+1)+"��ѧ�����䣺");
			int age =sc.nextInt();
			stu.setAge(age);
			list.add(stu);
		}
		sc.close();
	}

}
