
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	
public class Codechef5 {



	/* Name of the class has to be "Main" only if the class is public. 
	 * 
	 * 
	 * Alice and Bob are playing a game. Alice goes first.

They have a binary circular array AA with NN elements. In one move, a player can:

Choose a circular continuous segment of the array and perform a left cyclic shift on the chosen segment.
We define the term diff(A)diff(A) as the number of pairs of adjacent elements with different values. Note that we also consider A_NA 
N
​
  and A_1A 
1
​
  as adjacent.

A player can make a move only if, for the updated array A'A 
′
 , diff(A')\gt diff(A)diff(A 
′
 )>diff(A).

The player who is unable to make a move, loses. Find the winner of the game if both players play optimally.
*/
	
		public static void main (String[] args) throws java.lang.Exception
		{
		    
		    int[] rotate(int[] arr, int d, int n)
	    {
	        int p = 1;
	        while (p <= d) {
	            int last = arr[0];
	            for (int i = 0; i < n - 1; i++) {
	                arr[i] = arr[i + 1];
	            }
	            arr[n - 1] = last;
	            p++;
	        }
	    }
		    
		    
			// your code goes here
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t>0){
			    int n=sc.nextInt();
			    int[] ar=new int[n];
			    for(int i=0;i<n;i++){
			       ar[i]=sc.nextInt();
			    }
			   new Codechef5.rotate(ar,1,n);
			    
			    
			    t--;
			}
			
			

		}
	}


