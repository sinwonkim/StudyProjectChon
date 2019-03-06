package thread;

public class ThreadTest  {


	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			theradSample threadtest = new theradSample(i);
			threadtest.start();
		}
		System.out.println("main end");
	}
}
	