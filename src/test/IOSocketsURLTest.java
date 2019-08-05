package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*
 * 爬取百度html
 */
public class IOSocketsURLTest {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.baidu.com");

	    /* 字节流 */
	    InputStream is = url.openStream();

	    /* 字符流 */
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");

	    /* 提供缓存功能 */
	    BufferedReader br = new BufferedReader(isr);

	    String line;
	    while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }

	    br.close();
	}

}
