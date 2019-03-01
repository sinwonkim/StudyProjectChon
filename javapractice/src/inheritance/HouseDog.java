package inheritance;

public class HouseDog extends Dog {
	public void sleep() { 
		System.out.println(this.name+" zzzz in house");
	}
	public void sleep(int hour) { // �޼ҵ� �����ε� = >  �߰��� 
		System.out.println(this.name+" zzzz in house "+hour + "hours " );
	}
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // sleep() �޼ҵ� ȣ��
		houseDog.sleep(3); // sleep(int hour) �޼ҵ� ȣ��
	}
}
/* �޼ҵ� �������̵�(Mtthod Overriding)
 * �̹����� DogŬ������ �� �� ��üȭ ��Ű�� HouseDog Ŭ������ ����� ������.
 * HoustDog Ŭ������ Dog Ŭ������ ����Ͽ� ������ ���� ���� �� �ִ�.
 * 
 * public class 
 * HouseDog Ŭ������ DogŬ������ ������ ����(������� ����)�� sleep �޼ҵ带 �����Ϸ���
 * HouseDog Ŭ������ sleep �޼ҵ尡 DogŬ���� sleep �޼ҵ庸�� �� ���� �켱������ ���� �Ǿ�
 * HouseDog Ŭ������ sleep�޼ҵ尡 ȣ��ǰ� �ȴ�.
 * 
 * �̷��� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ ������ ���·� �Ǵٽ� �����ϴ� ������
 * �޼ҵ� �������̵��̶�� �Ѵ�. *�޼ҵ� ����� 
 * 
 * �޼ҵ� �����ε�(method overloading)
 * �̹����� HouseDog Ŭ������ ������ ���� �޼ҵ带 �߰��غ���. ("����"�� �ƴ϶� "�߰�"�ӿ� ��������)
 * 
 * ���߻�� 
 * ���� ����� Ŭ������ ���ÿ� �ϳ� �̻��� Ŭ������ ��ӹ޴� ���� ���Ѵ�. 
 */
