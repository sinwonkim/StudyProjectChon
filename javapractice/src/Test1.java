
public class Test1 {
	public void sayNick(String a) {
		try {
			
		
		if("fool".equals(a)) {
			throw new FoolException(); // FoolException 경우 RuntimeException 클래스를 상속받음  RuntimeException은 발생할수도 발생안할수도 
		}
		}catch(FoolException e)  {
			System.out.println("FoolException이 발생했습니다.");
		}
		System.out.println("당신의 별명은"+a+" 입니다.");
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.sayNick("fool"); 

	}

}
