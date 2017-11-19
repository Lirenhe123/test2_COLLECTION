package priv.lirenhe.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		HashMap<String,String> hashmap=new HashMap<String,String>();
		hashmap.put("one", "apple1");
		hashmap.put("two", "apple2");
		//entrySet分别获取map集合中的键值
		Set<Map.Entry<String,String>> mapSetEntry=hashmap.entrySet();
		Iterator iterator=mapSetEntry.iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> entry=(Entry<String, String>) iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("************************");
		//keySet和values方法得到set和collection集合不能通过iterator分别获取map集合中的键和值
		//但能通过for循环得到set和collection集合中的值
		Set<String> keyset=hashmap.keySet();
		Iterator keySetIterator=mapSetEntry.iterator();
		while(keySetIterator.hasNext()){
			System.out.println(keySetIterator.next());
		}
		for (String key:keyset){
			System.out.println(key+";");
		}
		System.out.println("************************");
		Collection<String> values=hashmap.values();
		Iterator valuesIterator=mapSetEntry.iterator();
		while(valuesIterator.hasNext()){
			System.out.println(valuesIterator.next());
		}
		for (String value:values){
			System.out.println(value+";");
		}
		System.out.println("************************");
		System.out.println(hashmap);
	}
}
