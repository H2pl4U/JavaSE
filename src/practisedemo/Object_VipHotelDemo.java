package practisedemo;

import java.util.ArrayList;
import java.util.Random;

interface VIP{
	public abstract void serve();
}
abstract class Employee02{
	private String name;
	private String id;
	public Employee02(){
		super();
	}
	public Employee02(String name,String id){
		super();
		this.name=name;
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public abstract void work();
}
class Waiter extends Employee02 implements VIP{
	public Waiter(){
		super();
	}
	public Waiter(String name,String id){
		super(name,id);
	}
	public void work(){
		System.out.println("����Ա����Ϊ�����");
	}
	public void serve(){
		System.out.println("����Ա����ΪVIP����");
	}
}
class Chef extends Employee02 implements VIP{
	public Chef(){
		super();
	}
	public Chef(String name,String id){
		super(name,id);
	}
	public void work(){
		System.out.println("��ʦ����Ϊ�����ˣ�");
	}
	public void serve(){
		System.out.println("��ʦ����ΪVIP���ˣ�");
	}
}
class Manager extends Employee02{
	private double reward;
	public Manager(){
		super();
	}
	public Manager(String name,String id,double reward){
		super(name,id);
		this.reward=reward;
	}
	public void work(){
		System.out.println("�������ڶ��ٷ���Ա�ͳ�ʦ��");
	}
	public void setReward(double reward){
		this.reward=reward;
	}
	public double getReward(){
		return this.reward;
	}
	
}

public class Object_VipHotelDemo {

	public static void main(String[] args) {
		ArrayList<Employee02> list = new ArrayList<Employee02>();
		AddEmp(list);
		LuckeyEmp(list);
	}

	private static void LuckeyEmp(ArrayList<Employee02> list) {
		int index = new Random().nextInt(list.size());
		Employee02 emp = list.get(index);
		System.out.println("����Ա����������"+emp.getName());
		list.get(0).work();
		list.get(1).work();
		
	}

	private static void AddEmp(ArrayList<Employee02> list) {
		Employee02 a = new Manager("bjb","004",1000);
		Employee02 b = new Chef("ljw","003");
		Employee02 c = new Waiter("jrf","002");
		Employee02 d = new Waiter("jjf", "001");
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
	}

}
