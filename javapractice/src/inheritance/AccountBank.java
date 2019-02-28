package inheritance;

public class AccountBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account  aAccount = new Account();
		
		aAccount.setMoney(500);
		System.out.println("객체 생성후 Money : "+aAccount.money);
		Account  bAccount = new Account();
		System.out.println("new 사용 했을시 Money : "+bAccount.money);
		Account bAccount1 = (Account)aAccount.clone();
		System.out.println("clone 사용 했을시 Money : "+bAccount1.money);
	}

}
