package info.operator;
import java.util.Scanner;

public class Class6_TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		
		String a = "Allowed to vote";
		String b = "Not allowed to vote";
		String accessallowed = (age > 18) ? a : b;
		System.out.println(accessallowed);
	}

}
