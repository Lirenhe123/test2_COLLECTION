package priv.lirenhe.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

//hashmap.values����ʲô���͵ļ���-->collection����
//���ת����list����:����ArrayList���ϵĹ��캯�� public ArrayList(Collection<? extends E> c)
public class values {
	public static void main(String[] args) {
		HashMap<String,Double> hashmap=new HashMap();//�����ڹ��췽������д<String,Double>
		hashmap.put("yuwen", 89.0);
		hashmap.put("shuxue", 70.0);
		System.out.println(hashmap.getClass());
		System.out.println(hashmap.values().getClass());
		
		TreeMap<String,Double> treemap=new TreeMap<String,Double>();
		treemap.put("yuwen", 89.0);
		treemap.put("shuxue", 70.0);
		System.out.println(treemap.getClass());
		System.out.println(treemap.values().getClass());
		
		ArrayList arraylist=new ArrayList(hashmap.values());
		System.out.println(arraylist.getClass());
		Iterator iterator=arraylist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
//			System.out.println(iterator.next().getClass());
			
		}
		
		
		
		
	}
}
