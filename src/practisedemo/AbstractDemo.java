package practisedemo;
abstract class Employee1{
	private int id;
	private String name;
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public abstract void work();
}
abstract class Develop1 extends Employee1{
	
}
class JavaEE1 extends Develop1{
	public void work(){
		System.out.println("JavaEE1的工程师开发淘宝"+super.getId()+"..."+super.getName());
	}
}
class Android1 extends Develop1{
	@Override
	public void work(){
		System.out.println("编号："+getId()+"，姓名："+getName()+"正在研发淘宝手机客户端软件");
	}
}
abstract class Maintainer1 extends Employee1{
	
}
class network1 extends Maintainer1{
	public void work(){
		System.out.println("网络工程师在检查网络是否畅通"+super.getId()+"..."+super.getName());
	}
}
class hardware1 extends Maintainer1{
	@Override
	public void work(){
		System.out.println("编号："+getId()+"，姓名："+getName()+"正在修复打印机");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE1 EE =new JavaEE1();
		EE.setId(15);
		EE.setName("刘威");
		EE.work();
		Android1 An = new Android1();
		An.setId(11);
		An.setName("菜鸡");
		An.work();
		network1 nw=new network1();
		nw.setId(12);
		nw.setName("lw");
		nw.work();
		hardware1 hw = new hardware1();
		hw.setId(10);
		hw.setName("bjb");
		hw.work();

	}

}
