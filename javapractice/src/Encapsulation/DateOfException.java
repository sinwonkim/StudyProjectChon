package Encapsulation;

import java.time.LocalDate;

public class DateOfException {
	
	static String date; // ���α׷��� ���� ��¥�� �����ϱ� ���� ����  
	
	static { // Ŭ���� �ε� �� �� �� �� ������ �Ǵ� ����
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(date);
	}

}
