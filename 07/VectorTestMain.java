import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTestMain {

	public VectorTestMain() {
	}

	public void start()	{
		VectorTest vt = new VectorTest();
		//vt.getData();
		Vector vec = vt.getData();

		//백터의 객체 가져오기
		String name = (String) vec.get(0);
		Random ran = (Random)vec.get(1);
		int age = (int)vec.get(2);
		Calendar cal = (Calendar)vec.get(3);
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DAY_OF_MONTH);
		MemberDTO mem = (MemberDTO)vec.get(4);
		
		System.out.println("name ->"+name);
		System.out.println("난수 ->"+ran.nextInt(100));
		System.out.println("나이 ->"+age);
		System.out.printf("날짜 => %d-%d-%d\n",y,m,d);
		System.out.println(mem.toString());
		
		System.out.println(vec.size());
		vec.remove(3);
		vec.remove("세종대왕");
		System.out.println(vec.size());
	}
	public static void main(String[] args) {
		new VectorTestMain().start();

	}

}
