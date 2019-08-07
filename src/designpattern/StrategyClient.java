package designpattern;

/*
 * ���ԣ�Strategy��
 * ����һϵ���㷨����װÿ���㷨����ʹ���ǿ��Ի�����
 * ����ģʽ�������㷨������ʹ�����Ŀͻ��ˡ�
 * 
 * Strategy �ӿڶ�����һ���㷨�壬���Ƕ�ʵ���� behavior() ������
 * Context ��ʹ�õ����㷨����࣬���е� doSomething() ��������� behavior()��
 * setStrategy(Strategy) �������Զ�̬�ظı� strategy ����Ҳ����˵�ܶ�̬��
 * �ı� Context ��ʹ�õ��㷨��
 * 
 */
interface QuackBehavior {
	void quack();
}

class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("quack!");
	}
}

class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("squeak!");
	}
}

class Duck {

	private QuackBehavior quackBehavior;

	public void performQuack() {
		if (quackBehavior != null) {
			quackBehavior.quack();
		}
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}

/*
 * ���һ��Ѽ�ӣ������Զ�̬�ظı������������㷨����Ѽ�ӵĽ�����Ϊ��
 */
public class StrategyClient {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.setQuackBehavior(new Squeak());
		duck.performQuack();
		duck.setQuackBehavior(new Quack());
		duck.performQuack();
	}
	
	/*
	 * ��״̬ģʽ�ıȽ� 
	 * 
	 * ״̬ģʽ����ͼ�Ͳ���ģʽ���ƣ����Ҷ����ܹ���̬�ı�������Ϊ������״̬ģʽ��ͨ��״̬ת�����ı� Context ����ϵ� State
	 * ���󣬶�����ģʽ��ͨ�� Context ����ľ������ı���ϵ� Strategy ������ν��״̬ת�ƣ���ָ Context
	 * �����й���������һЩ���������ı��ʹ�� State �������ı䣬ע�����Ҫ�������й����С�
	 * 
	 * ״̬ģʽ��Ҫ���������״̬ת�Ƶ����⣬��״̬����ת���ˣ���ô Context
	 * ����ͻ�ı�������Ϊ��������ģʽ��Ҫ��������װһ����Ի���������㷨�壬���ҿ��Ը�����Ҫ��̬��ȥ�滻 Context ʹ�õ��㷨��
	 */
}
