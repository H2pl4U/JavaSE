package designpattern;

abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}

class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}

class ConcreteFactory1 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

/*
 * �ڼ򵥹����У��������������һ���࣬���ڹ��������У�������������������
 * 
 * Factory ��һ�� doSomething() ���������������Ҫ�õ�һ����Ʒ����
 * �����Ʒ������ factoryMethod() �����������÷����ǳ���ģ���Ҫ������ȥʵ�֡�
 */
public class FactoryMethod {
	public static void main(String[] args) {
		ConcreteFactory1 factory = new ConcreteFactory1();
		factory.doSomething();
	}
}
