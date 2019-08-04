package test;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

	public static void main(String[] args) {
		AtomicInteger cnt = new AtomicInteger();
		//���´����� incrementAndGet() ��Դ�룬�������� Unsafe �� getAndAddInt() ��
		cnt.incrementAndGet();
		System.out.println(cnt);
	}
	
//	public final int incrementAndGet() {
//	    return unsafe.getAndAddInt(this, valueOffset, 1) + 1;
//	}
	
	/*
	 * ���´����� getAndAddInt() Դ�룬var1 ָʾ�����ڴ��ַ��
	 * var2 ָʾ���ֶ���Զ����ڴ��ַ��ƫ�ƣ�var4 ָʾ������Ҫ�ӵ���ֵ��
	 * ����Ϊ 1��ͨ�� getIntVolatile(var1, var2) �õ��ɵ�Ԥ��ֵ��ͨ��
	 * ���� compareAndSwapInt() ������ CAS �Ƚϣ�������ֶ��ڴ��ַ��
	 * ��ֵ���� var5����ô�͸����ڴ��ַΪ var1+var2 �ı���Ϊ var5+var4��
	 * ���Կ��� getAndAddInt() ��һ��ѭ���н��У�������ͻ�������ǲ��ϵĽ������ԡ�
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
