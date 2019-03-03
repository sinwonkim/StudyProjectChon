
public class ArrayInstance2 {

	public static void main(String[] args) {
		Box[] ar = new Box[5]; // 길이가 5인 Box형 1차원 배열의 생성   ar은 참조변수다. 
		                       // 이는 Box 인스턴스 5개를 저장할 수 있는 참조변수의 배열이다.
		ar[0] = new Box("oh");
		ar[1] = new Box("oh3");
		ar[2] = new Box("oh2");
		for(int i = 0; i<3; i++) { // 단 2줄을 코드를 이용해서 모든 문자열에 접근하는 것은 배열이 아니면 불가능하다.
			System.out.println(ar[i]);
		}		
	}
	
	

}
class Box {
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}
