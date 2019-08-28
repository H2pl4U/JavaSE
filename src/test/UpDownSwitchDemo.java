package test;

//import java.util.ArrayList;
//import java.util.LinkedList;

/*
 * 向上转型 : 通过子类对象(小范围)实例化父类对象(大范围),这种属于自动转换
 * 向下转型 : 通过父类对象(大范围)实例化子类对象(小范围),这种属于强制转换
 * 
 * 向上转型时,父类只能调用父类方法或者子类覆写后的方法,而子类中的单独方法则是无法调用的.
 * 通过向下转型来调用B类和C类独有的方法.
 */

class Father{
	public void smoke() {
		
	}
	
	public void drive() {
		
	}
}


class Son extends Father{
	public void play() {
		
	}
}
public class UpDownSwitchDemo {

	
	public static void main(String[] args) {
		//向上转型 自动
		double x = 1.3f;
		//向下转型 手动
		float y = (float)1.3;
		System.out.println(x+"  "+y);
		
		Son son = new Son();
	    //首先先明确一点，转型指的是左侧引用的改变。
	    //father引用类型是Father，指向Son实例，就是向上转型，既可以使用子类的方法，也可以使用父类的方法。
	    //向上转型,此时运行father的方法
	    Father father = son;
	    father.smoke();
	    //不能使用子类独有的方法。
	    // father.play();编译会报错
	    father.drive();
	    //Son类型的引用指向Father的实例，所以是向下转型，不能使用子类非重写的方法，可以使用父类的方法。

	    //向下转型，此时运行了son的方法
	    Son son1 = (Son) father;
	    //转型后就是一个正常的Son实例
	    son1.play();
	    son1.drive();
	    son1.smoke();

	    //因为向下转型之前必须先经历向上转型。
	    //在向下转型过程中，分为两种情况：

	    //情况一：如果父类引用的对象如果引用的是指向的子类对象，
	    //那么在向下转型的过程中是安全的。也就是编译是不会出错误的。
	    //因为运行期Son实例确实有这些方法
	    Father f1 = new Son();
	    Son s1 = (Son) f1;
	    s1.smoke();
	    s1.drive();
	    s1.play();

	    //情况二：如果父类引用的对象是父类本身，那么在向下转型的过程中是不安全的，编译不会出错，
	    //但是运行时会出现java.lang.ClassCastException错误。它可以使用instanceof来避免出错此类错误。
	    //因为运行期Father实例并没有这些方法。
	        Father f2 = new Father();
	        Son s2 = (Son) f2;
	        s2.drive();
	        s2.smoke();
	        s2.play();

	    //向下转型和向上转型的应用，有些人觉得这个操作没意义，何必先向上转型再向下转型呢，不是多此一举么。其实可以用于方法参数中的类型聚合，然后具体操作再进行分解。
	    //比如add方法用List引用类型作为参数传入，传入具体类时经历了向下转型
	    //add(new LinkedList());
	    //add(new ArrayList());

	    //总结
	    //向上转型和向下转型都是针对引用的转型，是编译期进行的转型，根据引用类型来判断使用哪个方法
	    //并且在传入方法时会自动进行转型（有需要的话）。运行期将引用指向实例，如果是不安全的转型则会报错。
	    //若安全则继续执行方法。

	}

}
