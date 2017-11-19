package priv.lirenhe.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		TreeMap<String,String> pets=new TreeMap<String, String>();
		pets.put("1","张三");
		pets.put("2","李四");
		pets.put("3","王五");
		
		System.out.println(pets);
		
		
		
		
		/*
		if (pets.containsKey("1")){
		System.out.println("已存在键1");
		}
		if (pets.containsValue("张三")){
		System.out.println("已存在值张三");
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
		System.out.println("键："+entry.getKey());
		System.out.println("值："+entry.getValue());
		}*/
	}
}
