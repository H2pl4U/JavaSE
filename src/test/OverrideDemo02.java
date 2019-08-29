package test;

class ClassA {

    public void show(ClassA obj) {
        System.out.println("A.show(A)");
    }

    public void show(ClassC obj) {
        System.out.println("A.show(C)");
    }
}

class ClassB extends ClassA {

    @Override
    public void show(ClassA obj) {
        System.out.println("B.show(A)");
    }
}

class ClassC extends ClassB {
}

class ClassD extends ClassC {
}


public class OverrideDemo02 {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		ClassD d = new ClassD();
		
		a.show(a);
		a.show(b);
		a.show(c);
		a.show(d);
		
		b.show(a);
		b.show(b);
		b.show(c);
		b.show(d);
		
		c.show(a);
		c.show(b);
		c.show(c);
		c.show(d);
		
		d.show(a);
		d.show(b);
		d.show(c);
		d.show(d);
	}

}
