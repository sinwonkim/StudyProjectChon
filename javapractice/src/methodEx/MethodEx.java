package methodEx;

import java.util.Date;
import java.util.Scanner;

public class MethodEx {
	
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Hello World Today is "+date.toString());
		System.out.println("�̹� �� �� ������ �������� :");
		Scanner scan = new Scanner(System.in);
		int income= scan.nextInt();
		
		
		
		MyAccount myAccount = new MyAccount(income);
		int currentBalance= myAccount.getMyBank();
		System.out.println("���� �� �ܾ��� :"+currentBalance+"�� �Դϴ�.");
	}
}
