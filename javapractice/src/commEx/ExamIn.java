package commEx;

import java.io.IOException;

public class ExamIn {

	public static void main(String[] args) throws IOException {
		// keyboard�� ���Ͽ� �Է��� �غ���.
		// System.in.read(); == �ƽ�Ű�ڵ� 
		
/*		System.out.print("�Է� : ");
		int anum = System.in.read();
		System.out.println("��� : " + anum);
		
		//����Ű�� ������ ���Ͱ��� �ԷµǱ� ������ �̰��� ������� �Ѵ�. 
		// ����Ű�� ������ �ƽ�Ű�ڵ� 13�� ���� �Է��� �ǰ� ������ �ɋ� 10���� �Է��� �Ǳ⋚����
		System.in.read();
		System.in.read(); */
		
		// System.in.read() -48 or '0'; == ����
		System.out.print(" �Է� : ");
		int num = System.in.read() - 48;
		// int num = System.in.read()-'0';
		System.out.println("��� : " + num);
		
		System.in.read();
		System.in.read();
		
		// (char)System.in.read(); == ���� 
		System.out.print("�Է� : ");
		char char_ = (char)System.in.read();
		// int num = System.in.read() - '0';
		System.out.println("��� : " + char_);
		
		
	}

}
