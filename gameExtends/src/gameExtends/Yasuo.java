package gameExtends;

public class Yasuo extends CreateCharactor{

	public Yasuo(String name) {
		super(name);
		
	}
	
	public void Basic(CreateCharactor create ) {
		System.out.println("����� ���� �߽��ϴ�.!!");
		System.out.println("�� �ڡ� �ڡڽ�ų�� ��� �� �� �ֽ��ϴ�. �� �� �� �� ��");
		create.job = "����";
		create.level = 1;
		create.att +=3;
		create.mp += 5;
		create.checkUpgrade = 1;
	}
	
	public void skill(CreateCharactor create) {
		create.skillDamage +=1;
		create.skillMp = 1;
	}

}
