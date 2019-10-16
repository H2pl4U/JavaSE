package designpattern;

/*
 * �Žӣ�Bridge��
 * ��������ʵ�ַ��뿪����ʹ���ǿ��Զ����仯��
 * Abstraction�����������Ľӿ�
 * Implementor������ʵ����ӿ�
 * 
 * RemoteControl ��ʾң������ָ�� Abstraction��
 * TV ��ʾ���ӣ�ָ�� Implementor��
 * �Ž�ģʽ��ң�����͵��ӷ��뿪�����Ӷ����Զ����ı�ң�������ߵ��ӵ�ʵ�֡�
 */
abstract class TV {
	public abstract void on();

	public abstract void off();

	public abstract void tuneChannel();
}

class Sony extends TV {
	@Override
	public void on() {
		System.out.println("Sony.on()");
	}

	@Override
	public void off() {
		System.out.println("Sony.off()");
	}

	@Override
	public void tuneChannel() {
		System.out.println("Sony.tuneChannel()");
	}
}

class RCA extends TV {
	@Override
	public void on() {
		System.out.println("RCA.on()");
	}

	@Override
	public void off() {
		System.out.println("RCA.off()");
	}

	@Override
	public void tuneChannel() {
		System.out.println("RCA.tuneChannel()");
	}
}

abstract class RemoteControl {
	protected TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}

	public abstract void on();

	public abstract void off();

	public abstract void tuneChannel();
}

class ConcreteRemoteControl1 extends RemoteControl {
	public ConcreteRemoteControl1(TV tv) {
		super(tv);
	}

	@Override
	public void on() {
		System.out.println("ConcreteRemoteControl1.on()");
		tv.on();
	}

	@Override
	public void off() {
		System.out.println("ConcreteRemoteControl1.off()");
		tv.off();
	}

	@Override
	public void tuneChannel() {
		System.out.println("ConcreteRemoteControl1.tuneChannel()");
		tv.tuneChannel();
	}
}

class ConcreteRemoteControl2 extends RemoteControl {
	public ConcreteRemoteControl2(TV tv) {
		super(tv);
	}

	@Override
	public void on() {
		System.out.println("ConcreteRemoteControl2.on()");
		tv.on();
	}

	@Override
	public void off() {
		System.out.println("ConcreteRemoteControl2.off()");
		tv.off();
	}

	@Override
	public void tuneChannel() {
		System.out.println("ConcreteRemoteControl2.tuneChannel()");
		tv.tuneChannel();
	}
}

public class BridgeClient {

	public static void main(String[] args) {
		RemoteControl remoteControl1 = new ConcreteRemoteControl1(new RCA());
		remoteControl1.on();
		remoteControl1.off();
		remoteControl1.tuneChannel();
		RemoteControl remoteControl2 = new ConcreteRemoteControl2(new Sony());
		remoteControl2.on();
		remoteControl2.off();
		remoteControl2.tuneChannel();
	}

}
