package javaSE;
class Demo01 {
	public static final String NAME = "����";
	public static void method(){
		System.out.println("һ����̬����");
	}
}
interface Inter {
	public static final int COUNT = 100;  //���㲻��ҲĬ����static final����
}
public class StaticFinalDemo {

	public static void main(String[] args) {
		System.out.println(Demo01.NAME);
		Demo01.method();
		System.out.println(Inter.COUNT);
		System.out.println(new Demo01().NAME);  //��������ֻ����һ�Σ��´���Ҫ��������
	}

}
