package thread;

public class theradSample extends Thread { //Thread Ŭ������ ����� ���
	int count;
	public theradSample(int i) {
		this.count = i;
	}

	public void run() {
		System.out.println("Thread start : "+count);
		try {
			Thread.sleep(8000);
		}catch(Exception e) {
			
		}
	}
}
