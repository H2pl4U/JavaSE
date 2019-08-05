package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * ��ȡ�ٶ�html
 */
public class IOSocketsURLTest {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");

	    /* �ֽ��� */
	    InputStream is = url.openStream();

	    /* �ַ��� */
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");

	    /* �ṩ���湦�� */
	    BufferedReader br = new BufferedReader(isr);

	    String line;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }

	    br.close();
	}

}
