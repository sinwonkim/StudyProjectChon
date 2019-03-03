package methodOverloadingEx;

public class ThisEx {
	private int data;
	
	ThisEx(int data) { // 여기서 매개변수 data는 data
		this.data = data; // 매개변수data값을 인스턴스 변수 data에 저장 하려면 this키워드를 사용해서 구분 지을 수 있음
	}
	void setData(int data) {
		this.data = data;
	}
	
	int getData() {
		return this.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx thisEx = new ThisEx(90);
		System.out.println(thisEx.getData());
		
		thisEx.setData(100);
		System.out.println(thisEx.getData());
	}

}
