package designpattern;

/*
 * �� ����ʽ-�̰߳�ȫ
 * ֻ��Ҫ�� getUniqueInstance() ������������ô��һ��ʱ���ֻ����
 * һ���߳��ܹ�����÷������Ӷ�������ʵ������� uniqueInstance��
 * 
 * ���ǵ�һ���߳̽���÷���֮��������ͼ����÷������̶߳�����ȴ���
 * ��ʹ uniqueInstance �Ѿ���ʵ�����ˡ�������߳�����ʱ����������
 * �÷������������⣬���Ƽ�ʹ�á�
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
