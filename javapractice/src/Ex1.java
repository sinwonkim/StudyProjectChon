
public class Ex1 {

	public static void main(String[] args) {
		Runnable r = new ThreadClass();
		 Thread t = new Thread(r);
		 t.start();
		
	}

}
