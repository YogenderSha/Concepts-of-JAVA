package info.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Class17_SetTypes {

	public static void main(String[] args) {
		
		
		/*
		 *Sets are more memory efficient than lists.

Sets have no get methods.

Three types of Sets :

HashSet
-Doesn't keep Order.
-Fastest Set
-Allows One Null key


LinkedHashSet
-Keeps in Order.
-Allows One Null Key
-It's a close second.


TreeSet
-Sorts all objects.
-Doesn't allow any null key.
-TreeSet is much slower.
		 * */
		
		
		Set<String> setHash = new HashSet<>();
		setHash.add("Chaand");
		setHash.add("John");
		setHash.add("Aafiya");
		setHash.add("Armaan");
		setHash.add("Mia");
		setHash.add("Chaand");
		DisplaySet(setHash);
		System.out.println("*****************");
		
        System.out.println(setHash.contains(1));
        System.out.println("*****************");
        
        Set<String> setLinkedHash = new LinkedHashSet<>();
        setLinkedHash.add("Chaand");
        setLinkedHash.add("John");
        setLinkedHash.add("Aafiya");
        setLinkedHash.add("Armaan");
        setLinkedHash.add("Mia");
        setLinkedHash.add("Chaand");
		DisplaySet(setLinkedHash);
		System.out.println("*****************");
		
		  Set<String> setTree = new TreeSet<>();
		  setTree.add("Chaand");
		  setTree.add("John");
		  setTree.add("Aafiya");
		  setTree.add("Armaan");
		  setTree.add("Mia");
		  setTree.add("Chaand");
			DisplaySet(setTree);
			System.out.println("*****************");
        

	}
	public static void DisplaySet(Set<String> setType) {
		for(String name: setType){
			System.out.println(name);
		}
	}

}
