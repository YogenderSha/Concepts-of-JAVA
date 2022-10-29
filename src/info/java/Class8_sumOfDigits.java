package info.java;

import java.util.Scanner;

public class Class8_sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int m=0;
		while(true) {
			m=m+t%10;
			t=t/10;
			if(t<10) {
				break;
			}
			
		}
		m=m+t;
		System.out.println(m);
		

	}

}
