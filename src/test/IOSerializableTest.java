package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 序列化就是将一个对象转换成字节序列，方便存储和传输。
 * 	序列化：ObjectOutputStream.writeObject()
 * 	反序列化：ObjectInputStream.readObject()
 * 
 * 不会对静态变量进行序列化，因为序列化只是保存对象的状态，静态变量属于类的状态。
 */
public class IOSerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		A a1 = new A(123, "abc");
	    String objectFile = "D:\\Java\\FileDemo\\aaaa1";

	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
	    objectOutputStream.writeObject(a1);
	    objectOutputStream.close();

	    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
	    A a2 = (A) objectInputStream.readObject();
	    objectInputStream.close();
	    System.out.println(a2);
	}
	
	/*
	 * 序列化的类需要实现 Serializable 接口，它只是一个标准，
	 * 没有任何方法需要实现，但是如果不去实现它的话而进行序列化，会抛出异常。
	 */
	private static class A implements Serializable {

	    private int x;
	    private String y;

	    A(int x, String y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    public String toString() {
	        return "x = " + x + "  " + "y = " + y;
	    }
	}

}
