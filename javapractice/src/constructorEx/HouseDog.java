package constructorEx;

public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}
	public void sleep( ) {
		System.out.println(this.name+ " zzzz ");
	}
	
	public void sleep(int hour) { // 메소드 오버로딩
		 System.out.println(this.name+ " zzzz is house for " + hour + " hours " );
	}
	
	public static void main(String[] args) {
		HouseDog dog = new HouseDog("happy");
		System.out.println(dog.name);
	}
}
/*name 이라는 객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제 할 수 있는
 * 방법은 없을까?
 * 
 * 생성자Constructor를 이용하면 된다. 
 * 위 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자Constructor라고 말한다.
 * 
 * 생성자의 규칙 
 * 1.클래스명과 메소드명이 동일하다.
 * 2.리턴타입을 정의하지 않는다.
 * 생성자는 객체가 생성될 떄 호출된다. 객체가 생성될 떄는 new라는 키워드로 객체가 만들어질 떄이다.
 * 즉, 생성자는 다음과 같이 new라는 키워드가 사용될 떄 호출된다.
 * new 클래스명(입력항목,....)
 * 생성자는 메소드와 마찬가지로 입력을 받을 수 있다. 
 * 
 * 생성자는 메소드와 마찬가지로 입력을 받을 수 있다.
 * 
 * 우리가 만든 생성자는 다음과 같이 입력값으로 문자열을 필요로 하는 생성자이다.
 * 
 * 따라서 다음과 같이 new키워드로 객체를 만들떄 문자열을 전달해야만 한다.
 * 
 * House Dog = new HouseDog("happy"); // 생성자 호출 시 문자열을 전달해야만 한다.
 * 
 */
 