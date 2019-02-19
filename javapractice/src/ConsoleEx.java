import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "1 3 5";
		Scanner sc = new Scanner(source); // Scanner 인스턴스와 인자로 전달된 source와의 결이 이어진다. 
		Scanner scan = new Scanner(System.in); // System.in은 키보드를 의미한다. 정확히는 키보드를 의미하는 인스턴스의 참조변수이다.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		System.out.println(sum);
	}

}
