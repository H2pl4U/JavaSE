package javaSE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java�е�String���ṩ��֧��������ʽ�����ķ�����
 * ������matches()��replaceAll()��replaceFirst()��
 * split()�����⣬Java�п�����Pattern���ʾ������
 * ʽ�������ṩ�˷ḻ��API���и���������ʽ����
 * @author abcd
 *
 */
public class RegExpression {

	public static void main(String[] args) {
		String str = "�人��(���)(����)(����)";
		Pattern parttern = Pattern.compile(".*?(?=\\()");
		Matcher matcher = parttern.matcher(str);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
