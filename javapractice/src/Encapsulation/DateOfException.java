package Encapsulation;

import java.time.LocalDate;

public class DateOfException {
	
	static String date; // 프로그램의 실행 날짜를 저장하기 위한 변수  
	
	static { // 클래스 로딩 시 단 한 번 실행이 되는 영역
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(date);
	}

}
