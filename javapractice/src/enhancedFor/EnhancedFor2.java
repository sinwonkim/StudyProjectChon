package enhancedFor;

public class EnhancedFor2 {
	
	private String contents;
	private int boxNum;
	
	EnhancedFor2(int num, String cont){
		this.contents = cont;
		this.boxNum = num;
	}
	public static void main(String[] args) {
		EnhancedFor2[] ar = new EnhancedFor2[5];
		ar[0] = new EnhancedFor2(3,"sorry");
		ar[1] = new EnhancedFor2(4,"metoo");
		
		for(EnhancedFor2 e : ar ) {
			System.out.println(e);
		}
	}
}
