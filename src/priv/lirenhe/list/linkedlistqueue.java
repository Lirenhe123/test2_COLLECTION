package priv.lirenhe.list;

import java.util.LinkedList;

public class linkedlistqueue {
	public static void main(String[] args) {
		LinkedList<String> linkedliststack=new LinkedList<String>();
		for(int i=0;i<=5;i++){
			linkedliststack.push("a"+i);//ѹջ= addFirst(e)
			System.out.println(linkedliststack);
		}
		System.out.println("*************************");
		int size=linkedliststack.size();
		for(int i=0;i<size;i++){
			String value=linkedliststack.removeLast();//���У��Ƚ��ȳ����Ƴ������ش��б�����һ��Ԫ�ء�
			System.out.println(value);
		}
	}

}
