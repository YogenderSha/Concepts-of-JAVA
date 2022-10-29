package info.operator;

public class Class5_ArithmeticOperator {
      public static void main(String[] args) {
		
		int x = 1+2;  
        String s = "Hello" + " world";  
        System.out.println(x);  
        System.out.println(s);
        //+ operator works as addition operator as well as concat operator 
        
        int a = 1;  
        int b = 12 - a;  
        System.out.println(b); 
        //Subtraction operator 
        
        int mod = 13 % 2;
		System.out.println(mod);
        //Modulus operator 
		
		int d = 10;
        System.out.println(d++);
        int e = 10;
        System.out.println(e--);
        //Post Increment and Post Decrement in java 
        
        int u = 10;
        System.out.println(++u);
        int v = 10;
		System.out.println(--v);
        //Pre increment in Java  and pre Decrement in java    
	}

}
