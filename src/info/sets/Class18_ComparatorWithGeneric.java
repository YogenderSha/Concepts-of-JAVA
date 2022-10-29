package info.sets;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Generic Class Data With Key Value Pair 
class Data<K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
}





public class Class18_ComparatorWithGeneric {

	public static void main(String[] args) {
		
	
		Comparator<Data<Integer,String>> Compare_key=new Comparator<Data<Integer,String>>() {

			@Override
			public  int compare(Data<Integer,String>obj1, Data<Integer,String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else
					return 0;
			}
		};
		
		//Working for LinkedHasSet But not for TreeSet Because TreeSet not able to sort for multiple properties.
		//Set<Data<Integer, String>> set = new LinkedHashSet<>();
		Set<Data<Integer, String>> set = new TreeSet<>(Compare_key);
		set.add(new Data<Integer, String>(1, "Chaand"));
		set.add(new Data<Integer, String>(5, "Ed"));
		set.add(new Data<Integer, String>(9, "John"));
		set.add(new Data<Integer, String>(2, "Arnold J"));
		set.add(new Data<Integer, String>(5, "Mia"));
		set.add(new Data<Integer, String>(1, "Chaand"));
		for(Object name: set){
			System.out.println(name);

			System.out.println("*****************");
			//Display(set);
       

	}
	
		/*
	public static<Data<Integer, String>> void Display(Set<Data<Integer, String>> set){
		for(Object name: set){
			System.out.println(name);
	}
	}
 */
}
}
