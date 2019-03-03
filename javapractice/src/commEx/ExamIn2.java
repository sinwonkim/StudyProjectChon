package commEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamIn2 {

	public static void main(String[] args) throws IOException { // 값을 외부로부터 입력받는것이기 떄문에 무슨오류가 생길지 모름 오류가 생겼을떄 어떻게 처리하라는 
		// TODO Auto-generated method stub
		// 문자열을 입력해보자
		// 문자열을 입력하는 방법은 여러가지 있는데 
		
		// System.in.read(byte[]);
		
	/*	byte[] arr = new byte[10];
		System.out.print("문자열 입력 : ");
		System.in.read(arr); // 키보드로부터 입력받은 값을 byte형태로 arr에 저장 
		System.in.read();
		System.in.read();
		String str = new String(arr);
		System.out.println("문자열 출력 : " + str);*/
		
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력 :");
		String bufferestr = in.readLine();
		System.out.println("문자열 출력 :" + bufferestr );
		
		// Exception처리 
		// 값을 외부로부터 입력받는것이기 떄문에 어떤 오류가 생길지 모름 그러므로 오류가 생겼을 시에 어떻게 처리하라는 명력을 코딩해주어야함  
		// 떄문에 윗부분에 IOException을 써주는 것이다.
		// Excepton의 종류는 여러가지가 정의되어 있고 InputOutputException의 줄임말로써 입출력 관련 오류가 정의되어 있다.
		// 메소드안에 모든 코딩에 IOException 에 관련된 오류가나면 던져버려라(무시하라)는 뜻으로 쓰여있다.
		// 그럼 특정 한 부분만 묶어서 관리할 수는 없을까?
		
		try {
			in.readLine(); // try{내용}catch(오류정의){내용}으로 try{내용}에서 내용부분을 실행하다가 
			// catch(오류정의)에서 정의한 오류가 발생하면 catch(){내용}부분에 내용을 실행하도록 하는 문구
			// 한마디로 오류잡는 문구 나중에 디버그할떄 가장많이 쓰이는 문구이다.
			
		} catch(IOException e) {
			System.err.println(e); // 에러가 나면 catch{내용}부분이 실행됨 
		}
		
		// BufferedReader를 사용하면 문자열을 byte [] 라든가 new String()이라던가 그런걸 안써도 그대로 문자열을 저장할 수 있다. 편의를 제공하기위하여 
		// Class이다. 이밖에도 Scaaner 클래스도 있다 이건 util 패키지안에 있다 . BufferedReader로 생성한 객체  in 으로 readLine() 메소드를 호출하면 
		// 입력을 완료할떄까지 대기하다 엔터키를 누르고 완료하게되면 입력받은 내용을 알아서 문자열로 바꾸어 return 해준다. BufferedReader를 사용하면 좀더 빠르게 코딩 ok

		
	}

}
