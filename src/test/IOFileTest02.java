package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IOFileTest02 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("D:\\Java\\FileDemo\\Number.txt"));
		List<String> list = new ArrayList<String>();
		Random ran = new Random();
		char[] arr= new char[10];
		for(int i =0;i<10;i++){
			int num = ran.nextInt(100);
			arr[i]=(char)num;
			if(num>=10){
				list.add(num+"");
			}
		}
		System.out.println(arr[0]);
		fw.write(arr);
		System.out.println(list);
		fw.close();
	}

}
