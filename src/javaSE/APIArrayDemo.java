package javaSE;

import java.util.Arrays;

public class APIArrayDemo {

	public static void main(String[] args) {
		// sort������������ָ�������е�Ԫ�ؽ�������Ԫ��ֵ��С�����������
		int[] arr = new int[]{7,8,5,4,6,1,9,2,3};
		Arrays.sort(arr);
		String str = Arrays.toString(arr);
		System.out.println(str);
		int index1 = Arrays.binarySearch(arr, 5);
		int index2 = Arrays.binarySearch(arr, -2);	//δ�ҵ� ����-1
		System.out.println(index1+"  "+index2);
		int[] ar = new int[]{80,70,77,54,91,85,84,86,79,81};
		String b = Arrays.toString(method01(ar));
		System.out.println(b);
		

	}
	public static int[] method01(int[] arr){
	    Arrays.sort(arr); //��������Ԫ������Ԫ��ֵ��С�����������
	    int[] result = new int[3]; //�洢���������Է���
	    System.arraycopy(arr,0,result,0,3);//��arr����ǰ3��Ԫ�ظ��Ƶ�result������
	return result;
	}

}
