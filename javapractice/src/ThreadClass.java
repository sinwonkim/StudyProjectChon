
public class ThreadClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int result = 1;
		for(int i=1; i<=50; i++) {
			result +=i;		
		}
		System.out.println("1부터 50까지의 합은 :"+result);
	}

}
