package methodEx;

import java.util.Date;
import java.util.Scanner;

public class MethodEx {
	
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Hello World Today is "+date.toString());
		System.out.println("이번 달 총 수입을 적으세요 :");
		Scanner scan = new Scanner(System.in);
		int income= scan.nextInt();
		
		
		
		MyAccount myAccount = new MyAccount(income);
		int currentBalance= myAccount.getMyBank();
		System.out.println("현재 총 잔액은 :"+currentBalance+"원 입니다.");
	}
}
