package commEx;

public class ExamMethod1 {
	
	public static void callByName() {
		System.out.println("callByName 메서드 : 메서드의 이름으로 호출하는 메서드");
	}
	
	// 메소드 오버로딩 메소드이름 동일하게 사용 가능함 
	// 단 파라미터 타입 or 파라미터갯수 달라야 한다.
	public static void callByName(String name) {
		System.out.println("'" + name +"'"+"was coalled");
	}
	
	
	public static int callByName(int a , int b) { // CallByValue
		return a + b;							// CallByName과 다르게 매개변수를 통하여 값을 전달하고 그 값을 메서드에서 이용할 수 있는 호출 방식이다. 
	}											// 이떄 중요하게 생각해야 할 점은 전달한 매개변수의 Data가 어디까지 생존해 있느냐 이다. 
	
	
	
	/* return은 정말 너무 중요한 개념이다. 메서드 안에서 실행되는 내용은 메서드가 끝나는 즉시 사라지기 떄문에 (메서드 안에서 생성된 변수들이라면)
	 * 필요한 결과를 return 받아 메서드를 호출한 곳에서  사용해야 할 필요가 있다. 그떄 return을 써야하며, return되는 타입은 메서드를 생성할 떄 정의해줘야 한다. 
	 */
	
	public static int getNumber(int a, int b) {
		int d = a+b;
		int c = d*2;
		return c;
	}
	
	public static void main(String[] args) {
		
		// 메서드란?
		// 자주 반복되어 사용되는 내용을 묶어서 특정이름으로 정의한 묶음
		// 형식 
		// 메서드명(매개변수) throws 예외 클래스{내용정의;} 
		
		// 메서드의 종류 
		
		//call By Name - 메서드의 이름으로 호출하는 메서드. 특정매개변수 없음
		
		callByName();
		callByName("호");
		 int c = callByName(1,3);
		 System.out.println("C : "+c);
		 
		 // CallByValue 
		 // CallByName과 다르게 매개변수를 통하여 값을 전달하고 그 값을 메서드에서 이용할 수 있는 호출방식이다. 이때 중요하게 생각해야 할 점은 전달한 매개변수의 Data가 어디까지 
		 // 생존해 있느냐 이다. 전달된 매개변수의 data는 호출된 메서드안에서만 이용되고 없어진다. 
		 
		 int a = 10;
		 int b = 20;
		 int result = getNumber(a,b);
		 System.out.println("a : "+a+" b : " + b);
		 System.out.println("result : " + result);
		 

	}
	


}