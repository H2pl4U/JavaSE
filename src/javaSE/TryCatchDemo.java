package javaSE;

public class TryCatchDemo {
	
	//throws ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		int[] arr = new int[3];
		try{
			System.out.println(arr[5]);	// 会抛出ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e){		 //try中抛出的是什么异常，在括号中就定义什么异常类型。 
			System.out.println("发生异常");
		}finally {
            arr = null; 	//把数组指向null，通过垃圾回收器，进行内存垃圾的清除
		}
		
	}

}
