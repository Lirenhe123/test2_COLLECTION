package priv.lirenhe.list;

import java.util.LinkedList;

public class linkedlistStack {
	public static void main(String[] args) {
		LinkedList<String> linkedliststack=new LinkedList<String>();
		for(int i=0;i<=5;i++){
			linkedliststack.push("a"+i);//压栈= addFirst(e)
			System.out.println(linkedliststack);
		}
		System.out.println("*************************");
		int size=linkedliststack.size();
		for(int i=0;i<size;i++){
			String value=linkedliststack.poll();//和pop()方法底层原理一样
			System.out.println(value);
		}
		System.out.println(linkedliststack);
		System.out.println("*************************");
		

		
	}
}
