package designpattern;

/*
 * �ն���Null��
 * ʹ��ʲô�������Ŀն��������� NULL��
 * 
 * һ���������� NULL����ζ�ŷ����ĵ��ö���Ҫȥ��鷵��ֵ�Ƿ��� NULL��
 * ��ô���ᵼ�·ǳ��������ļ����롣�������ĳһ�����ö���������
 * �����鷵��ֵ����ֱ��ʹ�÷��صĶ�����ô���п����׳���ָ���쳣��
*/
abstract class AbstractOperation {
	abstract void request();
}

class RealOperation extends AbstractOperation {
	@Override
	void request() {
		System.out.println("do something");
	}
}

class NullOperation extends AbstractOperation {
	@Override
	void request() {
		// do nothing
	}
}

public class NullClient {

	public static void main(String[] args) {
		AbstractOperation abstractOperation = func(-1);
		abstractOperation.request();
	}

	public static AbstractOperation func(int para) {
		if (para < 0) {
			return new NullOperation();
		}
		return new RealOperation();
	}

}
