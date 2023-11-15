import java.util.Scanner;

public class Ex07While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true)	{
			System.out.print("양의 정수=");
			int max =scan.nextInt();
			int sum =0;
			for (int i=1; i<=max;i++)	{
				sum +=i;
			}
			System.out.print("1~"+max+"까지의 합은 "+ sum);
			
			System.out.print("계속하시겠습니까(1:예, 그외:아니요)?");
			int que = scan.nextInt();
			if(que!=1) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			

		}
		/*
		int start = 1;
		int sum=0;
		while(start==1) {
		System.out.print("양의 정수=");
		int max = scan.nextInt();
		
		for(int i=1;i<=max;i++) {
			sum+=i;
		}
		System.out.println("1~"+max+"까지의 합은 "+sum);
		System.out.print("계속하시겠습니까(1:yes, 2no)");
		start = scan.nextInt();
		}*/
	}
}

/*
양의정수=10
1~10까지의 합은 55
계속하시겠습니까(1:yes, 2:no)?1

양의정수=100
1~100까지의 합은 5050
계속하시겠습니까(1:yes, 2:no)?2

*/