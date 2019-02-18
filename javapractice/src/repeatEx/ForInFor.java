package repeatEx;

import java.util.Scanner;

public class ForInFor {
	
	static int count ; 
	/*
	 * 바깥쪽 for문과 안쪽 for문 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String something = scan.nextLine();		
		System.out.print("구구단  이라고 입력하세요 그러면 시작 합니다.");
		System.out.println();
		
		 if(something.equals("구구단")) {
		for(int i = 2; i < 10; i++) { // 바깥쪽 for문 
			for(int j  = 1; j < 10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println(i+"단 끝!");
			System.out.println();
		}
	}
	}
}
