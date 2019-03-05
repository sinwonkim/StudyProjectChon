package enhancedFor;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5}; // int 타입 배열을 만듬
		for(int e : ar) { // for (대입받을 변수 정의 : 배열 ) 배열값이 대입받는 변수에 대입되어 For Loop의 Body코드가 실행 됨
			System.out.print(" "+e);
		}
	}
}
