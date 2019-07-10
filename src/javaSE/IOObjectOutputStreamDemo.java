package javaSE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ����Ҫ���л������ϼӱ�ǡ��ñ����û���κγ��󷽷�
 * ֻ��ʵ���� Serializable�ӿڵ���Ķ�����ܱ����л�
 */
class Person05 implements Serializable{
//	����ÿ�α�����ʱ���ɵ�serialVersionUIDֵ���ǹ̶���
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
	* A: ��̬�������л�
	* a: ԭ��
	* ���л��ǰѶ������ݽ��г־û��洢
	* ��̬�Ķ��������ڶ��󣬶�������
	* 
    * B: transient�ؼ���
	* b: ����
	* ��transient���ε����Բ��ᱻ���л�
	* transient�ؼ���ֻ�����γ�Ա����
	*/
public class IOObjectOutputStreamDemo {
	
	
	/*
	 *  IO������,ʵ�ֶ���Person���л�,�ͷ����л�
	 *  ObjectOutputStream д����,ʵ�����л�
	 *  ObjectInputStream ��ȡ����,ʵ�ַ����л�
	 */

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		readObject();
	}
		/*
		 * ObjectInputStream
		 * ���췽��:ObjectInputStream(InputStream in)
		 * ����������ֽ�������,��������װ�ļ�,���������л����ļ�
		 * Object readObject()  ��ȡ����
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
	 * ���췽��: ObjectOutputStream(OutputSteam out)
	 * ����������ֽ������
	 * void writeObject(Object obj)д������ķ���
	 */

	private static void writeObject() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("D:\\Java\\FileDemo\\oostest01.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Person05("jjf", 20));
		oos.close();
	}

}
