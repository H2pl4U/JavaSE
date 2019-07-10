package test;

import java.util.Scanner;

public class StaticTest {
	static String name;
	static char sex;
	static short age;
	static float height;
	static String type;

	static void Input(){
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
		scanner.close();
	}
	public static void main(String[] args) {
			
		Input();
		System.out.println(name+" "+sex+" "+age+" "+height+" "+type);

	}

}
