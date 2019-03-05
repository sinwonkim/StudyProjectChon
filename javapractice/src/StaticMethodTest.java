import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticMethodTest {
	
	
	public static void main(String[] args ) {
	
	
		 SimpleDateFormat simple = new SimpleDateFormat("yyyyMMdd");
		 System.out.println(simple.format(new Date()));
		 System.out.println(new Date());
	}

}
