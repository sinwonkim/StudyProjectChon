
public class ArrayInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[5];// // 길이가 5인 1차원 배열의 생성
		
		int[] ar2 = new int[7]; // 길이가 7인 1ㅊ원배열의 생성
		
		// 배열의 참조변수와 인스턴스 생성 분리 
		float[] ar3;
		ar3 = new float[5];
		
		System.out.println(ar1.hashCode());
		System.out.println("배열의 길이 : "+ar2.length);
		System.out.println(ar3.getClass());
	}

}
