package constructorEx;

public class HouseDog extends Dog {
	public HouseDog(String name) {
		this.setName(name);
	}
	public void sleep( ) {
		System.out.println(this.name+ " zzzz ");
	}
	
	public void sleep(int hour) { // �޼ҵ� �����ε�
		 System.out.println(this.name+ " zzzz is house for " + hour + " hours " );
	}
	
	public static void main(String[] args) {
		HouseDog dog = new HouseDog("happy");
		System.out.println(dog.name);
	}
}
/*name �̶�� ��ü ������ ���� ������ �����ؾ߸� ��ü�� ������ �� �ֵ��� ���� �� �� �ִ�
 * ����� ������?
 * 
 * ������Constructor�� �̿��ϸ� �ȴ�. 
 * �� �޼ҵ�ó�� �޼ҵ���� Ŭ������� �����ϰ� ���� �ڷ����� ���� �޼ҵ带 ������Constructor��� ���Ѵ�.
 * 
 * �������� ��Ģ 
 * 1.Ŭ������� �޼ҵ���� �����ϴ�.
 * 2.����Ÿ���� �������� �ʴ´�.
 * �����ڴ� ��ü�� ������ �� ȣ��ȴ�. ��ü�� ������ ���� new��� Ű����� ��ü�� ������� ���̴�.
 * ��, �����ڴ� ������ ���� new��� Ű���尡 ���� �� ȣ��ȴ�.
 * new Ŭ������(�Է��׸�,....)
 * �����ڴ� �޼ҵ�� ���������� �Է��� ���� �� �ִ�. 
 * 
 * �����ڴ� �޼ҵ�� ���������� �Է��� ���� �� �ִ�.
 * 
 * �츮�� ���� �����ڴ� ������ ���� �Է°����� ���ڿ��� �ʿ�� �ϴ� �������̴�.
 * 
 * ���� ������ ���� newŰ����� ��ü�� ���鋚 ���ڿ��� �����ؾ߸� �Ѵ�.
 * 
 * House Dog = new HouseDog("happy"); // ������ ȣ�� �� ���ڿ��� �����ؾ߸� �Ѵ�.
 * 
 */
 