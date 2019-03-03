package inheritance;

public class MainClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightClass rightClass = new RightClass("sinwon", "28");
		Arrow arrow = new Arrow();
		arrow.sinwon(rightClass);
		
		System.out.println(rightClass.age);
		
	}

}
