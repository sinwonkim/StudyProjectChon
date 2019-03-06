
interface Printable {
	void print(String s); // 매개변수 하나, 반환형 void
}

public class OneParamNoReturn {

	public static void main(String[] args) {
		Printable p; // 선언 
		p = (String s) -> {System.out.println(s); }; // 줄임 없는 표현
		p.print("Lambda exp one.");
		
		p.print("holly shit");
		
	}

}
