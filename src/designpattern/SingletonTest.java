package designpattern;

/*
 * ������ģʽʵ��(ö���ڱ�����)
 */
public class SingletonTest {

	public static void main(String[] args) {
		//���� �̲߳���ȫ
		Singleton1Lazy lazyInstance = Singleton1Lazy.getUniqueInstance();
		//���� �̰߳�ȫ
		Singleton2Huger hugerInstance = new Singleton2Huger();
		//���� �̰߳�ȫ
		Singleton3Lazy lazyInstance2 = Singleton3Lazy.getUniqueInstance();
		//˫��У���� �̰߳�ȫ
		Singleton4Double doubleInstance = Singleton4Double.getUniqueInstance();
		//��̬�ڲ���  �̰߳�ȫ
		Singleton5Static staticInstance = Singleton5Static.getUniqueInstance();
	}

}
