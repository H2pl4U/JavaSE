package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOFileTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Java\\FileDemo\\test1.txt");
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("二丫");
		list.add("钱六");
		list.add("孙七");
		System.out.println(list);
		for (int index=0;index<list.size();index++) {
			if(list.get(index)=="二丫"){
				list.set(index, "王小丫");
			}
			fw.write(list.get(index));
			fw.write(",");
		}
		System.out.println(list);
		System.out.println(fw.getEncoding());
		fw.flush();
		fw.close();
	}

}
