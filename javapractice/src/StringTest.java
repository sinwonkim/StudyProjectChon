
public class StringTest {
	public static void main(String[] args) {
		LolCharactor[] lolCharactor = new LolCharactor[2];
		lolCharactor[0]  = new LolCharactor("vein", 20, 10, 5);
		lolCharactor[1]  = new LolCharactor("Yasuo",30, 5, 10);
		for(int i = 0; i < lolCharactor.length; i++) {
			System.out.println(lolCharactor[i]);
		}
	}
}
