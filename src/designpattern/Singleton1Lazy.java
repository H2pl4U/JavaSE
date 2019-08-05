package designpattern;

/*
 * �� ����ʽ-�̲߳���ȫ
 * ����ʵ���У�˽�о�̬���� uniqueInstance ���ӳ�ʵ������
 * �������ĺô��ǣ����û���õ����࣬��ô�Ͳ���ʵ���� uniqueInstance��
 * �Ӷ���Լ��Դ��
 * ���ʵ���ڶ��̻߳������ǲ���ȫ�ģ��������߳��ܹ�ͬʱ���� 
 * if (uniqueInstance == null) �����Ҵ�ʱ uniqueInstance Ϊ null��
 * ��ô���ж���߳�ִ�� uniqueInstance = new Singleton(); ��䣬
 * �⽫����ʵ������� uniqueInstance��
 */
public class Singleton1Lazy {
	private static Singleton1Lazy uniqueInstance;

    private Singleton1Lazy() {
    }

    public static Singleton1Lazy getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1Lazy();
        }
        return uniqueInstance;
    }
}
