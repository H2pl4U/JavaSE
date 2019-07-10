package javaSE;

public class ParamDemo {

	public static void main(String[] args) {
		int[] arr = {21,32,43};
		int sum=add(arr);
		System.out.println(sum);
		int sum1 = add(23,34,56,65,61,77);
		System.out.println(sum1);
		
	}
	//JDK1.5之后写法
	public static int add(int...arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	//原始写法
		/*
		public static int add(int[] arr) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
		*/

}
