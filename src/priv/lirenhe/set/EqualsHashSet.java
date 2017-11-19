package priv.lirenhe.set;

import java.util.HashSet; 
import java.util.Set; 

public class EqualsHashSet { 
	public static void main(String[] args) { 
		Set<Name1> s = new HashSet<Name1>(); 
		s.add(new Name1("li", "tianpeng")); 
		System.out.println(s.contains(new Name1("li", "tianpeng"))); 
	} 
} 

class Name1 { 
	private String first; 
	private String last; 
	
	public Name1(String first, String last) { 
		this.first = first; 
		this.last = last; 
	} 
	
	public int hashCode() { 
		return first.hashCode(); 
	} 
	
	public boolean equals(Object o) { 
		if (this == o) 
			return true; 
		if (o.getClass() == Name1.class) { 
			Name1 n = (Name1) o; 
			return n.first.equals(first); 
		} 
		return false; 
	} 
}
