package commEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamIn2 {

	public static void main(String[] args) throws IOException { // ���� �ܺηκ��� �Է¹޴°��̱� ������ ���������� ������ �� ������ �������� ��� ó���϶�� 
		// TODO Auto-generated method stub
		// ���ڿ��� �Է��غ���
		// ���ڿ��� �Է��ϴ� ����� �������� �ִµ� 
		
		// System.in.read(byte[]);
		
	/*	byte[] arr = new byte[10];
		System.out.print("���ڿ� �Է� : ");
		System.in.read(arr); // Ű����κ��� �Է¹��� ���� byte���·� arr�� ���� 
		System.in.read();
		System.in.read();
		String str = new String(arr);
		System.out.println("���ڿ� ��� : " + str);*/
		
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ڿ� �Է� :");
		String bufferestr = in.readLine();
		System.out.println("���ڿ� ��� :" + bufferestr );
		
		// Exceptionó�� 
		// ���� �ܺηκ��� �Է¹޴°��̱� ������ � ������ ������ �� �׷��Ƿ� ������ ������ �ÿ� ��� ó���϶�� ����� �ڵ����־����  
		// ������ ���κп� IOException�� ���ִ� ���̴�.
		// Excepton�� ������ ���������� ���ǵǾ� �ְ� InputOutputException�� ���Ӹ��ν� ����� ���� ������ ���ǵǾ� �ִ�.
		// �޼ҵ�ȿ� ��� �ڵ��� IOException �� ���õ� ���������� ����������(�����϶�)�� ������ �����ִ�.
		// �׷� Ư�� �� �κи� ��� ������ ���� ������?
		
		try {
			in.readLine(); // try{����}catch(��������){����}���� try{����}���� ����κ��� �����ϴٰ� 
			// catch(��������)���� ������ ������ �߻��ϸ� catch(){����}�κп� ������ �����ϵ��� �ϴ� ����
			// �Ѹ���� ������� ���� ���߿� ������ҋ� ���帹�� ���̴� �����̴�.
			
		} catch(IOException e) {
			System.err.println(e); // ������ ���� catch{����}�κ��� ����� 
		}
		
		// BufferedReader�� ����ϸ� ���ڿ��� byte [] ��簡 new String()�̶���� �׷��� �Ƚᵵ �״�� ���ڿ��� ������ �� �ִ�. ���Ǹ� �����ϱ����Ͽ� 
		// Class�̴�. �̹ۿ��� Scaaner Ŭ������ �ִ� �̰� util ��Ű���ȿ� �ִ� . BufferedReader�� ������ ��ü  in ���� readLine() �޼ҵ带 ȣ���ϸ� 
		// �Է��� �Ϸ��ҋ����� ����ϴ� ����Ű�� ������ �Ϸ��ϰԵǸ� �Է¹��� ������ �˾Ƽ� ���ڿ��� �ٲپ� return ���ش�. BufferedReader�� ����ϸ� ���� ������ �ڵ� ok

		
	}

}
