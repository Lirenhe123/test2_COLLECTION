package priv.lirenhe.list;

import java.util.LinkedList;

public class linkedlistqueue {
	public static void main(String[] args) {
		LinkedList<String> linkedliststack=new LinkedList<String>();
		for(int i=0;i<=5;i++){
			linkedliststack.push("a"+i);//压栈= addFirst(e)
			System.out.println(linkedliststack);
		}
		System.out.println("*************************");
		int size=linkedliststack.size();
		for(int i=0;i<size;i++){
			String value=linkedliststack.removeLast();//队列：先进先出：移除并返回此列表的最后一个元素。
			System.out.println(value);
		}
	}

}
