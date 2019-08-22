package designpattern;

/*
 * 各单例模式实现(枚举在本类中)
 */
public class SingletonTest {

	public static void main(String[] args) {
		//懒汉 线程不安全
		Singleton1Lazy lazyInstance = Singleton1Lazy.getUniqueInstance();
		//饿汉 线程安全
		Singleton2Huger hugerInstance = new Singleton2Huger();
		//懒汉 线程安全
		Singleton3Lazy lazyInstance2 = Singleton3Lazy.getUniqueInstance();
		//双重校验锁 线程安全
		Singleton4Double doubleInstance = Singleton4Double.getUniqueInstance();
		//静态内部类  线程安全
		Singleton5Static staticInstance = Singleton5Static.getUniqueInstance();
	}

}
