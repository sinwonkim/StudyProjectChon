package repeatEx;

import java.util.Scanner;

public class ForInFor {
	
	static int count ; 
	/*
	 * �ٱ��� for���� ���� for�� 
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("���ڸ� �Է��� �ּ���");
		 int inputNumber = scan.nextInt();
		 
		 if(inputNumber<=100) {
			 System.out.println("�Է��� ���ڰ� 100 ���� �Դϴ�.");
		 }
		 
		for(int i = 0; i < 3; i++) { // �ٱ��� for�� 
			for(int j  = 0; j < 3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println("���� for�� ��� ");
			System.out.println();
		}
	}
}
