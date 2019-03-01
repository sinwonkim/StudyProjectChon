package inheritance;

public class Dog extends Animal {
	public void sleep() {
		System.out.println(this.name+"zzzz");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("hoho"); // 내가 따로만든 메소드아님 부모 클래스Animal 상속받아서 사용할수 있음
		System.out.println(dog.name);
		dog.sleep();
	}
	
}
/* 이제 Dog클래스는 Animal클래스를 상속하게 되었다.
 * Dog 클래스에 name이라는 객체변수와 setName이라는 메소드를 만들진 않았지만
 * Animal 클래스를 상속을 받았기 떄문에 그대로 사용이 가능하다. 
 * 이제 Dog클래스는 Aniaml클래스보다 좀 더 많은기능(Sleep메소드가 추가되었다)가지게 되었다.
 * 이렇듯 보통 부모 클래스를 상속받은 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은기능을 
 * 갖도록 설계한다. 
 * 
 * IS-A 관계
 * Dog 클래스는 Animal클래스를 상속받았다. 즉,Dog는 Aniaml의 하위 개념이라고 할 수 있겠다.
 * 이런 경우 Dog는 Aniaml 에 포함되기 떄문에 개는 동물이다 라고 표현할 수 있다. 
 * 자바는 이러한 관계를 IS-A 관계라고 표현한다 즉"Doig is a Aniaml"과 같이 말할 수 있는 관계를 IS-A라관계라고 한다.
 * 이렇게 IS-A 관계(상속관계)에 있을떄 자식 객체는 부모 클래스의 자료형인 것처럼 사용할 수 있다. 
 * 즉, 다음과 같은 코딩이 가능하다. 
 * Animal dog = new Dog(); // Dog는 Animal클래스의 자식클래스이다.
 * 
 * 하지만 이 반대의 경우, 즉 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로는 사용할 수 없다.
 * Dog dog = new Animal(); // 컴파일 오류 : 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
 *  Animal dog = new Dog();
 *  위 코드를 읽어보면 "개로 만든 객체는 동물 자료형이다"라고 읽을 수 있따.
 *  
 *  Dog dog = new Animal();
 *  
 *  역시 개념적으로 읽어보면 " 동물로 만든 객체는 개 자료형이다."로 읽을 수 있을것이다. 근데 뭔가 좀 이상하지 않은가? 동물로 만든 
 *  객체는 "개"자료형 말고 "호랑이" 자료형 또는 "사자"자료형도 사용될 수도 있지 않은가?
 *  자바에서 만드는 모든 클래스는 object라는 클래스를 상속받게 되어 있다. 사실 우리가 Aniaml 클래스는 다음과 기능적으로 완전히 동일하다.
 *  하지만 굳이 아래 코드처럼 Object클래스를 상속하도록 코딩하지 않아도 자바에서 만들어지는 모든 클래스는 Object클래스를 자동으로 
 *  상속받게끔 되어 있다.
 *  public class Animal extends Object {
 *   	String name // 객체변수 = 멤버변수 
 *   
 *   public void setName(String name) {
 *   this.name = name; 
 *   }
 *  }
 *  따라서 자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있다. 즉,다음과 같이 코딩하는 것이 가능하다.
 *  Object animal = new Animal();
 *  Object dog = new Dog();
 */
