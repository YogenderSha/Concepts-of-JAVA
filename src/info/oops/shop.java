package info.oops;

import info.oops.shops.*;
//import info.oops.shops.Door.Lock;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Door door = new Door();
		/*
		 * door.shopStatus();
		 * 
		 * door.getLock().setLock(false); door.shopStatus();
		 */
		// System.out.println(door.isLocked("hello"));
		if (door.isLocked(args[0])) {
			System.out.println("Shop is closed..Visit later");
		}else {
			System.out.println("You are welcome !");
		} 
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
