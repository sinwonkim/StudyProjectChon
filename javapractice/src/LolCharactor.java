
public class LolCharactor {
	String name;
	int Hp;
	int mp;
	int gold;
	
	public LolCharactor(String name, int hp, int mp, int gold) {
		super();
		this.name = name;
		Hp = hp;
		this.mp = mp;
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "¿Ã∏ß : "+name+"Hp : "+Hp +"mp :" + mp + ", gold :" + gold;
	}
	
	
}
