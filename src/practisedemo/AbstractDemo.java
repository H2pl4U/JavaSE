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
		System.out.println("JavaEE1�Ĺ���ʦ�����Ա�"+super.getId()+"..."+super.getName());
	}
}
class Android1 extends Develop1{
	@Override
	public void work(){
		System.out.println("��ţ�"+getId()+"��������"+getName()+"�����з��Ա��ֻ��ͻ������");
	}
}
abstract class Maintainer1 extends Employee1{
	
}
class network1 extends Maintainer1{
	public void work(){
		System.out.println("���繤��ʦ�ڼ�������Ƿ�ͨ"+super.getId()+"..."+super.getName());
	}
}
class hardware1 extends Maintainer1{
	@Override
	public void work(){
		System.out.println("��ţ�"+getId()+"��������"+getName()+"�����޸���ӡ��");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaEE1 EE =new JavaEE1();
		EE.setId(15);
		EE.setName("����");
		EE.work();
		Android1 An = new Android1();
		An.setId(11);
		An.setName("�˼�");
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
