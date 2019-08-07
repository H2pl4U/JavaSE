package designpattern;

/*
 * 适配器（Adapter）
 * 把一个类接口转换成另一个用户需要的接口。
 * 
 * 鸭子（Duck）和火鸡（Turkey）拥有不同的叫声，Duck 的叫声调用 quack() 方法，
 * 而 Turkey 调用 gobble() 方法。要求将 Turkey 的 gobble() 方法适配成 Duck 的 
 * quack() 方法，从而让火鸡冒充鸭子！
 */

//鸭子
interface Duckk {
	void quack();
}

//火鸡
interface Turkey {
	void gobble();
}

class WildTurkey implements Turkey {
	@Override
	public void gobble() {
		System.out.println("gobble!");
	}
}

class TurkeyAdapter implements Duckk {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}
}

public class AdapterClient {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duckk Duckk = new TurkeyAdapter(turkey);
		Duckk.quack();
	}

}
