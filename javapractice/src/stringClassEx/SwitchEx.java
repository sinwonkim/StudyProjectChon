package stringClassEx;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		System.out.println("���� �Է��غ�����");
		Scanner scan = new Scanner(System.in);
		String inputText  = scan.nextLine();
		
		switch(inputText) {
		case "one":
			System.out.println("����� �Է°��� :one");
			break;
			
		case "two":
			System.out.println("����� �Է°��� : two");
			break;
		default :
			System.out.println("����� �Է°��� : valus is not one and two");
		}
	}
}
