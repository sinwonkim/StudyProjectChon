
public class Counter {
/*Call by value
 * 메소드에 값(primitive type)을 전달하는 것과 객체(reference type)를 전달하는 것에는 큰 차이가 있다. 
 * 결론은 메소드로 객체를 전달할 경우 메소드에서 객체의 객체 변수 값을(속성)값을 변경할 수 있게 된다. 
 * Counter클래스의 main메소드는 Counter 클래스에 의해 생성된 객체변수 count의 값을 Updater 클래스를 이용하여 증가시키려고 시도하는 예제이다.
 * 객체 변수 count의 값을 update메소드에 넘겨서 변형시키더라도 값에 변화가 없다. 그 이유는 update메소드는 값(int 자료형)을 전달받았기 떄문이다.
 * 
 * */
	int count; // 객체변수
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("befor update : "+myCounter.count);
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter); // myUpdater 인스턴스의  update메소드를 호출하는 부분도 호출할떄 전달하는 인자가 객체로 전달함
		System.out.println("after update : " + myCounter.count);
	}
	/*결과값은 둘다 0 
	 * Counter.java라는 파일내에 Update와 Counter라는 클래스 2개가 등장했다. 하나의 java파일내에는 여러개의 클래스를 선언할 수 있다.
	 * 단 파일명이 Counter.java라면 Counter.java내의 Counter라는 클래스는 public 으로 선언하라는 관례(규칙)가 있다. 
	 * 
	 * 
	 * */
	
	
	// 본 저작권은 점프 투 자바에 있습니다. 
}
class Updater {								// 이렇게 메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 떄문에 메소드가 객체의 속성값을 
											// 변경하면 메소드 수행 후 객체의 변경된 속성값이 유지되게 된다. 
	public void update(Counter counter) { /*update메소드의 입력항목이다. 이전에는 int count와 같이 값을 전달받았다면 지금은 객체를 전달받도록 변경한 것이다. */
		counter.count++;
	}
	/*Updater클래스는 전달받은 숫자를 1만큼 증가시키는 update라는 메소드를 가지고 있다. Counter클래스는 count라는 객체변수를 가지고 있다. */
}
