package java04_oop;

public class CCC extends BBB {
	int c=30+20;
	public CCC()	{}

	public int getData()	{//오버라이딩
		//상위 클래스의 getWelcome()메소드는 접근제한자가 private로 상속되지 않는다.
		//System.out.println(getWelcome());
		return c;	
		//return의 값을 b로 바꾸면 CCC클래스 내에 b가 없으므로 상위 클래스 BBB의 b를 사용
		
	
	}
}
