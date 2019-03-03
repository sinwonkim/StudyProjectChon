package stringClassEx;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		System.out.println("글자 입력해보세요");
		Scanner scan = new Scanner(System.in);
		String inputText  = scan.nextLine();
		
		switch(inputText) {
		case "one":
			System.out.println("당신의 입력값은 :one");
			break;
			
		case "two":
			System.out.println("당신의 입력값은 : two");
			break;
		default :
			System.out.println("당신의 입력값은 : valus is not one and two");
		}
	}
}
