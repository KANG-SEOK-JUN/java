import java.util.Calendar;
import java.util.Scanner;
import java.lang.String;//자동 import


public class ClassTest01 {
	//멤버 변수 (필드) - 현재 클래스 내에서는 사용 가능한 전역변수		다른데에서도 사용 가능
	//멤버 변수는 초기값이 자동으로 설정된다.	// 지역변수는 초기값이 자동으로 설정되지 않음.
	//	정수(byte, short, int , long)은 0, 실수(float, double)은 0.0, 논리(boolean)은 false
	//	배열, 클래스(객체형)은 null;
	
	//제한자 안적으면 default
	int num;//0
	String userid;	//null
	Calendar now;	//null
	int[] arr;	//null
	
	int dataNum = 1234;
	String myName = "이순신";
	Scanner scan = new Scanner(System.in);	//클래스형 변수도 선언 가능.
	String name = "세종대왕";
	
	static	{
		//멤버 영역에서 실행문을 구현할 때 static{}를 이용하여 기술할 수 있다.
		System.out.println("멤버영역에서 실행함......");
	}

	
	//메소드 : 기능 구현 - 변수 선언, 계산, 기본명령어(if, switch, for, while...기술)
	//1. 생성자 메소드
	//	- 객체 생성 시 1번 실행. new 생성자(). 객체의 초기값을 설정할 때 사용한다.
	//	- 메소드명이 클래스 명과 같아야 한다.
	//	- 반환형이 없다.
	// 	- 생성자 메소드는 여러개 만들 수 있다.	단 매개 변수의 갯수나 데이터 형이 달라야 한다.
	//	- 생성자 메소드를 만들지 않을 경우 컴파일러(javac.exe)가 매개변수 없는 생성자를 자동으로 클래스에 넣어준다.
	//	- ClassTest01()	{} - 매개변수가 없는 생성자가 자동으로 들어감.
	
	public ClassTest01(){
		//실행문;
		System.out.println("ClassTest01() 생성자 메소드 실행 확인...");
	}
	
	public ClassTest01(int num){
		int data = 500;	//data는 생성자 메소드의 지역 변수 생성자가 끝나면 자동 삭제.
		System.out.println("ClassTest01(int num) 생성자 메소드 실행 확인..." + num);
	}
	
	public ClassTest01(String name){
		System.out.println("ClassTest01(String name) 생성자 메소드 실행 확인..." + name);
	}
	
	public ClassTest01(int num, String name){
		//멤버 있는 변수에 지역변수값 설정하기
		//this는 메소드의 지역변수와 멤버변수가 같은 변수명일 때 멤버 변수를 지정하는 키워드로 사용한다.
		
		this.num = num;
		System.out.println("ClassTest01(int num, String name) "
				+ "생성자 메소드 실행 확인..."
				+ num + ", " + name + ", " + this.num+", "+myName);//this.num = 멤버 변수의 num
	}//생성자 메소드와 멤버 변수에 같은 명의 변수가 있을 때 멤버 변수를 사용하고 싶은면 this 사용
	// 	2. 메소드 : 기능 구현
	//		- 필요한 만큼 생성 가능
	//		- public 반환형 메소드명(arg1,arg2....)	{}
	//		- 반환형은 메소드를 실행한 결과를 메소드 밖으로 내보내는 것이다.
	//		- 반환형이 void인 경우 반환값이 없다.
	
	//		- 메소드 생성 규칙
	//		- 소문자로 시작, 두번째 단어는 첫번째 문자를 대문자, ()가 있다.
	
	public void method1()	{
		int a =100;
		int b =200;
		int c = a + b;
		System.out.println("c=" +c);
	}
	public String method2 (int a, int b) {
		int c = a+b;
		return "c= "+c;
	}
	
	public String	getMyName() {
		//같은 클래스에 다른 메소드 호출
		method1();
		
		return myName;
	}
}
/*
 public final class Integer{
 	public static final int MAX_VALUE = 21억...;
  }
  
 */
