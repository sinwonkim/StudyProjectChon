package Encapsulation;

class InstCnt {
	static int num = 0 ; // 클래스 변수 (static 변수)
	
	InstCnt() { // 생성자
		num++; // static 으로 선언된 변수의 값 증가
		System.out.println("인스턴스 생성 : "+ num);
	}
}

	

public class ClassVar {
	public static void main(String[] args) {
		InstCnt inst = new InstCnt(); // static으로 선언돈 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.
		InstCnt inst1 = new InstCnt();
		InstCnt inst2 = new InstCnt();
	}
}
