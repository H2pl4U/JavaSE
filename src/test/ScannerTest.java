package test;

import java.util.Scanner;

public class ScannerTest {
	static String name;
	static char sex;
	static short age;
	static float height;
	static String type;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("name:");
		name=scanner.next();
		System.out.print("sex:");
		sex=scanner.next().charAt(0);
		System.out.print("age:");
		age=scanner.nextShort();
		System.out.print("height:");
		height=scanner.nextFloat();
		System.out.print("type:");
		type=scanner.next();
		System.out.println(name+" "+sex+" "+age+" "+height+" "+type);
		scanner.close();
	}

}
