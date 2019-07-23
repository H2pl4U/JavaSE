package javaSE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java中的String类提供了支持正则表达式操作的方法，
 * 包括：matches()、replaceAll()、replaceFirst()、
 * split()。此外，Java中可以用Pattern类表示正则表达
 * 式对象，它提供了丰富的API进行各种正则表达式操作
 * @author abcd
 *
 */
public class RegExpression {

	public static void main(String[] args) {
		String str = "武汉市(武昌)(汉口)(汉阳)";
		Pattern parttern = Pattern.compile(".*?(?=\\()");
		Matcher matcher = parttern.matcher(str);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
