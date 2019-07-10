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
		ArrayList<Student> list = new ArrayList<Student>(); //1.1创建一个可以存储多个同学名字的容器
		/*
		 * 1.存储全班同学信息
		 */
		addStudent(list);
		/*
		 * 2.打印全班同学每一个人的信息（姓名、年龄）
		 */
		printStudent(list);
		/*
		 * 3.随机对学生点名，打印学生信息
		 */
		randomStudent(list);

	}

	private static void randomStudent(ArrayList<Student> list) {
		int index = new Random().nextInt(list.size());
		Student s = list.get(index);
		System.out.println("这次被随机点名的学生名字："+s.getName());
	}

	private static void printStudent(ArrayList<Student> list) {
		for(int i =0;i<list.size();i++){
			Student s = list.get(i);
			System.out.println("学生姓名："+s.getName()+"学生年龄："+s.getAge());
		}
	}

	private static void addStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			Student stu = new Student();
			System.out.println("存储第"+(i+1)+"个学生姓名：");
			String name = sc.next();
			stu.setName(name);
			System.out.println("存储第"+(i+1)+"个学生年龄：");
			int age =sc.nextInt();
			stu.setAge(age);
			list.add(stu);
		}
		sc.close();
	}

}
