package inheritance;

public class AccountBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account  aAccount = new Account();
		
		aAccount.setMoney(500);
		System.out.println("��ü ������ Money : "+aAccount.money);
		Account  bAccount = new Account();
		System.out.println("new ��� ������ Money : "+bAccount.money);
		Account bAccount1 = (Account)aAccount.clone();
		System.out.println("clone ��� ������ Money : "+bAccount1.money);
	}

}
