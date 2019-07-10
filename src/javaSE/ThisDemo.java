package javaSE;
class Demo{
	private int num = 1;
	private String name = "jr";
	public void speak(){
		this.num =1;
		this.name="jjf";
		System.out.println("name:"+this.name+"  num="+this.num);
	}
	public String toString() {
		return "Demo [num=" + num + ", name=" + name + "]";
	}
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num=num;
	}
	
}

public class ThisDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dm=new Demo();
		dm.speak();
		System.out.println(dm.toString());
		dm.setNum(9);
		System.out.println(dm.getNum());

	}

}
