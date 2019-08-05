package designpattern;

/*
 * Ⅲ 懒汉式-线程安全
 * 只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有
 * 一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
 * 
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，
 * 即使 uniqueInstance 已经被实例化了。这会让线程阻塞时间过长，因此
 * 该方法有性能问题，不推荐使用。
 */
public class Singleton3Lazy {
	private static Singleton3Lazy uniqueInstance;

    private Singleton3Lazy() {
    }
    
	public static synchronized Singleton3Lazy getUniqueInstance() {
	    if (uniqueInstance == null) {
	        uniqueInstance = new Singleton3Lazy();
	    }
	    return uniqueInstance;
	}

}
