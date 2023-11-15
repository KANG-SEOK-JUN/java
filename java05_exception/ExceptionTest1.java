package java05_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {

	}
	
	public void start()	{
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요?=");
		int won = scan.nextInt();
		
		int money[] = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		for(int i=0; i<money.length;i++) {
			//화폐수 구하기
			int cnt = won /money[i];	//5
			//화폐수가 0보다 크면 출력
			if(cnt>0)	{
				System.out.print(money[i]+"원="+cnt);			
			}
		}
		/*
Scanner scan = new Scanner(System.in);
	try {// try영역 : 예외가 발생가능한 코드, 또는 예외발생 가능성이 없는 코드를 함께 기술할 수 있다.
		System.out.print("첫번째 수 =");
		int num1 = scan.nextInt();
		System.out.print("두번째 수 =");
		int num2 = scan.nextInt();
		
		int hap = num1 +num2;
		int cha = num1 -num2;
		int mul = num1 *num2;
		int div = num1 /num2;

		//			5 + 10 =15
		//			printf(String format,Object... args)
		//pc는 숫자를 0으로 나누면 에러
		System.out.printf("%-5d + %-5d = %7.2f\n", num1, num2, (double)hap);
		System.out.printf("%d - %d = %d\n", num1, num2, cha);
		System.out.printf("%d * %d = %d\n", num1, num2, mul);
		System.out.printf("%d / %d = %d\n", num1, num2, div);

	
		//int[] data = {10,20,30};
		//System.out.println("배열 ->"+data[data.length]);
		
	}catch(InputMismatchException e) {// try 영역에서 예외가 발생하면 해당 catch로 이동한다.
		System.out.println("숫자를 입력하세요.");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}catch(ArithmeticException ae)	{
		System.out.println("두 번째 값은 0을 입력하지 마세요.");
		ae.printStackTrace();
		System.out.println(ae.getMessage());
	}catch(ArrayIndexOutOfBoundsException aioe) {
		System.out.println(aioe.getMessage());
	}finally{
		
		System.out.print("금액을 입력하세요?=");
		int won = scan.nextInt();
		
		int money[] = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		for(int i=0; i<money.length;i++) {
			//화폐수 구하기
			int cnt = won /money[i];	//5
			//화폐수가 0보다 크면 출력
			if(cnt>0)	{
				System.out.print(money[i]+"원="+cnt);
				

			}
		}
	}*/
		
}
	

	public static void main(String[] args) {
		//두 수를 입력받아 합,차,곱,몫을 구하는 프로그램을 작성하라.
		new ExceptionTest1().start();
		
		
	}
	

}
