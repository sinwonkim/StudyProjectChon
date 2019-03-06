package exceptiontest;

public class ExceptionTest {
	
	public void errorMessage() {
		System.out.println("error ¹ß»ý");
	}
	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		int[] intArray = new int[4];
	
		try {
			intArray[5] = 4;
		}catch (ArrayIndexOutOfBoundsException e) {
			intArray[3] = 3;
			System.out.println(intArray[3]);
 		}finally {
			exceptionTest.errorMessage();
		}
	
	}
}
