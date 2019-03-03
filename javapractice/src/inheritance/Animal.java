package inheritance;
// 원 저작권은 점프 투 자바에 있습니다.
public class Animal {
	String name;
	
	public void setName(String name) {
		this.name =  name; 
	}
}

/*자바의 상속에 대해서 알아보자 
* 상속은 말 그대로 자식이 부모로부터 무언가를 물려받는 것이다.
* Animal 클래스를 상속하는 Dog 클래스를 만들어 보자 
* 클래스 상속을 위해서는 extends라는 키워드를 사용한다.
* 자식 클래스 extends 부모 클래스 
* 이제 Dog 클래스는 Animal클래스를 상속하게 되었다.
* 
*/
