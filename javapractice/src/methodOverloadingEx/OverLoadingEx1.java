package methodOverloadingEx;


/*
 *  한 클래스 내에 동일한 이름의 메소드를 둘 이상 정의하는 것을 허용되지 않는다 그러나 매개변수의 선언이 다르면 가능하다. 
 *  이것을 메소드 오버로딩이라 한다.
 * 
 */
public class OverLoadingEx1 {
	
	private int number;
	
	OverLoadingEx1() { // 생성자도 오버로딩의 대상이 된다.
		
	}
	OverLoadingEx1(int a) {
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
	public void atom(int a) {
		
	}
	
	public void atom() {
		
	}
	
	public void atom(int b,String a) {
		
	}

}
