package threadRunnableEx;

import java.util.ArrayList;
import java.util.Random;

public class Test1 implements Runnable{
	private int index = 0;
	
	@Override
	public void run() {
		Random r = new Random(System.currentTimeMillis());
		 long s = r.nextInt(3000); // 3초내로 끝내자
		 try {
			 Thread.sleep(s); // 쓰레드를 잠시 멈춤
		 }catch(InterruptedException e ) {
			 e.printStackTrace();
		 }
		addIndex();
		
	
	}
	
	synchronized void addIndex() {
		index++;
		System.out.println("current index value " + index);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Test1(); // 실제 구현한 Runnable 인터페이스 
		ArrayList<Thread> threadList = new ArrayList<Thread>(); // 쓰레드들을 담을 객체
		
		for(int i = 0; i < 10 ; i++ ) {
			Thread t = new Thread(r); 
			
			t.start(); // 이 메소드를 실행하면 Thread 내의 run() 을 수행한다.
			threadList.add(t); // 생성한 쓰레드를 리스트에 삽입
		}
		
		for(Thread t : threadList) {
			t.join();
		}
	}
}
