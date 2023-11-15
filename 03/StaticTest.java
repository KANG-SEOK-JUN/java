
public class StaticTest {
	//static
	// 멤버 변수, 메소드에 static를 사용.
	//멤버변수에 static은 데이터형 왼쪽에 기술하고
	//멤버 변수를 접근할 떄 객체를 생성하지 않고, 클래스명, 멤버변수로 접근이 가능.
	
	//공통 변수 (싱글톤?)
	
	int num =10;
	String name ="홍길동";
	static String local = "강남구";
	
	public StaticTest()	{}
	
	//메소드에 정의되는 static 만들기
	//객체를 만들지 않고 호출하여 사용할 수 있다.
	public static void testMethod()	{
		int a =500;
		//							같은 클래스 static 변수이므로 클래스 명을 생략 가능하다.
		System.out.println("local" + local);
	}
	public void print()	{
		System.out.println("num="+ num);
	}
	
	public static void main(String[] args) {
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		st2.local ="영등포구";
		System.out.println("Str1->"+st1.local);
		System.out.println("Str3->"+st3.local);
		System.out.println(StaticTest.local);//클래스명.local의 형색으로 사용하는게 정확한 방식
		System.out.println("pi->"+Math.PI);
		
		st1.print();
		//testMethod()는 static 메소드 이므로 1개만 존재하고 클래스명.메소드명으로 호출할 수 이싿.
		StaticTest.testMethod();
	}

}

class Test01 {
	
}
class Test02
{
	
}