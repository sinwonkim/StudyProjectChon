
public class Test1 {
	public void sayNick(String a) {
		try {
			
		
		if("fool".equals(a)) {
			throw new FoolException(); // FoolException ��� RuntimeException Ŭ������ ��ӹ���  RuntimeException�� �߻��Ҽ��� �߻����Ҽ��� 
		}
		}catch(FoolException e)  {
			System.out.println("FoolException�� �߻��߽��ϴ�.");
		}
		System.out.println("����� ������"+a+" �Դϴ�.");
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.sayNick("fool"); 

	}

}
