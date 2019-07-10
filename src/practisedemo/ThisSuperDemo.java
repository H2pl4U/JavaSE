package practisedemo;
abstract class Employee{
	private int id;
	private String name;
	public Employee(){
		super();
	}
	public Employee(int id,String name){
		super();
		this.id=id;
		this.name=name;
	}
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
abstract class Develop extends Employee{
	public Develop(){
		super();
	}
	public Develop(int id,String name){
		super(id,name);
	}	
	
}
class JavaEE extends Develop{
	public JavaEE(){
		super();
	}
	public JavaEE(int id,String name){
		super(id,name);
	}
	public void work(){
		System.out.println("JavaEE的工程师开发淘宝"+super.getId()+"..."+super.getName());
	}
}
class Android extends Develop{
	public Android(){
		super();
	}
	public Android(int id,String name){
		super(id,name);
	}
	@Override
	public void work(){
		System.out.println("编号："+getId()+"，姓名："+getName()+"正在研发淘宝手机客户端软件");
	}
}
abstract class Maintainer extends Employee{
	public Maintainer(){
		super();
	}
	public Maintainer(int id,String name){
		super(id,name);
	}
}
class network extends Maintainer{
	public network(){
		super();
	}
	public network(int id,String name){
		super(id,name);
	}
	public void work(){
		System.out.println("网络工程师在检查网络是否畅通"+super.getId()+"..."+super.getName());
	}
}
class hardware extends Maintainer{
	public hardware(){
		super();
	}
	public hardware(int id,String name){
		super(id,name);
	}
	
	@Override
	public void work(){
		System.out.println("编号："+getId()+"，姓名："+getName()+"正在修复打印机");
	}
}
public class ThisSuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE EE =new JavaEE(15,"刘威");
		EE.work();
		Android An = new Android(16,"bjb");
		An.work();
		network nw=new network(17,"cj");
		nw.work();
		hardware hw = new hardware(18,"jjf");
		hw.work();

	}

}