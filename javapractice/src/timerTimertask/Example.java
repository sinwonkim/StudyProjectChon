package timerTimertask;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Example {
	static int normalCustomer;
	static int vipCustomer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Ϲ� ���� 1 , ��� ���� 2�� �Է��� �ּ���.");
		Scanner scan = new Scanner(System.in);
		
		String DistinguishCustomer	= scan.nextLine();
		if((DistinguishCustomer.equals("1"))){
			System.out.println("�ݾ��� �Է��ϼ���  : ");
			 normalCustomer = scan.nextInt();
			
		}else if((DistinguishCustomer.equals("2"))) {
			System.out.println("�ݾ��� �Է��ϼ���  : ");
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
				System.out.println("�Ϲ� ���� ���ڴ� : "+normalAccount.getNormalTotal()+"�Դϴ�.");
				System.out.println("��� ���� ���ڴ� "+normalAccount.getVipTotal()+"�Դϴ�.");
			}
		};
		
	 timer.schedule(timerTask,3000,5000); // task,���� ������,���� �ð� 
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