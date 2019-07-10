package test;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int row = scan.nextInt();
	    int[][] arr = new int[row][];
	    for(int i=0;i<row;i++) {
	    	arr[i] = new int[i+1];
	    	for(int j=0;j<=i;j++) {
	    		if(j==0&&j==i) {
	    			arr[i][j]=1;
	    		}else{
	    			arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
	    		}
	    		System.out.println(arr[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    scan.close();
	}

}
