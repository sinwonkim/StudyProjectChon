package stack;

import javax.xml.soap.Node;
/*Stack 스택이란 자료구조는 사전적 정의인 쌓다''더미'와 같다.먼저 들어온 물건은 나중에 나갈 수 있고, 나중에 들어온 물건은
 * 먼저 나갈 수 있게 된다. 이러한 구조를 선입후출 , 후입선출 이라고 한다. 모든 자료구조는 [삽입],[삭제],[읽기]를 기본으로 가진다. 
*  
*/ 
public class Stack { // Stack 클래스를 만들었다.
	private Node top; // top노드를 설정해준다.
	
	private class Node{ // 내부 클래스를 만든다.
		private String data;
		private Node nextNode;
		
		Node(String data) { // 노드의 생성자
			this.data = data;
			this.nextNode = null;
		}
	}
	boolean empty() { // 현재 top이 비어있는 상태라면 empty()는 true를 반환하다.
		return (top == null); 
	}
	void push(String data) {
		   Node Temp = new Node(""); // 임시 노드이다.
		   Node  New = new Node(data); // 새로운 값이 들어간 노드이다.
		   if(empty()) // 현재 데이터가 비어있다면 top 자리에 들어간다.
			top = New;
		   else { // 현재 데이터가 비어있지 않다면 top 자리에 새로운 값이 들어오고 한칸씩 뒤로 밀려남 
			Temp = top;
			top = New;
		   	top.nextNode = Temp;
		   }
	}
	int pop() { // top의 자리에서부터 하나씩 노드를 꺼낸다.
		if(empty()) { // 현재 아무런 데이터가 들어있지 않으면 pop()이 실행되어선 안된다.
			System.out.println("비어있음");
			return 0;
		
		}else { // 현재데이터가 들어있으면 그냥 top의 바로 밑의 노드가 top이 되면 간단 
		String Item = top.data;
		top = top.nextNode;
		return Integer.parseInt(Item);
		}
	}
	
	void printStack() { // 현재 가지고 있는 모든 노드의 값들을 나열한다.
		Node Temp = new Node(""); // 임시 스택을 만든다.
		Temp = top;
		if(empty()) {
			System.out.println("비어 있음");
		} else {
		  while (!empty()) {
		  System.out.println(pop() + ""); 
		}
	  }
		System.out.println();
		top = Temp; // top을 다 pop()해버렸으므로 다시 원래대로 돌려놓는 작업
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
