
public class ArrayInstance2 {

	public static void main(String[] args) {
		Box[] ar = new Box[5]; // ���̰� 5�� Box�� 1���� �迭�� ����   ar�� ����������. 
		                       // �̴� Box �ν��Ͻ� 5���� ������ �� �ִ� ���������� �迭�̴�.
		ar[0] = new Box("oh");
		ar[1] = new Box("oh3");
		ar[2] = new Box("oh2");
		for(int i = 0; i<3; i++) { // �� 2���� �ڵ带 �̿��ؼ� ��� ���ڿ��� �����ϴ� ���� �迭�� �ƴϸ� �Ұ����ϴ�.
			System.out.println(ar[i]);
		}		
	}
	
	

}
class Box {
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}
