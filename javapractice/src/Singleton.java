
	class Singleton {
	private static Singleton one;
	int a;
	private Singleton() {
			
	}
	
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton(); 
		}
		return one;
		
	}
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		singleton1.a = 1;
		System.out.println(singleton2.a);
	}
}
