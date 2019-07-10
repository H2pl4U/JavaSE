package javaSE;

public class ThrowableFunctionDemo {

	public static void main(String[] args) {
		try {
			Person p= null;
			if (p==null) {
				throw new NullPointerException("出现空指针异常了，请检查对象是否为null");
		}
		} catch (NullPointerException e) {
			//getMessage方法：返回该异常的详细信息字符串，即异常提示信息
			String message = e.getMessage();
			System.out.println(message ); 
			
			//toString方法：返回该异常的名称与详细信息字符串
			String result = e.toString();
			System.out.println(result);	
			
			//printStackTrace：在控制台输出该异常的名称与详细信息字符串、
			//异常出现的代码位置异常的常用方法代码演示：
			e.printStackTrace(); 
		}
	}

}
