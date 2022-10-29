package info.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Class13_stacks {
	
	static Stack <String> katoradan=new Stack<>();

	public static void main(String[] args) {
		
		
		 katoradan.push("Roti1");
		 katoradan.push("Roti2");
		 katoradan.push("Roti3");
		 katoradan.push("Roti4");
		 katoradan.push("Roti5");
		 System.out.println("Top of the Katoradan is :"+katoradan.peek());
		 System.out.println("Capacity of the Katoradan is :"+katoradan.capacity());
		 System.out.println("Top of the Katoradan is :"+katoradan.hashCode());
         System.out.println("After eating one chapati :"+katoradan);

	}

}
