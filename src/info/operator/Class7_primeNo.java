package info.operator;
import java.util.*;

public class Class7_primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int n=sc.nextInt();
			for(int i=2;i<n;i++)
			{
				if ((n%i)==0) {
					cnt++;
				}
			}
		if(cnt>0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}

	}

}
