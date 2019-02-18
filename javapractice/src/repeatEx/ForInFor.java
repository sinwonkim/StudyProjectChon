package repeatEx;

import java.util.Scanner;

public class ForInFor {
	
	static int count ; 
	/*
	 * 바깥쪽 for문과 안쪽 for문 
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("숫자를 입력해 주세요");
		 int inputNumber = scan.nextInt();
		 
		 if(inputNumber<=100) {
			 System.out.println("입력한 숫자가 100 이하 입니다.");
		 }
		 
		for(int i = 0; i < 3; i++) { // 바깥쪽 for문 
			for(int j  = 0; j < 3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println("안쪽 for문 벗어남 ");
			System.out.println();
		}
	}
}
