import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̿��� ���� ���ڸ� �Է��� �ּ��� ex)1���̸� 1 , 2���̸� 2");
		Scanner scan = new Scanner(System.in);
		int customerNumber = scan.nextInt();
		String[] ar = new String[15];
		for(int i = 0; i<customerNumber; i++) {
			System.out.println("�̿��Ͻô� ���� �̸��� �Է� �� �ּ���");
			ar[i] = scan.nextLine();
		}
		
		for(int i = 0; i<customerNumber; i++) {
			System.out.println("�̿����� �̸���"+ar[i]);
		}
		
	}

}
