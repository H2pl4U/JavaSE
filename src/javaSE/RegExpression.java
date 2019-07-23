package javaSE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		String str = "ÎäººÊĞ(Îä²ı)(ºº¿Ú)(ººÑô)";
		Pattern parttern = Pattern.compile(".*?(?=\\()");
		Matcher matcher = parttern.matcher(str);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
