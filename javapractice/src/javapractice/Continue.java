package javapractice;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
	System.out.println("���ڸ� �Է��ϼ���.");	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	
	Coperators  cop = new Coperators();
	cop.operator(a);
		
	}
}
