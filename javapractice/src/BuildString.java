
public class BuildString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stubf = new StringBuilder("123");
		stubf.append(45678); // ���ڿ� �� ���̱�
		
		System.out.println(stubf.toString());
		
		stubf.delete(0, 2);
		System.out.println(stubf);
		stubf.reverse();
		System.out.println(stubf);
	}

}
