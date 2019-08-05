package designpattern;

/*
 * �� ˫��У����-�̰߳�ȫ
 * uniqueInstance ֻ��Ҫ��ʵ����һ�Σ�֮��Ϳ���ֱ��ʹ���ˡ�
 * ��������ֻ��Ҫ��ʵ�����ǲ��ֵĴ�����У�ֻ�е� uniqueInstance
 *  û�б�ʵ����ʱ������Ҫ���м�����
 *  ˫��У�������ж� uniqueInstance �Ƿ��Ѿ���ʵ���������û�б�ʵ������
 *  ��ô�Ŷ�ʵ���������м�����
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
