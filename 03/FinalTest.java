//class의 final 상속 안됨
public class FinalTest {
	//final 변수는 한번 값이 설정되면 변경할 수 없다.
	//final 변수는 대문자로 만든다. 단어의 구별은 _ 한다.
	
	final String COMPANY = "멀캠";	//final 변수 = 값 변경 x 사용만 가능. 
	private final String ADDRESS;
	static final String PHONE ="01-1234-5678";
	//final 변수는 값을 변경할 수 없다.
	
	
	public FinalTest()	{
		ADDRESS = "서울시 강남구";
		
	}
	
	//메소드의 final은 오버라이딩이 안됨.
	public final void infrormation()	{
		System.out.println("회사명 = "+COMPANY);
		System.out.println("주소 = "+ADDRESS);
	}
}
