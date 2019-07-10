package javaSE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> coll= new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		 //������,�Լ���ArrayList�е�Ԫ�ؽ���ȡ��
	      //���ü��ϵķ���iterator()��ȡ��,Iterator�ӿڵ�ʵ����Ķ���
	      Iterator<String> it = coll.iterator();
	      //�ӿ�ʵ�������,���÷���hasNext()�жϼ������Ƿ���Ԫ��
	      //boolean b = it.hasNext();
	      //System.out.println(b);
	      //�ӿڵ�ʵ�������,���÷���next()ȡ�������е�Ԫ��
	      //String s = it.next();
	      //System.out.println(s);
	      
	      //�����Ƿ�������,ʹ��ѭ��ʵ��,ѭ��������,������ûԪ��, hasNext()������false
	      while(it.hasNext()){
	    	  String str=it.next();
	    	  System.out.println(str);
	      }
	      Iterator<String> it1 = coll.iterator();
	      while(it1.hasNext()){
	    	  String str=it1.next();
	    	  System.out.println(str.length());
	      }
	}

}
