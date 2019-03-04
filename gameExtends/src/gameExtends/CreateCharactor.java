package gameExtends;


public class CreateCharactor extends CharactorStats {
	public String job = "���谡";
	
	public int level = 1;
	int att = 1;
	int skillDamage = 1;
	public int totalExp = 0; 
	public int needExp = 10;
	public int totalMoney = 0;
	
		
	public CreateCharactor(String name) {
		this.name = name;
	}
	
	// ���� �޼ҵ� 
	public void levelUp(int exp) {
		totalExp += exp;
		while(totalExp>=needExp) {
			++level;
			att+=1;
			needExp+=90;
		}
	}
	
	// ���� �޼ҵ�
	public void attack(Monster monster) {
		monster.hp -= this.att;
		System.out.println("���� ����");
		this.totalMoney += monster.money; // MoneySteal 
	}

	// ����,�ü� ���� �ʱ�ȭ �޼ҵ�
	public void Basic(CreateCharactor create) {	
	}
	
	// ����,�ü� ��ų �޼ҵ�
	public void skill(Monster monster) {
		monster.hp -= this.att+skillDamage;
		mp = mp - skillMp;
		System.out.println("��ų ����");
	}
	
	//���� ȸ�� 
	public void recovery() {
		mp +=1;
		System.out.println("������ ȸ���Ǿ����ϴ�.");
	}
	
	public void run() {
		System.out.println("5���� ������ ȸ�� �˴ϴ�.");
		try {
			Thread.sleep(5000);
		}catch(Exception e ) {
			
		}
		recovery();
		
	}
	
}
