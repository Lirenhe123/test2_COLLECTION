package priv.lirenhe.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class linkedlistsynchro {
	public static void main(String[] args) {
		// 创建一个List数组  
        List<String> lists = new ArrayList<String>();  
  
        // 添加元素  
        lists.add("1");  
        lists.add("2");  
        lists.add("3");  
  
        // 创建一个synchronizedList  
        List<String> synlist = Collections.synchronizedList(lists);  
  
        // 迭代集合元素  
        synchronized (synlist) {
            //获取迭代器  
            Iterator<String> iterator = synlist.iterator();  
            //遍历  
            while (iterator.hasNext()) {
                System.out.println(iterator.next());  
            }  
        }  
    }
}
/**
 * synchronizedList在迭代的时候，需要开发者自己加上线程锁控制代码，
 * 因为在整个迭代的过程中如果在循环外面不加同步代码，在一次次迭代之间，
 * 其他线程对于这个容器的add或者remove会影响整个迭代的预期效果，
 * 所以这里需要用户在整个循环外面加上synchronized(list);
 */