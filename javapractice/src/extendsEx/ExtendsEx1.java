package extendsEx;

public class ExtendsEx1 {
	String arrow;
	int holly;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExtendsEx1();
	}

	ExtendsEx1(){
		this("cccc");
	}
	ExtendsEx1(String arrow) {
		this("why",20);
		this.arrow = arrow;
		System.out.println(this.arrow);
	}
	ExtendsEx1(String arrow,int holly) {
		this.arrow = arrow;
		this.holly = holly ;
		System.out.println(arrow+holly);
	}
	
}
