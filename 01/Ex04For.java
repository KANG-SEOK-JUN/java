import java.util.Scanner;

public class Ex04For {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do	{
			System.out.print("단입력 ->");
			int dan = scan.nextInt();
			
			if(dan>=2 && dan<=9)	{
				for(int i=2;i<=9; i++) {	//2-9
					int result = dan*i;
					System.out.println(dan+" * "+i+" = "+result);
				}
			}else {
						System.out.println("단을 잘못입력하였습니다.");
			}
		}while(true);
	}
}

		
		
		
		/*while(true) {
		System.out.print("단입력 ->");
		int num = scan.nextInt();
		
		int i=2;
		do {
			System.out.println(num+" * "+i+" = "+num*i);
			i++;
			
		}while(i<10);
		}*/
		
		/*if(num<=1 || num>=10 ) {
			System.out.print("단을 잘못입력하였습니다.");
		}else {
			for(int i=2;i<10; i++) {
				System.out.println(num+" * "+i+" = "+num*i);
			}	
		}*/
		/*if(num>=2 && num<=9 ) {
			for(int i=2;i<10; i++) {
				int result = num*i;
				System.out.println(num+" * "+i+" = "+result);
				}
		}else {
					System.out.print("단을 잘못입력하였습니다.");
			}*/					

/*
	2~9단까지
[실행]
단입력->10
단을 잘못입력하였습니다.

단입력->5
5 * 2 = 10
5 * 3 = 15
:
:
5 * 9 = 45

*/