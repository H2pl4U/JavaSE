package javaSE;
class ArrayTool{
	public static int getElement(int[] arr,int index){
		if(arr==null){
			throw new NullPointerException("arr指向的数组不存在");
		}
		if(index<0||index>arr.length){
			throw new ArrayIndexOutOfBoundsException("错误的角标，"+index+"索引在数组中不存在");
		}
		int element = arr[index];
		return element;
	}
}
public class ThrowDemo {

	public static void main(String[] args) {
		int[] arr = {44,56,84};
		int num = ArrayTool.getElement(arr, 5);
//		int num1 = ArrayTool.getElement(null, 2);
		System.out.println(num);
//		System.out.println(num1);
	}

}
