package test;

//不加Cloneable会抛出CloneNotSupportedException
class CloneExample implements Cloneable{
    private int a;
    private int b;
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	@Override
    public CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample)super.clone();
    }
}

public class CloneTest {
	public static void main(String[] args) {
		try {
			CloneExample c1 = new CloneExample();
			c1.setA(11);
			CloneExample c2 = c1.clone();
			System.out.println(c2.getA());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
