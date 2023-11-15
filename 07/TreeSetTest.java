import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest()	{}
	
	public void start()	{
		String[] data = {"자바","java","Java","스프링","spring","아작스","ajax","1234","spring","자바"};
		
		//TreeSet 컬렉션
		//저장 순서를 유지하지 않는다.
		//정렬된다.
		//중복허용 안함
		TreeSet<String> ts = new TreeSet<>();
		
		for (int i = 0; i<data.length;i++) {
			ts.add(data[i]);
		}
		System.out.println("객체수"+ts.size());
		
		//오름차순으로 정렬하여 Iterator객체로 리턴해준다.
		Iterator<String> li = ts.iterator();
		while (li.hasNext()) {
			System.out.print(li.next()+"\t");
		}
		System.out.println();
		
		//내림차순으로 정렬하여 Iterator객체로 리턴해준다.
		Iterator<String> iii = ts.descendingIterator();
		while (iii.hasNext()) {
			System.out.print(iii.next()+"\t");
		}
		System.out.println();
		
		String first = ts.first();
		System.out.println("first ->"+first);
	}
	public static void main(String[] args) {
		TreeSetTest tst = new TreeSetTest();
		tst.start();
	}

}
