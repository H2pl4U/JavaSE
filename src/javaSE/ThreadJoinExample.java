package javaSE;

class JoinExample {

    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }
}

/*
 *���߳��е�����һ���̵߳� join() �������Ὣ��ǰ�̹߳��𣬶�����æ�ȴ���ֱ��Ŀ���߳̽�����
 *�������´��룬��Ȼ b �߳���������������Ϊ�� b �߳��е����� a �̵߳� join() ������
 *b �̻߳�ȴ� a �߳̽����ż���ִ�У��������ܹ���֤ a �̵߳�������� b �̵߳������
 */
public class ThreadJoinExample {

	public static void main(String[] args) {
		JoinExample example = new JoinExample();
	    example.test();
	}

}
