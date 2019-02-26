package stack;

import javax.xml.soap.Node;
/*Stack �����̶� �ڷᱸ���� ������ ������ �״�''����'�� ����.���� ���� ������ ���߿� ���� �� �ְ�, ���߿� ���� ������
 * ���� ���� �� �ְ� �ȴ�. �̷��� ������ �������� , ���Լ��� �̶�� �Ѵ�. ��� �ڷᱸ���� [����],[����],[�б�]�� �⺻���� ������. 
*  
*/ 
public class Stack { // Stack Ŭ������ �������.
	private Node top; // top��带 �������ش�.
	
	private class Node{ // ���� Ŭ������ �����.
		private String data;
		private Node nextNode;
		
		Node(String data) { // ����� ������
			this.data = data;
			this.nextNode = null;
		}
	}
	boolean empty() { // ���� top�� ����ִ� ���¶�� empty()�� true�� ��ȯ�ϴ�.
		return (top == null); 
	}
	void push(String data) {
		   Node Temp = new Node(""); // �ӽ� ����̴�.
		   Node  New = new Node(data); // ���ο� ���� �� ����̴�.
		   if(empty()) // ���� �����Ͱ� ����ִٸ� top �ڸ��� ����.
			top = New;
		   else { // ���� �����Ͱ� ������� �ʴٸ� top �ڸ��� ���ο� ���� ������ ��ĭ�� �ڷ� �з��� 
			Temp = top;
			top = New;
		   	top.nextNode = Temp;
		   }
	}
	int pop() { // top�� �ڸ��������� �ϳ��� ��带 ������.
		if(empty()) { // ���� �ƹ��� �����Ͱ� ������� ������ pop()�� ����Ǿ �ȵȴ�.
			System.out.println("�������");
			return 0;
		
		}else { // ���絥���Ͱ� ��������� �׳� top�� �ٷ� ���� ��尡 top�� �Ǹ� ���� 
		String Item = top.data;
		top = top.nextNode;
		return Integer.parseInt(Item);
		}
	}
	
	void printStack() { // ���� ������ �ִ� ��� ����� ������ �����Ѵ�.
		Node Temp = new Node(""); // �ӽ� ������ �����.
		Temp = top;
		if(empty()) {
			System.out.println("��� ����");
		} else {
		  while (!empty()) {
		  System.out.println(pop() + ""); 
		}
	  }
		System.out.println();
		top = Temp; // top�� �� pop()�ع������Ƿ� �ٽ� ������� �������� �۾�
	}
	
	
	public static void main(String[] args) {
		Stack st1 = new Stack();
		st1.pop();
		st1.push("2");
		st1.push("4");
		st1.push("6");
		st1.push("8");
		st1.push("10");
		st1.printStack();
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		st1.push("1");
		st1.printStack();
	}

}
