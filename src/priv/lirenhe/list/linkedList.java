package priv.lirenhe.list;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
	public static void main(String[] args) {
		List<String> linkedlist=new LinkedList<String>();
		for(int i=0;i<=5;i++){
			linkedlist.add("a"+i);
		}
		System.out.println(linkedlist);
		linkedlist.set(0, "a5");
		System.out.println(linkedlist);
		linkedlist.remove(0);
		System.out.println(linkedlist);
		
		for(int i=0;i<linkedlist.size();i++){
			System.out.println(linkedlist.get(i));
		}
	}
}
