package test;

public class DataTypeTest01 {

	public static void main(String[] args) {
		Integer a1 = 128;
	    Integer a2 = -128;
	    Integer a3 = -128;
	    Integer a4 = 128;
	    System.out.println(a1 == a4);	//false
	    System.out.println(a2 == a3);	//true
	    
	    Byte b1 = 127;
	    Byte b2 = 127;
	    Byte b3 = -128;
	    Byte b4 = -128;
	    //byte������ȵģ���Ϊ��Χ����-128��127֮��
	    System.out.println(b1 == b2);	//true
	    System.out.println(b3 == b4);	//true

	    Long c1 = 128L;
	    Long c2 = 128L;
	    Long c3 = -128L;
	    Long c4 = -128L;
	    System.out.println(c1 == c2);	//false
	    System.out.println(c3 == c4);	//true
	    
	    //charû�и�ֵ
	    //����charҲ����0��127֮���Զ�����
	    Character d1 = 128;
	    Character d2 = 128;
	    Character d3 = 127;
	    Character d4 = 127;
	    System.out.println(d1 == d2);	//false
	    System.out.println(d3 == d4);	//true


	    Integer i = 10;
	    Byte b = 10;
	    //�Ƚ�Byte��Integer.���������޷�ֱ�ӱȽϣ�����
	    //System.out.println(i == b);
	    System.out.println("i == b " + i.equals(b));
	    //����false,��Ϊ��װ��ıȽ�ʱ�ȱȽ��Ƿ���ͬһ���࣬���ǵĻ�ֱ�ӷ���false.
	    int ii = 128;
	    short ss = 128;
	    long ll = 128;
	    char cc = 128;
	    System.out.println("ii == bb " + (ii == ss));
	    System.out.println("ii == ll " + (ii == ll));
	    System.out.println("ii == cc " + (ii == cc));
	    //��ʱ����true����Ϊ������������ֱ�ӱȽ�ֵ��ֵһ���Ϳ��ԡ�
	}

}
