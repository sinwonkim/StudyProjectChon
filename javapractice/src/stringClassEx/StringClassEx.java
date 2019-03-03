package stringClassEx;

public class StringClassEx {
	public static void showString(String str) { 
		System.out.println(str);
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		String str1 = new String("Simple String"); // String 인스턴스 생성방법 1
		String str3 = new String("Simple String"); // String 인스턴스 생성방법 1
		
		if(str1 == str3) { // ==은 참조 변수를 대상으로 한 '참조변수의 참조 값'에 대한 비교 연산을 진행한다.
			System.out.println("str1과 str3은 동일 인스턴스 참조 ");
		}else
			System.out.println("str1과 str3은 동일 인스턴스 참조하지 않는다.");
	
		String str2 = "Test string"; // String 인스턴스 생성방법 2
		String str4 = "Test string"; // String 인스턴스 생성방법 2
		
		if(str2 == str4) {
			System.out.println("str2와 str4는 동일 인스턴스를 참조한다.");
		}else
			System.out.println("str2와 4는 동일 인스턴스를 참조하지 않는다.");
		
		System.out.println(str1);
		System.out.println(str2.length());
		
		showString("adios"); // adios라는  String 인스턴스가 만들어진다. 
		
		
	}

}
