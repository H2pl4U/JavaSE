package javaSE;
class Person{
	private int age;
	private String name;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name = name;
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
class Student extends Person{
	Student(String name,int age){
		super(name,age);
	}
	public void study(){
		System.out.println(this.getName() + "同学在学习");
	}
}
class Worker extends Person{
	Worker(String name,int age){
		super(name,age);
	}
	public void work(){
		System.out.println(this.getName() + "工人在工作");
	}
}

public class ThisSuperDemo {

	public static void main(String[] args) {
		Student s = new Student("lw",20);
		s.setName("bjb");
		s.study();
		System.out.println(s.getAge()+"   "+s.getName());
		Worker w =new Worker("jjf", 21);
		w.work();
		System.out.println(w.getAge()+"  "+w.getName());
	}

}
