package info.oops;

class Arithemetic{
	public int add(int a,int b) {
		return a+b;
	}
}

class Adder extends Arithemetic{
	public int callAdd(int a,int b) {
		return add(a,b);
	}
}

public class inheritance_solution {

	public static void main(String[] args) {
		
		Adder a=new Adder();
		System.out.println("The superclass is :"+a.getClass().getName());
		System.out.println("Addition of two numbers are "+a.add(12, 10));

	}

}
