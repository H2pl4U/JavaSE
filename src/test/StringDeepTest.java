package test;

public class StringDeepTest {

	public static void main(String[] args) {
		//1���ӷ�ʽ
	    String s1 = "a";
	    String s2 = "a";
	    String s3 = "a" + s2;
	    String s4 = "a" + "a";
	    String s5 = s1 + s2;
	    s1.intern();
	    //���ʽֻ�г���ʱ����������ɼ���
	    //���ʽ�б���ʱ�������ڲż��㣬���Ե�ַ��һ��
	    System.out.println(s3 == s4); //f
	    System.out.println(s3 == s5); //f
	    System.out.println(s4 == "aa"); //t
	    String ss = new String("1")+new String("2");
	    System.out.println(ss.intern()==ss); //t
	    
	    //2��string��internʹ��
	    //s1�ǻ������ͣ��Ƚ�ֵ��s2��stringʵ�����Ƚ�ʵ����ַ
	    //�ַ���������equals�����Ƚ�ʱֻ��Ƚ�ֵ
	    String ss1 = "a";
	    String ss2 = new String("a");
	    //����internʱ,���s2�е��ַ����ڳ����أ�����볣���ز����س���������
	    String ss3 = ss2.intern();
	    System.out.println(ss1 == ss2);	//false
	    System.out.println(ss1 == ss3);	//true
	}

}
