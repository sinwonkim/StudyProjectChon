import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SLenComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
	
}

public class SLenComparator {
		
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //배열같은 경우 크기가 정해져 있음 // List 자료형은 인터페이스인데 
		list.add("robot");
		list.add("sow");
		list.add("box");
		Collections.sort(list, new SLenComp()); // Collections.sort 메소드를 호출하면서 두 번쨰 인자로 정렬의 기준을 갖고 있는 인스턴스를 생성해서 
												// 전달하고 있다. 인스턴스를 전달하는 형태이지만 내용을 보면 메소드, 즉 기능을 전달하는 것에 해당한다. 
		
		for(String s : list)
			System.out.println(s);
	}
}
