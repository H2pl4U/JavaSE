package designpattern;

/*
 * ��ۣ�Facade��
 * �ṩ��һ��ͳһ�Ľӿڣ�����������ϵͳ�е�һȺ�ӿڣ��Ӷ�����ϵͳ������ʹ�á�
 * 
 * �ۿ���Ӱ��Ҫ�����ܶ������ʹ�����ģʽʵ��һ������Ӱ���ܡ�
 */
class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }
}

class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}


public class FacadeCilent {

	public static void main(String[] args) {
		Facade facade = new Facade();
        facade.watchMovie();
	}
	/*
	 * ���ԭ��
	 * 
	 * ����֪ʶԭ��ֻ���������̸����Ҳ����˵�ͻ���������Ҫ�����Ķ���Ӧ���������١�
	 */

}
