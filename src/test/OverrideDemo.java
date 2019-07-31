package test;

class AA {

    public void show(AA obj) {
        System.out.println("A.show(A)");
    }

    public void show(CC obj) {
        System.out.println("A.show(C)");
    }
}

class BB extends AA {

    @Override
    public void show(AA obj) {
        System.out.println("B.show(A)");
    }
}

class CC extends BB {
}

class DD extends CC {
}

public class OverrideDemo {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		DD d = new DD();
		
		// �� A �д��� show(A obj)��ֱ�ӵ���
	    a.show(a); // A.show(A)
	    // �� A �в����� show(B obj)���� B ת�ͳ��丸�� A
	    a.show(b); // A.show(A)
	    // �� B �д��ڴ� A �̳����� show(C obj)��ֱ�ӵ���
	    b.show(c); // A.show(C)
	    // �� B �в����� show(D obj)�����Ǵ��ڴ� A �̳����� show(C obj)���� D ת�ͳ��丸�� C
	    b.show(d); // A.show(C)

	    // ���õĻ��� B �������� ba �� b �ĵ��ý��һ��
	    AA ba = new BB();
	    ba.show(c); // A.show(C)
	    ba.show(d); // A.show(C)
	}

}
