package designpattern;

/*
 * Ⅳ 双重校验锁-线程安全
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance
 *  没有被实例化时，才需要进行加锁。
 *  双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，
 *  那么才对实例化语句进行加锁。
 */
public class Singleton4Double {
	private volatile static Singleton4Double uniqueInstance;

    private Singleton4Double() {
    }

    public static Singleton4Double getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4Double.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4Double();
                }
            }
        }
        return uniqueInstance;
    }
}
