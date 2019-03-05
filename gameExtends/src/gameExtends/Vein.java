package gameExtends;

public class Vein extends CreateCharactor {

	public Vein(String name) {
		super(name);
	}
	
	public void Basic(CreateCharactor create) {
		System.out.println("베인으로 전직 했습니다.!!");
		System.out.println("스킬을 사용 할 수 있습니다.");
		create.job = "베인";
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
