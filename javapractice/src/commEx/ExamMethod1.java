package commEx;

public class ExamMethod1 {
	
	public static void callByName() {
		System.out.println("callByName �޼��� : �޼����� �̸����� ȣ���ϴ� �޼���");
	}
	
	// �޼ҵ� �����ε� �޼ҵ��̸� �����ϰ� ��� ������ 
	// �� �Ķ���� Ÿ�� or �Ķ���Ͱ��� �޶�� �Ѵ�.
	public static void callByName(String name) {
		System.out.println("'" + name +"'"+"was coalled");
	}
	
	
	public static int callByName(int a , int b) { // CallByValue
		return a + b;							// CallByName�� �ٸ��� �Ű������� ���Ͽ� ���� �����ϰ� �� ���� �޼��忡�� �̿��� �� �ִ� ȣ�� ����̴�. 
	}											// �̋� �߿��ϰ� �����ؾ� �� ���� ������ �Ű������� Data�� ������ ������ �ִ��� �̴�. 
	
	
	
	/* return�� ���� �ʹ� �߿��� �����̴�. �޼��� �ȿ��� ����Ǵ� ������ �޼��尡 ������ ��� ������� ������ (�޼��� �ȿ��� ������ �������̶��)
	 * �ʿ��� ����� return �޾� �޼��带 ȣ���� ������  ����ؾ� �� �ʿ䰡 �ִ�. �׋� return�� ����ϸ�, return�Ǵ� Ÿ���� �޼��带 ������ �� ��������� �Ѵ�. 
	 */
	
	public static int getNumber(int a, int b) {
		int d = a+b;
		int c = d*2;
		return c;
	}
	
	public static void main(String[] args) {
		
		// �޼����?
		// ���� �ݺ��Ǿ� ���Ǵ� ������ ��� Ư���̸����� ������ ����
		// ���� 
		// �޼����(�Ű�����) throws ���� Ŭ����{��������;} 
		
		// �޼����� ���� 
		
		//call By Name - �޼����� �̸����� ȣ���ϴ� �޼���. Ư���Ű����� ����
		
		callByName();
		callByName("ȣ");
		 int c = callByName(1,3);
		 System.out.println("C : "+c);
		 
		 // CallByValue 
		 // CallByName�� �ٸ��� �Ű������� ���Ͽ� ���� �����ϰ� �� ���� �޼��忡�� �̿��� �� �ִ� ȣ�����̴�. �̶� �߿��ϰ� �����ؾ� �� ���� ������ �Ű������� Data�� ������ 
		 // ������ �ִ��� �̴�. ���޵� �Ű������� data�� ȣ��� �޼���ȿ����� �̿�ǰ� ��������. 
		 
		 int a = 10;
		 int b = 20;
		 int result = getNumber(a,b);
		 System.out.println("a : "+a+" b : " + b);
		 System.out.println("result : " + result);
		 

	}
	


}