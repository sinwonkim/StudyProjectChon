package gameExtends;

public class Vein extends CreateCharactor {

	public Vein(String name) {
		super(name);
	}
	
	public void Basic(CreateCharactor create) {
		System.out.println("�������� ���� �߽��ϴ�.!!");
		System.out.println("��ų�� ��� �� �� �ֽ��ϴ�.");
		create.job = "����";
		create.level = 1;
		create.att +=2;
		create.mp +=10;
		create.checkUpgrade = 1;
		
	}
	
	public void skill(CreateCharactor create) {
		create.skillDamage +=4;
		create.skillMp = 2;
	}

}
