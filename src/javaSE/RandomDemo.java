package javaSE;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int i = ran.nextInt(100);
		System.out.println(i+1);               //����1~100�ڵ��������
		double db = ran.nextDouble(); // �������0��1�����С����������1
		System.out.println(db);

	}

}
