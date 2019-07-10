package javaSE;
//���������࣬����ȡ����eat����
abstract class Animal {
	abstract void eat();
}

//�������࣬�̳ж����࣬��дeat����������lookHome����
class Dog extends Animal {
	void eat() {
		System.out.println("�й�ͷ");
	}

	void lookHome() {
		System.out.println("����");
	}
}

//����è�࣬�̳ж����࣬��дeat����������catchMouse����
class Cat extends Animal {
	void eat() {
		System.out.println("����");
	}

	void catchMouse() {
		System.out.println("ץ����");
	}
}


public class OOPPolymorphismDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog(); //��̬��ʽ������һ��������
		a.eat(); // ���ö����еķ�������ִ�й����е�eat����
		// a.lookHome();//ʹ��Dog�����еķ�������Ҫ����ת�ͣ�����ֱ��ʹ��
		
		// Ϊ��ʹ�ù����lookHome��������Ҫ����ת��
//����ת�͹����У����ܻᷢ������ת���Ĵ��󣬼�ClassCastException�쳣
		// ��ô����ת֮ǰ��Ҫ����׳���ж� 
		if( !(a instanceof Dog)){ // �жϵ�ǰ�����Ƿ���Dog����
		 		System.out.println("���Ͳ�ƥ�䣬����ת��"); 
		 		return; 
		} 
		Dog d = (Dog) a; //����ת��
		d.lookHome();//���ù����lookHome����

	}

}
