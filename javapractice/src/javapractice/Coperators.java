package javapractice;

public class Coperators {

	public void operator(int num) {
		
		int count = 0;
		
		while((num) < 100 ) {
			if(((num % 5) != 0) || ((num % 7) != 0))	
			++count;	
			if(((num % 5) != 0) || ((num % 7) != 0))
			System.out.println(num); // 5�� 7�� ����� ��츸 ����
			System.out.println("count :"  +count);
			break;
			
			}
		
	}
}
