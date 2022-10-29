package info.oops.shops;
/* Java class to show the member inner class in Java
 
public class Door {

	
       private Lock lock;
       
       public Door() {
    	   lock =new Lock(true);
       }
    
       public void shopStatus() {
    	   if(lock.isLock()) {
    		   System.out.println("Shop is closed !");
    	   }else {
    		   System.out.println("We are open");
    	   }
       }
       
       

	public Lock getLock() {
		return lock;
	}


//Here lock class is a inner class having a constructor ,getter 
	//and setter methods.
	public class Lock{
    	   private boolean lock;

		public Lock(boolean lock) {
           this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
    	   
    	   
       }
	}

 */



//Member Inner Class
//The inner class Lock is inside from the world and is abstract class.
public class Door{
	public boolean isLocked(String key) {
		class Lock{
			public boolean isLocked(String key) {
				if(key.equals("Locked")) {
					return false;
				}else {
					return true;
				}
			}
			
		}
		return new Lock().isLocked(key);
	}
}
