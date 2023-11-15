import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//임의의 수를 입력받아 양수면 100을 곱하여 출력하라.
		System.out.print("정수입력=");
		int n = scan.nextInt();	//main 안의 지역 변수
		int result=0;
		
		if (n>0) {	// 조건식이 참일 때 실행된다.
			result = n *100;
			System.out.println(n + "* 100 =" +result );//result = if문 안의 지역 변수 if 문 밖에서는 사용 불가능. 
														// result를 외부에서 사용하기 위해서는 main문에서 result를 선언
		}
		
		System.out.println("The End......"+n + " ,result->" +result);
	}
}
