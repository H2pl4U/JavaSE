package designpattern;


/*
 * �� Singleton �౻����ʱ����̬�ڲ��� SingletonHolder û�б����ؽ��ڴ档
 * ֻ�е����� getUniqueInstance() �����Ӷ����� SingletonHolder.INSTANCE 
 * ʱ SingletonHolder �Żᱻ���أ���ʱ��ʼ�� INSTANCE ʵ�������� JVM ��ȷ
 * �� INSTANCE ֻ��ʵ����һ�Ρ�
 * 
 * ���ַ�ʽ���������ӳٳ�ʼ���ĺô��������� JVM �ṩ�˶��̰߳�ȫ��֧�֡�
 */
public class Singleton5Static {
	private Singleton5Static() {
    }

    private static class SingletonHolder {
        private static final Singleton5Static INSTANCE = new Singleton5Static();
    }

    public static Singleton5Static getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}
