package practisedemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<Chef> ch = new ArrayList<Chef>();
		ArrayList<Waiter> wt = new ArrayList<Waiter>();
		ArrayList<Manager> Mg = new ArrayList<Manager>();
		ch.add(new Chef("bjb","001"));
		ch.add(new Chef("ljw","002"));
		wt.add(new Waiter("jjf","003"));
		wt.add(new Waiter("jrf","004"));
		Mg.add(new Manager("zs","010",1000));
		Mg.add(new Manager("wk","011",1500));
		
		Iterator(ch);
		Iterator(wt);
		Iterator(Mg);
		
	}

	/*
	 * 定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法 work
	 * ? 通配符,迭代器it.next()方法取出来的是Object类型,怎么调用work方法
	 * 强制转换:  it.next()=Object o ==> Employee
	 * 方法参数: 控制,可以传递Employee对象,也可以传递Employee的子类的对象
	 * 泛型的限定  本案例,父类固定Employee,但是子类可以无限?
	 *   ? extends Employee 限制的是父类, 上限限定, 可以传递Employee,传递他的子类对象
	 *   ? super   Employee 限制的是子类, 下限限定, 可以传递Employee,传递他的父类对象
	 */
	private static void Iterator(ArrayList<? extends Employee02> arr) {
		Iterator<? extends Employee02> it = arr.iterator();
		while(it.hasNext()){
			Employee02 e = it.next();
			e.work();
		}
	}

}
