package threadUnderstand;

public class CurrentThreadName {
	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		System.out.println("현재 실행 되는 쓰레기 name : "+name);
	}
}
