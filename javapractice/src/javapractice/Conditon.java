package javapractice;

import java.util.Scanner;


public class Conditon {
	

	static class  whileEx1{
		
		public void whilemethod(int num) {
			 
			while(num < 99) {
				System.out.println("�Է� ���� ���ڰ� 99���� �۽��ϴ�.");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 whileEx1 whileex = new whileEx1();
	
			System.out.println("���ڸ� �Է��ϼ���");
			 int a = scan.nextInt();
			 whileex.whilemethod(a);
			 
	}
}
