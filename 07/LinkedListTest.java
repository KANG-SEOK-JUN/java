import java.util.Calendar;
import java.util.LinkedList;

public class LinkedListTest {
	public static int count =1;
	//번호표를 뽑으면 PersionDTO객체를 만들어 Queue에 추가한다.
	public static LinkedList watingList = new LinkedList();
	
	//Geust in - 번호표 뽑을 때
	public void inGuest()	{
		// PersionDTO 객체를 만들어
		PersionDTO persion = new PersionDTO();
		// 1. num의 dto추가 num은 1증가
		persion.setNum(count++);
		// 2. 현재 날짜와 시간을 dto 객체에 추가
		persion.setDateTime(Calendar.getInstance());
		// 3. 대기인수 : 컬렉션 watingList의 크기를 구하여, watingcount에 셋팅
		persion.setWatingCount(watingList.size());
		// 4. 출력
		System.out.println(persion.toString());
		System.out.println("=============================");
		
		//대기열에 추가
		watingList.offer(persion);
	}
	
	//Geust Out- 차례가 되었을 때
	public void outGuest()	{
		//제일 앞 객체 꺼내고 지워짐
		watingList.poll();
		System.out.println("남은 객체 수 --->"+(watingList.size()-1));
	}
}

