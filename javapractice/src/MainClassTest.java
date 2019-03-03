
public class MainClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectTest objectTest = new ObjectTest(); // 인스턴스 생성후
		objectTest.a = 1;
		System.out.println(objectTest.a);
		objectTest.printTest(objectTest);
		System.out.println(objectTest.a);
		ObjectTest objectTest2 = new ObjectTest();
		System.out.println("objectTest2 : "+objectTest2.a);
	}

}
