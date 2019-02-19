package stringClassEx;

public class StringClassEx {
	public static void showString(String str) { 
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String");
		String str2 = "Test string";
		
		System.out.println(str1);
		System.out.println(str2.length());
		
		showString("adios");
	}

}
