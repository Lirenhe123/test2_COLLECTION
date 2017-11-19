package priv.lirenhe.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
	public static void main(String[] args) {
		HashSet hashset=new HashSet();
		hashset.add("china");
		hashset.add(1);
		hashset.add(new Integer(2));
		hashset.add(new Integer(1));//内容相同则无效
		
		System.out.println(hashset);
		//遍历
		Iterator iterator=hashset.iterator();
		while(iterator.hasNext()){
			Object value=null;
			value=iterator.next();
			System.out.println(value);
		}
		System.out.println("*********************");
		//利用hashset来查询内容十分好，不向list有数字作为键，hashset仅仅是内容的存储
		boolean flag=false;
		flag=hashset.contains("china");
		System.out.println(flag);
		System.out.println("*********************");
		//
		int size=0;
		size=hashset.size();
		System.out.println(size);
		
		hashset.remove("china");
		size=hashset.size();
		System.out.println(size);
		
	}
}
