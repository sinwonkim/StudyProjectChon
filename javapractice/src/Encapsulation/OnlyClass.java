package Encapsulation;

class InstCnt1 {
	static int num = 100; // Ŭ���� ������ �ν��Ͻ� ���� ������ �޸� ������ �����Ѵ�.
						// Ŭ���� ������ ���� �����ϰ� ����ұ�? �ν��Ͻ����� ������ ������ �ʿ��� �� 
	
	InstCnt1() {
		num++;
		System.out.println("�ν��Ͻ� ���� : "+num);
	}
}

public class OnlyClass {
	public static void main(String[] args) {
		InstCnt1.num -=15; // �ν��Ͻ� �������� num�� ���� 
		System.out.println(InstCnt1.num);
	}
}

