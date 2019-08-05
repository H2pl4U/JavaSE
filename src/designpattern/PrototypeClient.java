package designpattern;

/*
 * ʹ��ԭ��ʵ��ָ��Ҫ������������ͣ�ͨ���������ԭ���������¶���
 */
abstract class Prototype {
    abstract Prototype myClone();
}

class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}

public class PrototypeClient {

	public static void main(String[] args) {
		Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
	}

}
