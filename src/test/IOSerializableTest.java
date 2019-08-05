package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ���л����ǽ�һ������ת�����ֽ����У�����洢�ʹ��䡣
 * 	���л���ObjectOutputStream.writeObject()
 * 	�����л���ObjectInputStream.readObject()
 * 
 * ����Ծ�̬�����������л�����Ϊ���л�ֻ�Ǳ�������״̬����̬�����������״̬��
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
	 * ���л�������Ҫʵ�� Serializable �ӿڣ���ֻ��һ����׼��
	 * û���κη�����Ҫʵ�֣����������ȥʵ�����Ļ����������л������׳��쳣��
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
