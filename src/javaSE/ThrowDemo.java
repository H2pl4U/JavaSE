package javaSE;
class ArrayTool{
	public static int getElement(int[] arr,int index){
		if(arr==null){
			throw new NullPointerException("arrָ������鲻����");
		}
		if(index<0||index>arr.length){
			throw new ArrayIndexOutOfBoundsException("����ĽǱ꣬"+index+"�����������в�����");
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
