package javaSE;

class ArrayTools {
	// �Ը���������ͨ�������ĽǱ��ȡԪ�ء�
	public static int getElement(int[] arr, int index) {
		int element = arr[index];
		return element;
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] arr = { 34, 12, 67 };
		// ��������һ����������Խ���쳣ArrayIndexOfBoundsException
		int num = ArrayTools.getElement(arr, 3); // û���ҵ�3������(����Խ��)
		System.out.println("num=" + num);
		System.out.println("over");
	}

}
