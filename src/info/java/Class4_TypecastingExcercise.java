package info.java;

public class Class4_TypecastingExcercise {
//Equation between a and b 
	public static void main(String[] args) {
		int a=10;
		float b=50.23f;
		float value1=a*a+b*b+2*a*b;
		System.out.println("Value of the equation By explicit Type-Casting will be "+value1);
		//By explicit Type-Casting
         int value2= (int)value1;
         System.out.println("Value of the equation By explicit Type-Casting will be "+value2);
         long value3=(long) value1;
         System.out.println("Value of the equation By explicit Type-Casting will be "+value3);
         
         //implicit Type-casting 
         double value4=value1;
         System.out.println("Value of the equation by implicit Type-casting will be "+value4);
         
	}

}
