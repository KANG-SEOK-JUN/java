import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// switch문 : 범위가 없는 조건문
		// 임의의 정수를 입력받아 1-> 빨강, 2-> 노랑, 3->파랑, 4->초록, 나머지->검정
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("정수 =");
		int inData = scan.nextInt();
		
		//int 보다 작거나 같은 데이터의 변수(byte, short, int, char), String
		switch(inData)	{
		case 1:
			System.out.print("빨강");
			break;
		case 2:
			System.out.print("노랑");
			break;
		case 3:
			System.out.print("파랑");
			break;
		case 4:
			System.out.print("초록");
			break;
		default:	
			System.out.print("검정");
		}

	}


}
