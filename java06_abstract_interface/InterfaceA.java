package java06_abstract_interface;

// interface에는 static final 상수가 들어올 수 있음.
// 추상 메소드가 들어올 수 있음.
// 인터페이스는 추상 메소드들 클래스를 모아두는 클래스
public interface InterfaceA extends InterfaceB {
	//상수
	public static final int MAX =100;
	public static final String FIRST_NAME ="LEE";
	
	//추상메소드
	public int hap (int x, int y);
	public int cha (int x, int y);
	public int gob (int x, int y);
	public int mok (int x, int y);
	
	/* 인터페이스는 추상메소드와 static final 상수를 저장함
	public int test(int a) {
		System.out.println("fff");
		return a;
	}*/
}
