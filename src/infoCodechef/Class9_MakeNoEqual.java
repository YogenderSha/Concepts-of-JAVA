package infoCodechef;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Class9_MakeNoEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    if(a<b) {
		    	while(a<b) {
		    		a=a*2;
		    	}
		    	 if(a==b) {
				    	System.out.println("YES");
				    }else {
				    	System.out.println("NO");
				    }
				    
		    	
		    }else {
		    	while(a>b) {
		    		b=b*2;
		    	}
		    	 if(a==b) {
				    	System.out.println("YES");
				    }else {
				    	System.out.println("NO");
				    }
		    }
		   
		  

		  t--;  
		    
		}
      
	}

}
