package info.maps;

//For sorting in comparable interface we have to include 


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Code implements Comparable {
	private String lecture;
	private String session;
	
	public Code(String lecture, String session) {
		//super();
		this.lecture = lecture;
		this.session = session;
	}

	public String getLecture() {
		return lecture;
	}
	
	public String getSession() {
		return session;
	}

	@Override
	public String toString() {
		return "Code [lecture=" + lecture + ", session=" + session + "]";
	}

	@Override
	public int compareTo(Object o) {
		
      String s1=lecture.concat(session);
      String s2=((Code) o).getLecture()+((Code) o).getSession();
		return s1.compareTo(s2);
	}

	

	
	
	
}


public class Treemaps {

	public static void main(String[] args) {
		
	      Map<Code,String> student= new TreeMap<>();
	      
	     student.put(new Code("s1","l3"),"OOPS");
	     student.put(new Code("s1","l2"), "TOC");
	     student.put(new Code("s1","l7"), "Economics");
	     student.put(new Code("s2","l1"), "Art and Culture");
	     student.put(new Code("s1", "l3"), "Java");
	     student.put(new Code("s2","l2"), ".Net");
	    // System.out.println(student.get(004)); 
	     System.out.println("**********");
	     
	         
	         /*For each loop to get values with the help of key
	         for (Integer key: student.keySet()) {
	             System.out.println("Key: "+key+" Value: "+student.get(key));
	             }
	         System.out.println("**********");
	         */
	         
	         /*Iterator 
	          * Note : Don't use next method as 
	          * System.out.println("Key: " + temp.next().getKey() + " Value: " + temp.next().getValue());
	          
	     
	     	Iterator<Entry<Code, String>> entry = student.entrySet().iterator();
	     	 
			while (entry.hasNext()) {
				Entry<Code, String> temp = entry.next();
				System.out.println("Key: " + temp.getKey() + " Value: " + temp.getValue());
				//System.out.println("Key: " + temp.next().getKey() + " Value: " + temp.next().getValue());
			}
			*/
	     
	     for (Map.Entry<Code, String> entry : student.entrySet()) {
	         System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
	     }
			
	
}
}
