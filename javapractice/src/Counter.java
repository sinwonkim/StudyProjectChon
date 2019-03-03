
public class Counter {
/*Call by value
 * �޼ҵ忡 ��(primitive type)�� �����ϴ� �Ͱ� ��ü(reference type)�� �����ϴ� �Ϳ��� ū ���̰� �ִ�. 
 * ����� �޼ҵ�� ��ü�� ������ ��� �޼ҵ忡�� ��ü�� ��ü ���� ����(�Ӽ�)���� ������ �� �ְ� �ȴ�. 
 * CounterŬ������ main�޼ҵ�� Counter Ŭ������ ���� ������ ��ü���� count�� ���� Updater Ŭ������ �̿��Ͽ� ������Ű���� �õ��ϴ� �����̴�.
 * ��ü ���� count�� ���� update�޼ҵ忡 �Ѱܼ� ������Ű���� ���� ��ȭ�� ����. �� ������ update�޼ҵ�� ��(int �ڷ���)�� ���޹޾ұ� �����̴�.
 * 
 * */
	int count; // ��ü����
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("befor update : "+myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter); // myUpdater �ν��Ͻ���  update�޼ҵ带 ȣ���ϴ� �κе� ȣ���ҋ� �����ϴ� ���ڰ� ��ü�� ������
		System.out.println("after update : " + myCounter.count);
	}
	/*������� �Ѵ� 0 
	 * Counter.java��� ���ϳ��� Update�� Counter��� Ŭ���� 2���� �����ߴ�. �ϳ��� java���ϳ����� �������� Ŭ������ ������ �� �ִ�.
	 * �� ���ϸ��� Counter.java��� Counter.java���� Counter��� Ŭ������ public ���� �����϶�� ����(��Ģ)�� �ִ�. 
	 * 
	 * 
	 * */
	
	
	// �� ���۱��� ���� �� �ڹٿ� �ֽ��ϴ�. 
}
class Updater {								// �̷��� �޼ҵ��� �Է����� ��ü�� ���޹޴� ��쿡�� �޼ҵ尡 �Է¹��� ��ü�� �״�� ����ϱ� ������ �޼ҵ尡 ��ü�� �Ӽ����� 
											// �����ϸ� �޼ҵ� ���� �� ��ü�� ����� �Ӽ����� �����ǰ� �ȴ�. 
	public void update(Counter counter) { /*update�޼ҵ��� �Է��׸��̴�. �������� int count�� ���� ���� ���޹޾Ҵٸ� ������ ��ü�� ���޹޵��� ������ ���̴�. */
		counter.count++;
	}
	/*UpdaterŬ������ ���޹��� ���ڸ� 1��ŭ ������Ű�� update��� �޼ҵ带 ������ �ִ�. CounterŬ������ count��� ��ü������ ������ �ִ�. */
}
