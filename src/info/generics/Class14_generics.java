package info.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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


class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}	
} 

//Class with main method
public class Class14_generics {

	public static void main(String[] args) {
		
		//Using object is good if we know we will be printing any type of data 
		List<Data<Object>> ListNames =new LinkedList<>();
		ListNames.add(new Data<Object>("Deepak"));
	    ListNames.add(new Data<Object>(7.0f));
	    ListNames.add(new Data<Object>('%'));
	    ListNames.add(new Data<Object>(9));
	    ListNames.add(new Data<Object>(8));
	    ListNames.add(new Data<Object>(8));
	    Class14_generics app=new Class14_generics();
	    app.printList(ListNames);
	}
	
	public void printList(List <Data<Object>> list) {
		ListIterator<Data<Object>> iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println("Element :"+iterator.next().getMyVariable());
		}
		
	}

}
