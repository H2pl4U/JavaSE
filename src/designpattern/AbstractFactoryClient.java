package designpattern;

class AbstractProductA {
}
class AbstractProductB {
}
 
class ProductA1 extends AbstractProductA {
}
class ProductA2 extends AbstractProductA {
}

class ProductB1 extends AbstractProductB {
}
class ProductB2 extends AbstractProductB {
}


abstract class AbstractFactory {
    abstract AbstractProductA createProductA();
    abstract AbstractProductB createProductB();
}

class ConcreteFactoryA extends AbstractFactory {
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    AbstractProductB createProductB() {
        return new ProductB1();
    }
}

class ConcreteFactoryB extends AbstractFactory {
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    AbstractProductB createProductB() {
        return new ProductB2();
    }
}

/*
 * 提供一个接口，用于创建 相关的对象家族 。
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，
 * 并且这些对象是相关的，也就是说必须一起创建出来。而工厂方法
 * 模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
 */
public class AbstractFactoryClient{
	public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactoryA();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        
    }
}
