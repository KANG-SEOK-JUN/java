import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public VectorTest() {

	}
	public Vector getData()	{
		//컬렉션은 객체를 저장하고 보관하는 기능 가진 자료구조처리를 해주는 것을 말한다.
		//컬렉션은 다양한 타입의 객체를 저장할 수도 있고, 하나의 타입(제네릭)저장할 수 있도록 설정할수도 있다.
		
		Vector vector = new Vector();
		
		String name ="홍길동";
		int age = 25;
		Calendar now = Calendar.getInstance();
		now.set(2020, 10-1, 11);
		Random random = new Random();
		MemberDTO mem = new MemberDTO("best","베스트","010-1234-5678");
		
		vector.add(name);//0
		vector.add(age);//1 -> 오토박싱 2 -- 지워짐
		vector.addElement(now);//2 3
		vector.add(1,random);//1
		vector.addElement(mem);;//4
		
		//index위치의 객체를 변환
		vector.set(2, 35);	// 2
		vector.setElementAt("세종대왕", 0);// 0
		
		System.out.println("capacity->"+ vector.capacity());
		return vector;
	}

}
