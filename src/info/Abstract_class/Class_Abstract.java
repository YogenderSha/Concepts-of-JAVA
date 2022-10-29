package info.Abstract_class;

import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class MyBook extends Book{

	@Override
	void setTitle(String s) {
		title=s;
		
	}
	
}

public class Class_Abstract {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		MyBook novel=new MyBook();
		novel.title=sc.nextLine();
		System.out.println("Tittle is:"+novel.getTitle());


	}

}
