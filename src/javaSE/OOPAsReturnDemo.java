package javaSE;
//�ӿ�   (��ͨ��ͳ�������ӿ�ͬ����code)
interface Smoke{
	public abstract void smoking();
}
class Student04 implements Smoke{
	public void smoking() {
		System.out.println("Smoking");
	}
}
public class OOPAsReturnDemo {

	public static void main(String[] args) {
		//����method��������ȡ���صĻ����̵Ķ���
				Smoke s = method();
				//ͨ��s��������smoking����,��ʱʵ�ʵ��õ���Student�����е�smoking����
				s.smoking();
				Smoke m = new Student04();
				method2(m);
	}

	private static void method2(Smoke m) {
		m.smoking();
		
	}

	public static Smoke method(){
		Smoke sm = new Student04();
		return sm;
	}

}
