package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOFileTest {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Java\\FileDemo\\test1.txt");
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��Ѿ");
		list.add("Ǯ��");
		list.add("����");
		System.out.println(list);
		for (int index=0;index<list.size();index++) {
			if(list.get(index)=="��Ѿ"){
				list.set(index, "��СѾ");
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
