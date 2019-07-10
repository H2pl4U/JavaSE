package test;

import java.util.Scanner;

public class CfkjbTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入几行乘法口诀表:");
		int n = scan.nextInt();
		System.out.println(n);
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++)
			{
				System.out.print(" "+j+"*"+i+"="+i*j);
			}
			System.out.println();
		}
		
		scan.close();	

	}

}
