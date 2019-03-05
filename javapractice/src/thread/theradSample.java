package thread;

public class theradSample extends Thread { //Thread 클래스를 상속한 방식 
	public void run() {
		System.out.println("Thread run");
		try {
			Thread.sleep(8000);
		}catch(Exception e) {
			
		}
		System.out.println("호옹");
	}
}
