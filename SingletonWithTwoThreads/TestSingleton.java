//Singleton pattern ensure a class has one instance, and provide a globle point of access to it.it makes reuseablity to the instance.

package SingletonWithTwoThreads;

class SingleTon {
	private static SingleTon instance;
	
	private SingleTon() {
		System.out.println("Instance Created");
	}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {
				if(instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}

	void method() {
		System.out.println("Invoke method");
	}

}

public class TestSingleton implements Runnable{
	public static void main(String[] args) {
		new Thread(new TestSingleton()).start();
		new Thread(new TestSingleton()).start();
		
		for(int i = 0 ; i < 10 ; i++) {
			SingleTon.getInstance().method();
		}
	}
		
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			SingleTon.getInstance().method();
		}
		
	}
}
