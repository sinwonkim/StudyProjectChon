import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이용할 고객의 숫자를 입력해 주세요 ex)1명이면 1 , 2명이면 2");
		Scanner scan = new Scanner(System.in);
		int customerNumber = scan.nextInt();
		String[] ar = new String[15];
		for(int i = 0; i<customerNumber; i++) {
			System.out.println("이용하시는 고객의 이름을 입력 해 주세요");
			ar[i] = scan.nextLine();
		}
		
		for(int i = 0; i<customerNumber; i++) {
			System.out.println("이용자의 이름은"+ar[i]);
		}
		
	}

}
