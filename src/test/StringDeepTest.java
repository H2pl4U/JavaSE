package test;

public class StringDeepTest {

	public static void main(String[] args) {
		//1连接方式
	    String s1 = "a";
	    String s2 = "a";
	    String s3 = "a" + s2;
	    String s4 = "a" + "a";
	    String s5 = s1 + s2;
	    s1.intern();
	    //表达式只有常量时，编译期完成计算
	    //表达式有变量时，运行期才计算，所以地址不一样
	    System.out.println(s3 == s4); //f
	    System.out.println(s3 == s5); //f
	    System.out.println(s4 == "aa"); //t
	    String ss = new String("1")+new String("2");
	    System.out.println(ss.intern()==ss); //t
	    
	    //2：string的intern使用
	    //s1是基本类型，比较值。s2是string实例，比较实例地址
	    //字符串类型用equals方法比较时只会比较值
	    String ss1 = "a";
	    String ss2 = new String("a");
	    //调用intern时,如果s2中的字符不在常量池，则加入常量池并返回常量的引用
	    String ss3 = ss2.intern();
	    System.out.println(ss1 == ss2);	//false
	    System.out.println(ss1 == ss3);	//true
	}

}
