package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		 String str = "成都市(成华区)(武侯区)(高新区)";
	        Pattern p = Pattern.compile(".*?(?=\\()");
	        Matcher m = p.matcher(str);
	        if(m.find()) {
	            System.out.println(m.group());
	        }
	}

}
