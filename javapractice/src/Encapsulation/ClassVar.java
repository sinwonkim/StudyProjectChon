package Encapsulation;

class InstCnt {
	static int num = 0 ; // Ŭ���� ���� (static ����)
	
	InstCnt() { // ������
		num++; // static ���� ����� ������ �� ����
		System.out.println("�ν��Ͻ� ���� : "+ num);
	}
}

	

public class ClassVar {
	public static void main(String[] args) {
		InstCnt inst = new InstCnt(); // static���� ���� ������ ������ ����� Ŭ������ ��� �ν��Ͻ��� �����ϴ� �����̴�.
		InstCnt inst1 = new InstCnt();
		InstCnt inst2 = new InstCnt();
	}
}
