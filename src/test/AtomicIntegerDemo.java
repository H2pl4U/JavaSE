package test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

	public static void main(String[] args) {
		AtomicInteger cnt = new AtomicInteger();
		//以下代码是 incrementAndGet() 的源码，它调用了 Unsafe 的 getAndAddInt() 。
		cnt.incrementAndGet();
		System.out.println(cnt);
	}
	
//	public final int incrementAndGet() {
//	    return unsafe.getAndAddInt(this, valueOffset, 1) + 1;
//	}
	
	/*
	 * 以下代码是 getAndAddInt() 源码，var1 指示对象内存地址，
	 * var2 指示该字段相对对象内存地址的偏移，var4 指示操作需要加的数值，
	 * 这里为 1。通过 getIntVolatile(var1, var2) 得到旧的预期值，通过
	 * 调用 compareAndSwapInt() 来进行 CAS 比较，如果该字段内存地址中
	 * 的值等于 var5，那么就更新内存地址为 var1+var2 的变量为 var5+var4。
	 * 可以看到 getAndAddInt() 在一个循环中进行，发生冲突的做法是不断的进行重试。
	 */
//	public final int getAndAddInt(Object var1, long var2, int var4) {
//	    int var5;
//	    do {
//	        var5 = this.getIntVolatile(var1, var2);
//	    } while(!this.compareAndSwapInt(var1, var2, var5, var5 + var4));
//
//	    return var5;
//	}

}
