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
		
		// 在 A 中存在 show(A obj)，直接调用
	    a.show(a); // A.show(A)
	    // 在 A 中不存在 show(B obj)，将 B 转型成其父类 A
	    a.show(b); // A.show(A)
	    // 在 B 中存在从 A 继承来的 show(C obj)，直接调用
	    b.show(c); // A.show(C)
	    // 在 B 中不存在 show(D obj)，但是存在从 A 继承来的 show(C obj)，将 D 转型成其父类 C
	    b.show(d); // A.show(C)

	    // 引用的还是 B 对象，所以 ba 和 b 的调用结果一样
	    AA ba = new BB();
	    ba.show(c); // A.show(C)
	    ba.show(d); // A.show(C)
	}

}
