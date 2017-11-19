package priv.lirenhe.iterator;

import java.util.Iterator;  

import java.util.TreeSet;  
public class DeleteSet_2 {  

    public static void main(String[] args) {  

        TreeSet<String> set = new TreeSet<String>();  

        set.add("111");  

        set.add("222");  

        set.add("333");  

        Iterator<String> it = set.iterator();  

        while (it.hasNext()) {  

            String ele = it.next();  

            if (ele.equals("222"))  

                set.remove(ele);  

        }  

    }  

}
