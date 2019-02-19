package Encapsulation;

class InstCnt1 {
	static int num = 100; // 클래스 변수는 인스턴스 생성 이전에 메모리 공간에 존재한다.
						// 클래스 변수를 언제 유용하게 사용할까? 인스턴스간에 데이터 공유가 필요할 떄 
	
	InstCnt1() {
		num++;
		System.out.println("인스턴스 생성 : "+num);
	}
}

public class OnlyClass {
	public static void main(String[] args) {
		InstCnt1.num -=15; // 인스턴스 생성없이 num에 접근 
		System.out.println(InstCnt1.num);
	}
}

