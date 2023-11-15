
public class Variable {

	public static void main(String[] args) {
		// 데이터형
		// 정수(byte, short, int[기본데이터 타입], long)
		// 국어점수 0~100점
		byte kor = 97; // 자동 형변환
		byte eng = (byte) 130; // byte형으로 변환 , 강제 형변환
		// System = 클래스 명 / out = 변수 println()= 메소드 명
		System.out.println("kor=" + kor);
		System.out.println("eng=" + eng);

		int data = kor;
		byte mat = (byte) data;

		long data2 = 215254252599L;

		// 실수 : float, Double(실수형의 기본 데이터)

		double n1 = 15.8;
		float n2 = (float) 15.3;

		// 정수 < 실수
		int data3 = (int) n1; // 실수형을 정수형으로 형변환 시 자동으로 소숫점 값을 버림.
		System.out.println("data3 = " + data3);

		boolean boo = true;

		// 문자형 - 1글자를 저장할 수 있다. 문자열 - 1글자 이상
		char c1 = 'A';
		String name = "홍길동"; // String는 특수 클래스임.

		c1++;
		System.out.println("c1 = " + c1);// B-> 66
		// char + int => int

		c1 = (char) (c1 + 1); // 'B' + 1 ->char + int = int =67 -> (char)67 => C
		// int + double => double
		int result = (int) (data3 + n1); // 15 + 15.8 = 30

		System.out.println(c1 + ", " + result); // c,30

		char c2 = 'B';
		int result2 = c1 + c2;// 67+66
		System.out.println("result2 = " + result2);

		int data4 = 0;
		System.out.println(data4);

		int a = 10 / 3;	// int /int = int -> 3.33333 = 3
		double b = 10 / 3.0;	//int / double = double -> 3.333333
		
		System.out.println(a);
		System.out.println(b);
	}

}
