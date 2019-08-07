package designpattern;

import java.util.HashMap;

/*
 * ��Ԫ��Flyweight��
 * ���ù���ķ�ʽ��֧�ִ���ϸ���ȵĶ�����Щ����һ�����ڲ�״̬����ͬ�ġ�
 * Flyweight����Ԫ����
 * IntrinsicState���ڲ�״̬����Ԫ�������ڲ�״̬
 * ExtrinsicState���ⲿ״̬��ÿ����Ԫ������ⲿ״̬��ͬ
 * 
 */
interface Flyweight {
    void doOperation(String extrinsicState);
}

class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}

class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}

public class FlyweightClient {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("aa");
        Flyweight flyweight2 = factory.getFlyweight("aa");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
	}

}
