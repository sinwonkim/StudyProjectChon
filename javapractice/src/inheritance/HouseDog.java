package inheritance;

public class HouseDog extends Dog {
	public void sleep() { 
		System.out.println(this.name+" zzzz in house");
	}
	public void sleep(int hour) { // 메소드 오버로딩 = >  추가다 
		System.out.println(this.name+" zzzz in house "+hour + "hours " );
	}
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // sleep() 메소드 호출
		houseDog.sleep(3); // sleep(int hour) 메소드 호출
	}
}
/* 메소드 오버라이딩(Mtthod Overriding)
 * 이번에는 Dog클래스를 좀 더 구체화 시키는 HouseDog 클래스를 만들어 보ㄷ자.
 * HoustDog 클래스는 Dog 클래스를 상속하여 다음과 같이 만들 수 있다.
 * 
 * public class 
 * HouseDog 클래스에 Dog클래스와 동일한 형태(입출력이 동일)의 sleep 메소드를 구현하려면
 * HouseDog 클래스의 sleep 메소드가 Dog클래의 sleep 메소드보다 더 높은 우선순위를 갖게 되어
 * HouseDog 클래스의 sleep메소드가 호출되게 된다.
 * 
 * 이렇게 부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위를
 * 메소드 오버라이딩이라고 한다. *메소드 덮어쓰기 
 * 
 * 메소드 오버로딩(method overloading)
 * 이번에는 HouseDog 클래스에 다음과 같은 메소드를 추가해보자. ("변경"이 아니라 "추가"임에 주의하자)
 * 
 * 다중상속 
 * 다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다. 
 */
