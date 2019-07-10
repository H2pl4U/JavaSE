package test;

public class PrintStreamTest {

	public static void main(String[] args) {
		int[] arr ={1};
		char[] ch = {'a','b'};
		byte[] b = {};
		//除了字符数组打印了元素，别的都打印地址
		System.out.println(arr);
		System.out.println(ch);
		System.out.println(b);
		
		/*
		* 因为api中定义了打印字符数组的方法，其底层是在遍历数组中的元素
		* 而其他打印数组的方法，都是将数组对象编程Object，其底层再将对象编程String，调用了String s = String.valueOf(x);方法
		*/
	}

}
