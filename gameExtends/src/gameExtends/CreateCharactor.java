package gameExtends;


public class CreateCharactor extends CharactorStats {
	public String job = "모험가";
	
	public int level = 1;
	int att = 1;
	int skillDamage = 1;
	public int totalExp = 0; 
	public int needExp = 10;
	public int totalMoney = 0;
	
		
	public CreateCharactor(String name) {
		this.name = name;
	}
	
	// 레벨 메소드 
	public void levelUp(int exp) {
		totalExp += exp;
		while(totalExp>=needExp) {
			++level;
			att+=1;
			needExp+=90;
		}
	}
	
	// 공격 메소드
	public void attack(Monster monster) {
		monster.hp -= this.att;
		System.out.println("공격 성공");
		this.totalMoney += monster.money; // MoneySteal 
	}

	// 전사,궁수 스탯 초기화 메소드
	public void Basic(CreateCharactor create) {	
	}
	
	// 전사,궁수 스킬 메소드
	public void skill(Monster monster) {
		monster.hp -= this.att+skillDamage;
		mp = mp - skillMp;
		System.out.println("스킬 성공");
	}
	
	//마나 회복 
	public void recovery() {
		mp +=1;
		System.out.println("마나가 회복되었습니다.");
	}
	
	public void run() {
		System.out.println("5초후 마나가 회복 됩니다.");
		try {
			Thread.sleep(5000);
		}catch(Exception e ) {
			
		}
		recovery();
		
	}
	
}
