package methodOverloadingEx;

public class ThisEx {
	private int data;
	
	ThisEx(int data) { // ���⼭ �Ű����� data�� data
		this.data = data; // �Ű�����data���� �ν��Ͻ� ���� data�� ���� �Ϸ��� thisŰ���带 ����ؼ� ���� ���� �� ����
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
