package thread;

public class theradSample extends Thread { //Thread Ŭ������ ����� ��� 
	public void run() {
		System.out.println("Thread run");
		try {
			Thread.sleep(8000);
		}catch(Exception e) {
			
		}
		System.out.println("ȣ��");
	}
}
