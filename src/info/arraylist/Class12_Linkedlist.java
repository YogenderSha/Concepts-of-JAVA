package info.arraylist;

import java.util.ArrayList;
import java.util.*;
public class Class12_Linkedlist {

	
	public static void main(String[] args) {
		List <String> Listlog1=new ArrayList<>();
		List <String> Listlog2=new LinkedList<>();
		Listlog1.add("Deepak");
		Listlog1.add("Mayank");
		Listlog1.add("Bilal");
		Listlog1.add("Pankaj");
		Listlog1.add("Rahul");
		Listlog1.add("Jatin");
		new Class12_Linkedlist().DisplayList(Listlog1);
		Listlog2.add("Ram");
		Listlog2.add("Shyam");
		Listlog2.add("Pramod");
		Listlog2.add("Keshav");
		Listlog2.add("Chetan");
		Listlog2.add("Saurabh");
		Listlog2.add("Aman");
		new Class12_Linkedlist().DisplayList(Listlog2);
		new Class12_Linkedlist().RemoveListElementById(0, Listlog2);
		new Class12_Linkedlist().DisplayList(Listlog2);
		
		//Sort() method is used to sort the entries 
		Listlog2.sort(null);
		new Class12_Linkedlist().DisplayList(Listlog2);
		
		//Used to reverse the order of any list
		Collections.reverse(Listlog1);
		new Class12_Linkedlist().DisplayList(Listlog1);
		
		System.out.println(Listlog1.get(0).compareTo("Jatin"));
	}
	
	
	void DisplayList(List<String> names) {
		  for(String name:names) {
			  System.out.println(name);
		  }
		  System.out.println("********");
	}
	
	 void RemoveListElementById(int position,List<String> names) {
		 names.remove(position);
	   }
	   
	   void RemoveListElementByName(String name,List<String> names) {
		   names.remove(name);
}
}
