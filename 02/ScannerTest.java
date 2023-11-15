// 사용할 클래스가 있는 위치와 클래스 명
import java.lang.String;	//기본 패키지 -> 컴파일할 때 자동으로 표기된다.
import java.util.Scanner;	// 자동으로 들어가지 않음.

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner : 실행 중 콘솔에서 정수, 실수, 논리, 문자열 데이터를 입력받는 기능을 가진다.
		
		//1. 객체 : 클래스를 사용하기 위해서는 객체를 생성 ->class의 생성자 메소드로 new 라는 키워드를 이용하여 만든다.
		// int a = 10;
		String name;
		// instance 변수, reference 변수 = scan 
		Scanner scan = new Scanner(System.in);
		//Scanner(인스턴스 instance)라는 데이터 타입의 변수 scan
		//new = 키워드
		//()가 붙으면 메소드 / 생성자 메소드 / 
		
		//프로그램 실행 중 값을 입력받기
		//1. 정수
		//객체명.메소드명
		System.out.println("숫자 입력 = ");
		int num = scan.nextInt();
		//정수 :nextByte(), nextShort(), nextInt(), nextLong()
		//실수 :nextfloat(), nextDouble()
		
		
	}

}
