package inheritance;

public class Account implements Cloneable{

	int money;
	int totalMoney;


	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Object clone(){ 
		Object obj = null;
		try{
			obj = super.clone(); 
		}
		catch(Exception e){}
		return obj; 
		}

	

}
