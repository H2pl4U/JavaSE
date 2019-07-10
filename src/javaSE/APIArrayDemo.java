package javaSE;

import java.util.Arrays;

public class APIArrayDemo {

	public static void main(String[] args) {
		// sort方法，用来对指定数组中的元素进行排序（元素值从小到大进行排序）
		int[] arr = new int[]{7,8,5,4,6,1,9,2,3};
		Arrays.sort(arr);
		String str = Arrays.toString(arr);
		System.out.println(str);
		int index1 = Arrays.binarySearch(arr, 5);
		int index2 = Arrays.binarySearch(arr, -2);	//未找到 返回-1
		System.out.println(index1+"  "+index2);
		int[] ar = new int[]{80,70,77,54,91,85,84,86,79,81};
		String b = Arrays.toString(method01(ar));
		System.out.println(b);
		

	}
	public static int[] method01(int[] arr){
	    Arrays.sort(arr); //进行数组元素排序（元素值从小到大进行排序）
	    int[] result = new int[3]; //存储后三名考试分数
	    System.arraycopy(arr,0,result,0,3);//把arr数组前3个元素复制到result数组中
	return result;
	}

}
