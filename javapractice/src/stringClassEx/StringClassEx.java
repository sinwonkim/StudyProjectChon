package stringClassEx;

public class StringClassEx {
	public static void showString(String str) { 
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String"); // String �ν��Ͻ� ������� 1
		String str3 = new String("Simple String"); // String �ν��Ͻ� ������� 1
		
		if(str1 == str3) { // ==�� ���� ������ ������� �� '���������� ���� ��'�� ���� �� ������ �����Ѵ�.
			System.out.println("str1�� str3�� ���� �ν��Ͻ� ���� ");
		}else
			System.out.println("str1�� str3�� ���� �ν��Ͻ� �������� �ʴ´�.");
	
		String str2 = "Test string"; // String �ν��Ͻ� ������� 2
		String str4 = "Test string"; // String �ν��Ͻ� ������� 2
		
		if(str2 == str4) {
			System.out.println("str2�� str4�� ���� �ν��Ͻ��� �����Ѵ�.");
		}else
			System.out.println("str2�� 4�� ���� �ν��Ͻ��� �������� �ʴ´�.");
		
		System.out.println(str1);
		System.out.println(str2.length());
		
		showString("adios"); // adios���  String �ν��Ͻ��� ���������. 
		
		
	}

}
