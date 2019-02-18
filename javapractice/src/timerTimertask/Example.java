package timerTimertask;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Example {
	static int normalCustomer;
	static int vipCustomer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("일반 고객은 1 , 우수 고객은 2를 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		
		String DistinguishCustomer	= scan.nextLine();
		if((DistinguishCustomer.equals("1"))){
			System.out.println("금액을 입력하세요  : ");
			 normalCustomer = scan.nextInt();
			
		}else if((DistinguishCustomer.equals("2"))) {
			System.out.println("금액을 입력하세요  : ");
			 vipCustomer = scan.nextInt();
		}
		NormalAccount normalAccount = new NormalAccount();
		
		
		Timer timer = new Timer();
		
		
	
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				normalAccount.setNormalTotal(normalCustomer);
				normalAccount.setVipTotal(vipCustomer);
				System.out.println("일반 고객의 이자는 : "+normalAccount.getNormalTotal()+"입니다.");
				System.out.println("우수 고객의 이자는 "+normalAccount.getVipTotal()+"입니다.");
			}
		};
		
	 timer.schedule(timerTask,3000,5000); // task,시작 딜레이,실행 시간 
	}

}

class NormalAccount {
	int normalTotal;
	int vipTotal;
	
	public int getNormalTotal() {
		return normalTotal;
	}
	public void setNormalTotal(int normalTotal) {
		this.normalTotal += normalTotal*2;
	}
	public int getVipTotal() {
		return vipTotal;
	}
	public void setVipTotal(int vipTotal) {
		this.vipTotal += vipTotal*3;
	}

		
}