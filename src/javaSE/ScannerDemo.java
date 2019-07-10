package javaSE;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num);
		double db=scan.nextDouble();
		System.out.println(db);
		boolean bl = scan.nextBoolean();
		System.out.println(bl);
		short st = scan.nextShort();
		System.out.println(st);
		String str = scan.next();
		System.out.println(str);
		scan.close();

	}

}
