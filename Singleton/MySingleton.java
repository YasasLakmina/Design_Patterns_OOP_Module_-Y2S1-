package Singleton;

public class MySingleton {
	private static MySingleton uniqueInst;
	
	private MySingleton() {
		System.out.println("Instance Created");
	}
	
	public static MySingleton getInsta() {
		
		//Double check Lock
		if(uniqueInst == null) {
			synchronized(MySingleton.class) {
				
				if(uniqueInst == null) {
					
					uniqueInst = new MySingleton();
				}
			}
		}
		
		return uniqueInst;
	}
	
	void method() {
		System.out.println("Invoke method");
	}

}
