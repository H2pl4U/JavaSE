package designpattern;

/*
 * װ�Σ�Decorator��
 * Ϊ����̬��ӹ��ܡ�
 * 
 * װ���ߣ�Decorator���;��������ConcreteComponent�����̳��������Component����
 * ��������ķ���ʵ�ֲ���Ҫ�������������󣬶�װ���������һ�����������������װ��
 * ����װ���߻��߾����������νװ�Σ����ǰ����װ�������ڱ�װ����֮�ϣ��Ӷ���̬��
 * չ��װ���ߵĹ��ܡ�װ���ߵķ�����һ�������Լ��ģ����������Ĺ��ܣ�Ȼ����ñ�װ��
 * �ߵķ���ʵ�֣��Ӷ�Ҳ�����˱�װ���ߵĹ��ܡ����Կ������������Ӧ����װ�β�ε���
 * �Ͳ㣬��Ϊֻ�о�������ķ���ʵ�ֲ���Ҫ��������������
 * 
 * ��Ʋ�ͬ��������ϣ����Ͽ���������ϣ�����������ţ�̣�����֧�ֶ�̬��������ϡ�
 * ÿ����һ�����ϣ������ϵļ۸�ͻ����ӣ�Ҫ�����һ�����ϵļ۸�
 * ��ͼ��ʾ�� DarkRoast ��������������� Mocha ���ϣ�֮��������� Whip ���ϡ�
 * DarkRoast �� Mocha ������Mocha �ֱ� Whip ���������Ƕ��̳�����ͬ���࣬���� 
 * cost() ������������ cost() �����������ڲ���� cost() ������
 */
interface Beverage {
	double cost();
}

class DarkRoast implements Beverage {
	@Override
	public double cost() {
		return 1;
	}
}

class HouseBlend implements Beverage {
	@Override
	public double cost() {
		return 1;
	}
}

abstract class CondimentDecorator implements Beverage {
	protected Beverage beverage;
}

class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 1 + beverage.cost();
	}
}

class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 1 + beverage.cost();
	}
}

class Zhenzhu extends CondimentDecorator{
	
	public Zhenzhu(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public double cost() {
		return 1.5 + beverage.cost();
	}
	
}

public class DecoratorClient {

	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		beverage = new Milk(beverage);
		beverage = new Zhenzhu(beverage);
		System.out.println(beverage.cost());
	}

}
