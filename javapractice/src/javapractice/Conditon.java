package javapractice;

import java.util.Scanner;


public class Conditon {
	

	static class  whileEx1{
		
		public void whilemethod(int num) {
			 
			while(num < 99) {
				System.out.println("입력 받은 숫자가 99보다 작습니다.");
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 whileEx1 whileex = new whileEx1();
	
			System.out.println("숫자를 입력하세요");
			 int a = scan.nextInt();
			 whileex.whilemethod(a);
			 
	}
}
