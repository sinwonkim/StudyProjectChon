package threadRunnableEx;

import java.util.ArrayList;
import java.util.Random;

public class Test1 implements Runnable{
	private int index = 0;
	
	@Override
	public void run() {
		Random r = new Random(System.currentTimeMillis());
		 long s = r.nextInt(3000); // 3�ʳ��� ������
		 try {
			 Thread.sleep(s); // �����带 ��� ����
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
		Runnable r = new Test1(); // ���� ������ Runnable �������̽� 
		ArrayList<Thread> threadList = new ArrayList<Thread>(); // ��������� ���� ��ü
		
		for(int i = 0; i < 10 ; i++ ) {
			Thread t = new Thread(r); 
			
			t.start(); // �� �޼ҵ带 �����ϸ� Thread ���� run() �� �����Ѵ�.
			threadList.add(t); // ������ �����带 ����Ʈ�� ����
		}
		
		for(Thread t : threadList) {
			t.join();
		}
	}
}
