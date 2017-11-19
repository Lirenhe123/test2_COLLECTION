package priv.lirenhe.set;

import java.util.HashSet; 
import java.util.Set; 
public class NotEqualsHashSet { 
	public static void main(String[] args) { 
		Set<Name> s = new HashSet<Name>(); 
		s.add(new Name("li", "tianpeng")); 
		System.out.println(s.contains(new Name("li", "tianpeng"))); 
	} 
} 

class Name { 
	private String first; 
	private String last; 
	
	public Name(String first, String last) { 
		this.first = first; 
		this.last = last; 
	} 
}
