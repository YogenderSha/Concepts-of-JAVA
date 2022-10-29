package info.Codechef;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class10_equation {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

			//Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		int t = Integer.parseInt(reader.readLine());
		while(t>0){
			 String s="NO";
			 int x = Integer.parseInt(reader.readLine());
		    //int x=sc.nextInt();
		    for(int i=1;i<x/2;i++){
		       
		        for(int j=1;j<x/2;j++){
		            if((2*i+2*j+i*j)==x){
		               s="YES";
		            }
		        }
		    }
		    System.out.println(s);
			t--;
		    
		}
		
	}
	

}
