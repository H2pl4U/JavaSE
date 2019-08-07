package designpattern;

/*
 * ģ�巽����Template Method��
 * �����㷨��ܣ�����һЩ�����ʵ���ӳٵ����ࡣ
 * ͨ��ģ�巽��������������¶����㷨��ĳЩ���裬�����øı��㷨�Ľṹ��
 * 
 * �忧�Ⱥͳ�趼�����Ƶ����̣�����ĳЩ������е㲻һ����Ҫ������Щ��ͬ����Ĵ��롣
 */
abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boilWater");
    }

    void pourInCup() {
        System.out.println("pourInCup");
    }
}

class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}

class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}

public class TemplateMethodClient {

	public static void main(String[] args) {
		CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-----------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
	}

}
