package gameExtends;

public class Yasuo extends CreateCharactor{

	public Yasuo(String name) {
		super(name);
		
	}
	
	public void Basic(CreateCharactor create ) {
		System.out.println("전사로 전직 했습니다.!!");
		System.out.println("★ ★★ ★★스킬을 사용 할 수 있습니다. ★ ★ ★ ★ ★");
		create.job = "전사";
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
