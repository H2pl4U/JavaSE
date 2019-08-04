package javaSE;

/*
 * �̱߳��ش洢��Thread Local Storage��
 * ���һ�δ���������Ҫ�����ݱ������������빲��
 * �ǾͿ�����Щ�������ݵĴ����Ƿ��ܱ�֤��ͬһ���߳���ִ�С�
 * ����ܱ�֤�����ǾͿ��԰ѹ������ݵĿɼ���Χ������ͬһ���߳�֮�ڣ�
 * ����������ͬ��Ҳ�ܱ�֤�߳�֮�䲻�����������õ����⡣
 * ���������ص��Ӧ�ò����ټ����󲿷�ʹ�����Ѷ��еļܹ�ģʽ
 * ���硰������-�����ߡ�ģʽ�����Ὣ��Ʒ�����ѹ��̾�����һ���߳���������
 * ����������Ҫ��һ��Ӧ��ʵ�����Ǿ��� Web ����ģ���еġ�һ�������Ӧһ��
 * �������̡߳���Thread-per-Request���Ĵ���ʽ�����ִ���ʽ�Ĺ㷺Ӧ
 * ��ʹ�úܶ� Web �����Ӧ�ö�����ʹ���̱߳��ش洢������̰߳�ȫ���⡣
 * ����ʹ�� java.lang.ThreadLocal ����ʵ���̱߳��ش洢���ܡ�
 * �������´��룬thread1 ������ threadLocal Ϊ 1���� thread2 ����
 *  threadLocal Ϊ 2������һ��ʱ��֮��thread1 ��ȡ threadLocal 
 *  ��Ȼ�� 1������ thread2 ��Ӱ�졣
 * 
 */
public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal threadLocal = new ThreadLocal();
        Thread thread1 = new Thread(() -> {
            threadLocal.set(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadLocal.get());
            threadLocal.remove();
        });
        Thread thread2 = new Thread(() -> {
            threadLocal.set(2);
            threadLocal.remove();
        });
        thread1.start();
        thread2.start();

	}

}
