
interface Printable {
	void print(String s); // �Ű����� �ϳ�, ��ȯ�� void
}

public class OneParamNoReturn {

	public static void main(String[] args) {
		Printable p; // ���� 
		p = (String s) -> {System.out.println(s); }; // ���� ���� ǥ��
		p.print("Lambda exp one.");
		
		p.print("holly shit");
		
	}

}
