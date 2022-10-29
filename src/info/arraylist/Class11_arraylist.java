package info.arraylist;

import java.util.ArrayList;

public class Class11_arraylist {
static ArrayList<String> ListNames=new ArrayList<>();

public static void main(String[] args) {
        
	    ListNames.add("Deepak");
	    ListNames.add("Mayank");
	    ListNames.add("Bilal");
	    ListNames.add("Pankaj");
	    ListNames.add("Rahul");
	    ListNames.add("Jatin");
	    
	    Class11_arraylist news=new  Class11_arraylist();
	    news.DisplayList(ListNames);
	    System.out.println("**********");
	    
	    news.RemoveListElementById(5);
	    news.DisplayList(ListNames);
	    System.out.println("**********");
	    
	    news.RemoveListElementByName("Bilal");
	    news.DisplayList(ListNames);
	    System.out.println("**********");
	    
	}
  void DisplayList(ArrayList<String> names) {
	  for(String name:names) {
		  System.out.println(name);
	  }
  }

   void RemoveListElementById(int position) {
	   ListNames.remove(position);
   }
   
   void RemoveListElementByName(String name) {
	   ListNames.remove(name);
   
}
}
