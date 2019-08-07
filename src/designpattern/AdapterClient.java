package designpattern;

/*
 * ��������Adapter��
 * ��һ����ӿ�ת������һ���û���Ҫ�Ľӿڡ�
 * 
 * Ѽ�ӣ�Duck���ͻ𼦣�Turkey��ӵ�в�ͬ�Ľ�����Duck �Ľ������� quack() ������
 * �� Turkey ���� gobble() ������Ҫ�� Turkey �� gobble() ��������� Duck �� 
 * quack() �������Ӷ��û�ð��Ѽ�ӣ�
 */

//Ѽ��
interface Duckk {
	void quack();
}

//��
interface Turkey {
	void gobble();
}

class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("gobble!");
	}
}

class TurkeyAdapter implements Duckk {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}
}

public class AdapterClient {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duckk Duckk = new TurkeyAdapter(turkey);
		Duckk.quack();
	}

}
