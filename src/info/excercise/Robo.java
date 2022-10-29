package info.excercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Robo {


	public static void main(String[] args) throws java.lang.Exception {
		try (Scanner sc = new Scanner(System.in)) {
			//int[] arr=new int[20];
			Set<Integer> set = new HashSet<>();
			int t=sc.nextInt();
			while(t-->0) {
				int x=sc.nextInt();
				int n=sc.nextInt();
				 String st;
			     st=sc.nextLine();
				set.add(x);
				
			for(int i=0;i<n;i++) {
				if(st.charAt(i)=='R') {	
					x=x+1;
					set.add(x);
				}else if(st.charAt(i)=='L') {	
					x=x-1;
					set.add(x);
				}
				
			}
				for(Integer elements:set) {
					System.out.println(elements);
				}
				
			}
		}
       

	}
	
	
	
}
