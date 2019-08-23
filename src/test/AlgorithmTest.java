package test;

import java.util.Scanner;
 
/*
 * 找出最大值最小值
 */
public class AlgorithmTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int cout=0;
		int[] arr = new int[max-min+2];
		for(int j=min;j<=max;j++) {
		int count=1;
		int i = j;
		while(i>1){
			if(i%2==0){
				i=i/2;		
			}else {
				i=3*i+1;
			}
			count++;
		}
		arr[cout]=count;
		cout++;
		}
		int maxc=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxc){
				maxc=arr[i];
			}
		}
		System.out.println(min+" "+max+" "+maxc);
		scan.close();
	}
}
