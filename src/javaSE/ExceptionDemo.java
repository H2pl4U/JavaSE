package javaSE;

class ArrayTools {
	// 对给定的数组通过给定的角标获取元素。
	public static int getElement(int[] arr, int index) {
		int element = arr[index];
		return element;
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = { 34, 12, 67 };
		// 程序会产生一个数组索引越界异常ArrayIndexOfBoundsException
		int num = ArrayTools.getElement(arr, 3); // 没有找到3的索引(数组越界)
		System.out.println("num=" + num);
		System.out.println("over");
	}

}
