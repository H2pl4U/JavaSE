package designpattern;

interface Product {
}

class ConcreteProduct implements Product {
}
class ConcreteProduct1 implements Product {
}
class ConcreteProduct2 implements Product {
}

/*
 *  SimpleFactory �Ǽ򵥹���ʵ�֣�����������Ҫ����ʵ�����Ŀͻ�����á�
 */
public class SimpleFactory {
	public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
	
	public static void main(String[] args) {
		 SimpleFactory simpleFactory = new SimpleFactory();
	     Product product = simpleFactory.createProduct(1);
	     // do something with the product
	     System.out.println(product.toString());
	}
}
