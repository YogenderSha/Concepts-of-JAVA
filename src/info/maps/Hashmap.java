package info.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashmap {

	public static void main(String[] args) {
		
      Map<Integer,String> student= new HashMap<>();
      
     student.put(001,"Ankit");
     student.put(002, "Aman");
     student.put(003, "Hapie");
     student.put(004, "Abhinay");
     student.put(005, "Ujjawal");
     student.put(006, "Yogi");
     System.out.println(student.get(004)); 
     System.out.println("**********");
     
     //For each loop with Key Value pair
     for (Map.Entry<Integer, String> entry : student.entrySet()) {
         System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
     }
     System.out.println("**********");
         
         
         //For each loop to get values with the help of key
         for (Integer key: student.keySet()) {
             System.out.println("Key: "+key+" Value: "+student.get(key));
             }
         System.out.println("**********");
         
         
         /*Iterator 
          * Note : Don't use next method as 
          * System.out.println("Key: " + temp.next().getKey() + " Value: " + temp.next().getValue());
          */
     	Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
     	 
		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
			//System.out.println("Key: " + temp.next().getKey() + " Value: " + temp.next().getValue());
		}
     }

	}

