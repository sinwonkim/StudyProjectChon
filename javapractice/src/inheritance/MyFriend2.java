package inheritance;

class Friend {
	protected String name; // �̸�
	protected String phone; // ����
	
	public Friend(String na, String ph){
		this.name = na;
		this.phone = ph;
	}
	
	public void showInfo() { // �̸��� ��ȭ��ȣ�� �����ִ� �޼ҵ�
		System.out.println("�̸� :"+ name);
		System.out.println("��ȭ : "+ phone);
	}
}
class UnivFriend extends Friend {
	private String major;
	public UnivFriend(String na, String ma, String ph) {
		super(na,ph);
		this.major = ma;
	}
	public void showInfo() {
		super.showInfo(); // �θ�Ŭ������ showInfo�޼ҵ� ȣ�� 
		System.out.println("����: "+ major);
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
		System.out.println("�μ� : "+ department);
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
		
		//��� ��â �� ������ ���� ��ü ���
		for(int i = 0; i < cnt; i++) {
			frns[i].showInfo(); // �������̵� �� �޼ҵ尡 ȣ��ȴ�.
		}
		
	}

}
