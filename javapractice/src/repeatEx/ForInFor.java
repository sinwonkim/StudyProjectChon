package repeatEx;

import java.util.Scanner;

public class ForInFor {
	
	static int count ; 
	/*
	 * �ٱ��� for���� ���� for�� 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String something = scan.nextLine();		
		System.out.print("������  �̶�� �Է��ϼ��� �׷��� ���� �մϴ�.");
		System.out.println();
		
		 if(something.equals("������")) {
		for(int i = 2; i < 10; i++) { // �ٱ��� for�� 
			for(int j  = 1; j < 10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println(i+"�� ��!");
			System.out.println();
		}
	}
	}
}
