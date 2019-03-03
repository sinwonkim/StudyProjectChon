package inheritance;

class Friend {
	protected String name; // 이름
	protected String phone; // 핸폰
	
	public Friend(String na, String ph){
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo() { // 이름과 전화번호를 보여주는 메소드
		System.out.println("이름 :"+ name);
		System.out.println("전화 : "+ phone);
	}
}
class UnivFriend extends Friend {
	private String major;
	public UnivFriend(String na, String ma, String ph) {
		super(na,ph);
		this.major = ma;
	}
	public void showInfo() {
		super.showInfo(); // 부모클래스의 showInfo메소드 호출 
		System.out.println("전공: "+ major);
	}
}

class ComFriend extends Friend{
	
	private String department;
	
	public ComFriend(String na,String de, String ph) {
		super(na, ph);
		this.department = de;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : "+ department);
	}
	
}
public class MyFriend2 {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;
		
		frns[cnt++] = new UnivFriend("Lee","Computer","010-333-555");
		frns[cnt++] = new UnivFriend("SEO","Elctronics","010-222-4444");
		frns[cnt++] = new ComFriend("YOON","Electronics","02-123-999");
		frns[cnt++] = new ComFriend("Zinho", "R&D1", "02-123-999");
		
		//모든 동창 및 동료의 정보 전체 출력
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
		}
		
	}

}
