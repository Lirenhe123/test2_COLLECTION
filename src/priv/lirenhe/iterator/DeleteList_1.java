package priv.lirenhe.iterator;
 
import java.util.ArrayList;  
import java.util.Iterator;  
public class DeleteList_1 {  

    public static void main(String[] args) {  

        ArrayList<String> list = new ArrayList<String>();  

        list.add("111");  

        list.add("222");  

        list.add("333");  

        Iterator<String> it = list.iterator();  

        while (it.hasNext()) {  

            String ele = it.next();  

            if (ele.equals("222"))  

                list.remove(ele);  

        }  

    }  

} 
