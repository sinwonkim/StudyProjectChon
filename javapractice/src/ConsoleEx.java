import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "1 3 5";
		Scanner sc = new Scanner(source); // Scanner �ν��Ͻ��� ���ڷ� ���޵� source���� ���� �̾�����. 
		Scanner scan = new Scanner(System.in); // System.in�� Ű���带 �ǹ��Ѵ�. ��Ȯ���� Ű���带 �ǹ��ϴ� �ν��Ͻ��� ���������̴�.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		System.out.println(sum);
	}

}
