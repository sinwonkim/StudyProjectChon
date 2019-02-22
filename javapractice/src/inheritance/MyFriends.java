package inheritance;

class UnivFriend1 { // 대학 동창
	private String name; //이름
	private String major; //전공
	private String phone;//핸폰 
	
	public UnivFriend1(String name, String major, String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}
	
	public void showInforo() {
		System.out.println("이름"+ name);
		System.out.println("전공 "+major);
		System.out.println("핸폰"+phone);
	}	
}

class ComFriend1{ // 직장동료
	private String name; // 이름 
	private String department; //부서
	private String phone; // 폰
	
	public ComFriend1(String name, String department, String phone) {
	
		this.name = name;
		this.department = department;
		this.phone = phone;
	}
}

 public class MyFriends {
	 public static void main(String[] args) {
		 //대학 동창의 관리를 위한 배열과 변수 
		 UnivFriend1[] ufrns = new UnivFriend1[5];
		 int unct = 0;
		 
		 // 직장 동료의 관리를 위한 배열과 변수 
		 ComFriend1[] cfrns = new ComFriend1[5];
		 int cont = 0;
		 
		 //대학 동창의 정보 저장 
		 ufrns[unct++] = new UnivFriend1("Lee", "computer", "010-1234-3322"); // 대학동창 인스턴스를 만듬
		 ufrns[unct++] = new UnivFriend1("soori", "Electronics", "010-3322-5524");
		 
		 //직장 동료의 정보저장
		 cfrns[cont++] = new ComFriend1("Yoon", "R&D 1", "010-5232-3324");
		 cfrns[cont++] = new ComFriend1("PARK", "R&D 2", "010-2932-3424");
		 
		 //모든 동창 및 동료의 정보 전체 출력
		 for(int i = 0; i < unct; i++) {
			 ufrns[i].showInforo();
		 }
		 
		 
	 }
}
