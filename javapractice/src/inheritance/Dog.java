package inheritance;

public class Dog extends Animal {
	public void sleep() {
		System.out.println(this.name+"zzzz");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("hoho"); // ���� ���θ��� �޼ҵ�ƴ� �θ� Ŭ����Animal ��ӹ޾Ƽ� ����Ҽ� ����
		System.out.println(dog.name);
		dog.sleep();
	}
	
}
/* ���� DogŬ������ AnimalŬ������ ����ϰ� �Ǿ���.
 * Dog Ŭ������ name�̶�� ��ü������ setName�̶�� �޼ҵ带 ������ �ʾ�����
 * Animal Ŭ������ ����� �޾ұ� ������ �״�� ����� �����ϴ�. 
 * ���� DogŬ������ AniamlŬ�������� �� �� �������(Sleep�޼ҵ尡 �߰��Ǿ���)������ �Ǿ���.
 * �̷��� ���� �θ� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �θ� Ŭ������ ��ɿ� ���Ͽ� �� �� ��������� 
 * ������ �����Ѵ�. 
 * 
 * IS-A ����
 * Dog Ŭ������ AnimalŬ������ ��ӹ޾Ҵ�. ��,Dog�� Aniaml�� ���� �����̶�� �� �� �ְڴ�.
 * �̷� ��� Dog�� Aniaml �� ���ԵǱ� ������ ���� �����̴� ��� ǥ���� �� �ִ�. 
 * �ڹٴ� �̷��� ���踦 IS-A ������ ǥ���Ѵ� ��"Doig is a Aniaml"�� ���� ���� �� �ִ� ���踦 IS-A������� �Ѵ�.
 * �̷��� IS-A ����(��Ӱ���)�� ������ �ڽ� ��ü�� �θ� Ŭ������ �ڷ����� ��ó�� ����� �� �ִ�. 
 * ��, ������ ���� �ڵ��� �����ϴ�. 
 * Animal dog = new Dog(); // Dog�� AnimalŬ������ �ڽ�Ŭ�����̴�.
 * 
 * ������ �� �ݴ��� ���, �� �θ� Ŭ������ ������� ��ü�� �ڽ� Ŭ������ �ڷ������δ� ����� �� ����.
 * Dog dog = new Animal(); // ������ ���� : �θ� Ŭ������ ���� ��ü�� �ڽ� Ŭ������ �ڷ������� ����� �� ����.
 *  Animal dog = new Dog();
 *  �� �ڵ带 �о�� "���� ���� ��ü�� ���� �ڷ����̴�"��� ���� �� �ֵ�.
 *  
 *  Dog dog = new Animal();
 *  
 *  ���� ���������� �о�� " ������ ���� ��ü�� �� �ڷ����̴�."�� ���� �� �������̴�. �ٵ� ���� �� �̻����� ������? ������ ���� 
 *  ��ü�� "��"�ڷ��� ���� "ȣ����" �ڷ��� �Ǵ� "����"�ڷ����� ���� ���� ���� ������?
 *  �ڹٿ��� ����� ��� Ŭ������ object��� Ŭ������ ��ӹް� �Ǿ� �ִ�. ��� �츮�� Aniaml Ŭ������ ������ ��������� ������ �����ϴ�.
 *  ������ ���� �Ʒ� �ڵ�ó�� ObjectŬ������ ����ϵ��� �ڵ����� �ʾƵ� �ڹٿ��� ��������� ��� Ŭ������ ObjectŬ������ �ڵ����� 
 *  ��ӹްԲ� �Ǿ� �ִ�.
 *  public class Animal extends Object {
 *   	String name // ��ü���� = ������� 
 *   
 *   public void setName(String name) {
 *   this.name = name; 
 *   }
 *  }
 *  ���� �ڹٿ��� ����� ��� ��ü�� Object �ڷ������� ����� �� �ִ�. ��,������ ���� �ڵ��ϴ� ���� �����ϴ�.
 *  Object animal = new Animal();
 *  Object dog = new Dog();
 */