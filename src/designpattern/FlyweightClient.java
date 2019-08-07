package designpattern;

import java.util.HashMap;

/*
 * 享元（Flyweight）
 * 利用共享的方式来支持大量细粒度的对象，这些对象一部分内部状态是相同的。
 * Flyweight：享元对象
 * IntrinsicState：内部状态，享元对象共享内部状态
 * ExtrinsicState：外部状态，每个享元对象的外部状态不同
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
