package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 给需要序列化的类上加标记。该标记中没有任何抽象方法
 * 只有实现了 Serializable接口的类的对象才能被序列化
 */
class Person05 implements Serializable{
//	这样每次编译类时生成的serialVersionUID值都是固定的
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person05(){
		super();
	}
	public Person05(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person05 [name=" + name + ", age=" + age + "]";
	}
	
}
  /*
	* A: 静态不能序列化
	* a: 原因
	* 序列化是把对象数据进行持久化存储
	* 静态的东西不属于对象，而属于类
	* 
    * B: transient关键字
	* b: 作用
	* 被transient修饰的属性不会被序列化
	* transient关键字只能修饰成员变量
	*/
public class IOObjectOutputStreamDemo {
	
	
	/*
	 *  IO流对象,实现对象Person序列化,和反序列化
	 *  ObjectOutputStream 写对象,实现序列化
	 *  ObjectInputStream 读取对象,实现反序列化
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		readObject();
	}
		/*
		 * ObjectInputStream
		 * 构造方法:ObjectInputStream(InputStream in)
		 * 传递任意的字节输入流,输入流封装文件,必须是序列化的文件
		 * Object readObject()  读取对象
		 */
	private static void readObject() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(new File("D:\\Java\\FileDemo\\oostest01.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object per = ois.readObject();
		System.out.println(per);
		ois.close();
		
	}
	
	
	
	/*
	 * ObjectOutputStream
	 * 构造方法: ObjectOutputStream(OutputSteam out)
	 * 传递任意的字节输出流
	 * void writeObject(Object obj)写出对象的方法
	 */

	private static void writeObject() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\FileDemo\\oostest01.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Person05("jjf", 20));
		oos.close();
	}

}
