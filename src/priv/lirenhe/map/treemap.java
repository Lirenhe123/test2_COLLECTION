package priv.lirenhe.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		TreeMap<String,String> pets=new TreeMap<String, String>();
		pets.put("1","����");
		pets.put("2","����");
		pets.put("3","����");
		
		System.out.println(pets);
		
		
		
		
		/*
		if (pets.containsKey("1")){
		System.out.println("�Ѵ��ڼ�1");
		}
		if (pets.containsValue("����")){
		System.out.println("�Ѵ���ֵ����");
		}
		Set<String> sets=pets.keySet();
		Set<Map.Entry<String , String>> entrySet= pets.entrySet();
		Collection<String> values= pets.values();
		for (String value:values){
		System.out.println(value+";");
		}
		for (String key:sets){
		System.out.print(key+";");
		}
		for (Map.Entry entry:entrySet){
		System.out.println("����"+entry.getKey());
		System.out.println("ֵ��"+entry.getValue());
		}*/
	}
}
