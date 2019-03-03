import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7); // 배열 ar1을 7로 초기화 
		for(int i =0; i < ar1.length; i++) {
			System.out.print(ar1[i]);
		}
	}

}
