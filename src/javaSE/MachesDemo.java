package javaSE;

public class MachesDemo {

	public static void main(String[] args) {
		String qq = "604154942";
		Checkqq(qq);
		String Pnum = "13163266218";
		CheckPhoneNum(Pnum);
		String mailAdd="850252329@qq.com";
		CheckMail(mailAdd);
		String s = "Hello12345World6789012";
		String regex = "[0-9]";											
		String result = s.replaceAll(regex, "*");
		System.out.println(result);
		String s1 = "18-22-40-65";
		String regex1 = "-";
		String[] result1 = s1.split(regex1);
		for(int i =0;i<result1.length;i++){
			System.out.println(result1[i]);
		}
		String s2 = "18 22 40 65";
		String regex2 = " ";
		String[] result2 = s2.split(regex2);
		for(int i =0;i<result2.length;i++){
			System.out.println(result2[i]);
		}
		
		
	}
	public static void Checkqq(String qq){
		String regex = "[1-9][0-9]{4,14}";
		boolean flag = qq.matches(regex);
		System.out.println(flag);
	}
	public static void CheckPhoneNum(String Pnum){
		String regex = "1[34578][0-9]{9}";
		boolean flag = Pnum.matches(regex);
		System.out.println(flag);
	}
	public static void CheckMail(String mailadd){
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)+";
		boolean flag = mailadd.matches(regex);
		System.out.println(flag);
	}
	

}
