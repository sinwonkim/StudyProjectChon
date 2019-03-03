
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathTest mathTest = new MathTest();
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println((int)(Math.random()*10)+1);
		}
	}
	
	int getRandom() {
		
		return (int)(Math.random()*5+1);
	}
}
