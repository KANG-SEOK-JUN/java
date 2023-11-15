import java.util.Scanner;

public class Ex03For {

	public static void main(String[] args) {
		

		
/*		for (int i=1; i<=num; i++) {
			tot+=i;
		}
		for (int i=1; i<=num; i+=2) {
			odd+=i;
		}
		for (int i=0; i<=num; i+=2) {	
			even+=i;
		}
		for (int i=0; i<=num; i+=3) {	//3 6 9
			mul_3+=i;
		}*/
		Scanner scan = new Scanner(System.in);
		System.out.print("정수(5이상):");
		int num = scan.nextInt();
		int tot = 0,odd=0,even=0,mul_3=0;
		
		for (int i=1; i<=num; i++) {
			tot+=i;
		
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
			if(i%3==0)	{
				mul_3+=i;
			}
		}
		System.out.println("1~"+num+"까지의 합은 "+tot);
		System.out.println("1~"+num+"까지의 홀수의 합은 "+odd);
		System.out.println("1~"+num+"까지의 짝수의 합은 "+even);
		System.out.println("1~"+num+"까지의 3의 배수의 합은 "+mul_3);
		
		//sum, oddSum, evenSum,threeSun
	}

}

/*

[실행]
정수(5이상):9
1~9까지의 합은 45
1~9까지의 홀수의 합은 25
1~9까지의 짝수의 합은 20
1~9까지의 3의 배수의 합은 18

*/