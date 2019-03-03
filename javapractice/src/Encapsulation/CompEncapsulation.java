package Encapsulation;
class AllClass {
	A a	= new A();
	B b = new B();
	C c = new C();
	
	void take() {
		a.take(); b.take(); c.take();
	}
}
class A {
	void take() {
		System.out.println("코감기");
	}
}
class B {
	void take() {
		System.out.println("목감기");
	}
}
class C {
	void take() {
		System.out.println("몸살");
	}
}
public class CompEncapsulation {
	public static void main(String[] args) {
		AllClass allClass = new AllClass();
		allClass.take();
	}
}