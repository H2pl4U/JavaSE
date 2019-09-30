package javaSE;

import java.util.Random;

/*
 * API
 */
public class APISystemDemo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0;i<=100;i++){
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("need:"+(end-start)+"ms");
		
		int[] src = new int[]{1,2,3,4,5};
		int[] dest = new int[]{6,7,8,9,10};
		System.arraycopy(src, 0, dest, 0, 3);
		for(int i=0;i<dest.length;i++){
			System.out.println(dest[i]);
		}
		Random rd = new Random();
		while(true){
			int num = rd.nextInt(899)+100;
			System.out.println(num);
			if(num%10==0)
				System.exit(0);
		}
	}

}
