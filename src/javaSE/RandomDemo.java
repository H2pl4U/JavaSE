package javaSE;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int i = ran.nextInt(100);
		System.out.println(i+1);               //生成1~100内的随机整数
		double db = ran.nextDouble(); // 随机生成0到1随机的小数，不包括1
		System.out.println(db);

	}

}
