package test;

/*
 * final 
 * 修饰数据时，数据被认定为常量，编译时常量，或者运行时被初始化后不能改变的常量
 * 	对于基本类型，值无法修改
 * 	对于引用类型，无法再引用其他对象
 * 修饰方法时，方法不能被子类重写，若果子类有和父类同名同参的方法时，被认做子类的新方法
 * 修饰类时，表示类无法被继承
 */
public class FinalTest {

	public static void main(String[] args) {
		final int x = 1;
//		x = 2; 		//无法修改
		final String str = new String("jjf");
//		str = new String();  //无法修改
		System.out.println(x+" "+str);
	}

}
