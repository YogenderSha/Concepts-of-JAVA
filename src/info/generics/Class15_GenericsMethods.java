package info.generics;
/*
 * Type Parameters

The type parameters naming conventions is important!

The naming conventions are as follows:

T - Type
E - Element
K - Key
N - Number
V - Value
 * */

//We restricted the v to only class object
class App<K extends Number,V extends Class15_GenericsMethods>{
	private K key;
	private V value;
	public Object getValue;
	
	
	
	public App(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "App [key=" + key + ", value=" + value + "]";
	}
	
	/*
	 * 
	 * Number and Character classes are already defined classes in Java.
	 * This is a Generic method in Generic class.
	 * Generic methods need not to be only in Generic classes.
	 * 
	 * 
	 * 
	 * */
	
	public <E extends Character,N extends Number> void Display(E element,N number){
		System.out.println(" Element :"+element+" : Number :"+ number);
	}
	
}

public class Class15_GenericsMethods {

	public static void main(String[] args) {
		/*
		 * Key - Integer
		 * Value - String
		 * */
		App< Integer,Class15_GenericsMethods> app=new App<Integer,Class15_GenericsMethods>(1,new Class15_GenericsMethods());
		app.Display('@',1);
		
		//Display methods displays the result of display method in App class
		System.out.println("Value of the Key is :"+app.getKey());
		
		System.out.println("Value of the Value is :" +app.getValue());
		//prints the class because we created a class object as value object  
		
		 app.getValue().test();
		/*
		 * Prints the test() method because we created a class object as value object,
		 *  which is giving a class object to test method.
		 *  Hence it will be printing test() method
		*/

	}
	
	public void test() {
		System.out.println("Testing method Applied");
	}

}
