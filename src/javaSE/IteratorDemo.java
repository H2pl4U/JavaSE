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
		 //迭代器,对集合ArrayList中的元素进行取出
	      //调用集合的方法iterator()获取出,Iterator接口的实现类的对象
	      Iterator<String> it = coll.iterator();
	      //接口实现类对象,调用方法hasNext()判断集合中是否有元素
	      //boolean b = it.hasNext();
	      //System.out.println(b);
	      //接口的实现类对象,调用方法next()取出集合中的元素
	      //String s = it.next();
	      //System.out.println(s);
	      
	      //迭代是反复内容,使用循环实现,循环的条件,集合中没元素, hasNext()返回了false
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
