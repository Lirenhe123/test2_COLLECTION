package priv.lirenhe.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("China");
		arraylist.add(new String("good"));
		//ʹ��iterator
		Iterator<String> iterator=arraylist.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
//		System.out.println(arraylist);
//		System.out.println(arraylist.size());
		System.out.println("************************");
		//ת�������1
		Object[] array1=null;
		array1= arraylist.toArray();
		
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
		System.out.println("************************");
		//ת�������2
		//���ĵ�������ʱ����
		//����ǿ������ת��
		String[] array2=null ;
		String[] array=new String[arraylist.size()];
		array2= arraylist.toArray(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i]);
		}
		System.out.println("************************");
		
		
	}
}
