import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7); // �迭 ar1�� 7�� �ʱ�ȭ 
		for(int i =0; i < ar1.length; i++) {
			System.out.print(ar1[i]);
		}
	}

}
