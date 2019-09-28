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
 * �ṩһ���ӿڣ����ڴ��� ��صĶ������ ��
 * ���󹤳�ģʽ�������Ƕ�����壬Ҳ���Ǻܶ���������һ������
 * ������Щ��������صģ�Ҳ����˵����һ�𴴽�����������������
 * ģʽֻ�����ڴ���һ��������ͳ��󹤳�ģʽ�кܴ�ͬ��
 */
public class AbstractFactoryClient{
	public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactoryA();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        
    }
}
