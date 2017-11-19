package priv.lirenhe.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class linkedlistsynchro {
	public static void main(String[] args) {
		// ����һ��List����  
        List<String> lists = new ArrayList<String>();  
  
        // ����Ԫ��  
        lists.add("1");  
        lists.add("2");  
        lists.add("3");  
  
        // ����һ��synchronizedList  
        List<String> synlist = Collections.synchronizedList(lists);  
  
        // ��������Ԫ��  
        synchronized (synlist) {
            //��ȡ������  
            Iterator<String> iterator = synlist.iterator();  
            //����  
            while (iterator.hasNext()) {
                System.out.println(iterator.next());  
            }  
        }  
    }
}
/**
 * synchronizedList�ڵ�����ʱ����Ҫ�������Լ������߳������ƴ��룬
 * ��Ϊ�����������Ĺ����������ѭ�����治��ͬ�����룬��һ�δε���֮�䣬
 * �����̶߳������������add����remove��Ӱ������������Ԥ��Ч����
 * ����������Ҫ�û�������ѭ���������synchronized(list);
 */