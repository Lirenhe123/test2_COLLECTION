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
		//entrySet�ֱ��ȡmap�����еļ�ֵ
		Set<Map.Entry<String,String>> mapSetEntry=hashmap.entrySet();
		Iterator iterator=mapSetEntry.iterator();
		while(iterator.hasNext()){
			Map.Entry<String,String> entry=(Entry<String, String>) iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("************************");
		//keySet��values�����õ�set��collection���ϲ���ͨ��iterator�ֱ��ȡmap�����еļ���ֵ
		//����ͨ��forѭ���õ�set��collection�����е�ֵ
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
