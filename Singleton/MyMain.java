package Singleton;

public class MyMain {
	public static void main(String[] args) {
		
		//MySingleton ob = new MySingleton();
		for(int i= 0; i < 10 ; i++) {
			MySingleton.getInsta().method();;
		}
		
	}
}
