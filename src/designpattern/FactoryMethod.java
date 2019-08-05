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
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
 * 
 * Factory 有一个 doSomething() 方法，这个方法需要用到一个产品对象，
 * 这个产品对象由 factoryMethod() 方法创建。该方法是抽象的，需要由子类去实现。
 */
public class FactoryMethod {
	public static void main(String[] args) {
		ConcreteFactory1 factory = new ConcreteFactory1();
		factory.doSomething();
	}
}
