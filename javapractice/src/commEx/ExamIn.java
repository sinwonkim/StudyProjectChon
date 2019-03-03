package commEx;

import java.io.IOException;

public class ExamIn {

	public static void main(String[] args) throws IOException {
		// keyboard를 통하여 입력을 해본다.
		// System.in.read(); == 아스키코드 
		
/*		System.out.print("입력 : ");
		int anum = System.in.read();
		System.out.println("출력 : " + anum);
		
		//엔터키를 눌러도 엔터값이 입력되기 떄문에 이값을 없애줘야 한다. 
		// 엔터키를 누를떄 아스키코드 13번 값이 입력이 되고 개행이 될떄 10번이 입력이 되기떄문에
		System.in.read();
		System.in.read(); */
		
		// System.in.read() -48 or '0'; == 숫자
		System.out.print(" 입력 : ");
		int num = System.in.read() - 48;
		// int num = System.in.read()-'0';
		System.out.println("출력 : " + num);
		
		System.in.read();
		System.in.read();
		
		// (char)System.in.read(); == 문자 
		System.out.print("입력 : ");
		char char_ = (char)System.in.read();
		// int num = System.in.read() - '0';
		System.out.println("출력 : " + char_);
		
		
	}

}
