
public class ArrayInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[5];// // ���̰� 5�� 1���� �迭�� ����
		
		int[] ar2 = new int[7]; // ���̰� 7�� 1�����迭�� ����
		
		// �迭�� ���������� �ν��Ͻ� ���� �и� 
		float[] ar3;
		ar3 = new float[5];
		
		System.out.println(ar1.hashCode());
		System.out.println("�迭�� ���� : "+ar2.length);
		System.out.println(ar3.getClass());
	}

}
