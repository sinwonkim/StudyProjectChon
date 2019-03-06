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
		List<String> list = new ArrayList<>(); //�迭���� ��� ũ�Ⱑ ������ ���� // List �ڷ����� �������̽��ε� 
		list.add("robot");
		list.add("sow");
		list.add("box");
		Collections.sort(list, new SLenComp()); // Collections.sort �޼ҵ带 ȣ���ϸ鼭 �� ���� ���ڷ� ������ ������ ���� �ִ� �ν��Ͻ��� �����ؼ� 
												// �����ϰ� �ִ�. �ν��Ͻ��� �����ϴ� ���������� ������ ���� �޼ҵ�, �� ����� �����ϴ� �Ϳ� �ش��Ѵ�. 
		
		for(String s : list)
			System.out.println(s);
	}
}
