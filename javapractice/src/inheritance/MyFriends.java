package inheritance;

class UnivFriend1 { // ���� ��â
	private String name; //�̸�
	private String major; //����
	private String phone;//���� 
	
	public UnivFriend1(String name, String major, String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}
	
	public void showInforo() {
		System.out.println("�̸�"+ name);
		System.out.println("���� "+major);
		System.out.println("����"+phone);
	}	
}

class ComFriend1{ // ���嵿��
	private String name; // �̸� 
	private String department; //�μ�
	private String phone; // ��
	
	public ComFriend1(String name, String department, String phone) {
	
		this.name = name;
		this.department = department;
		this.phone = phone;
	}
}

 public class MyFriends {
	 public static void main(String[] args) {
		 //���� ��â�� ������ ���� �迭�� ���� 
		 UnivFriend1[] ufrns = new UnivFriend1[5];
		 int unct = 0;
		 
		 // ���� ������ ������ ���� �迭�� ���� 
		 ComFriend1[] cfrns = new ComFriend1[5];
		 int cont = 0;
		 
		 //���� ��â�� ���� ���� 
		 ufrns[unct++] = new UnivFriend1("Lee", "computer", "010-1234-3322"); // ���е�â �ν��Ͻ��� ����
		 ufrns[unct++] = new UnivFriend1("soori", "Electronics", "010-3322-5524");
		 
		 //���� ������ ��������
		 cfrns[cont++] = new ComFriend1("Yoon", "R&D 1", "010-5232-3324");
		 cfrns[cont++] = new ComFriend1("PARK", "R&D 2", "010-2932-3424");
		 
		 //��� ��â �� ������ ���� ��ü ���
		 for(int i = 0; i < unct; i++) {
			 ufrns[i].showInforo();
		 }
		 
		 
	 }
}
