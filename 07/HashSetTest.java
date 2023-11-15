import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	double data[] = {12.5, 56.3, 9.6, 41.2};
	public HashSetTest() {}
	
	public void start()	{
		//HashSet
		//Set 인터페이스를 상속 받고 있음.
		//저장 순서를 유지하지 않는다.
		//중복 데이터 허용안함.
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for (double d :data)	{
			hs.add(d);//hashset 객체 추가
		}
		//hashset객체 꺼내기
		Iterator<Double> i= hs.iterator();
		
		while (i.hasNext()) {//객체가 있으면 true 없으면 false가 리턴된다.
			double num = i.next();
			System.out.print(num+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		HashSetTest hst = new HashSetTest();
		hst.start();
	}

}
