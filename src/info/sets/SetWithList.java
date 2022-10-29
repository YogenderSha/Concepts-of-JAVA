package info.sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Name o) {
		
		return getName().compareTo(o.getName());
	}
	
	
	
	
}

public class SetWithList {

	public static void main(String[] args) {
		
		Set<Name> set=new LinkedHashSet<>();
		set.add(new Name("A"));
		set.add(new Name("B"));
		set.add(new Name("C"));
		set.add(new Name("D"));
		set.add(new Name("E"));
		set.add(new Name("F"));
		
		/*
		List<Name> list=new ArrayList<>();
		list.addAll(set);
		*/
		for(Name name:set) {
		    System.out.println("element: "+name);
		}

	}

}
