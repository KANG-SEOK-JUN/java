
//2148 표준체중 구하기
//현재 체중까지 입력.

//2421 구구단 3단
//한번 실행하면 전체가 다 나오게
public class For02 {

	public static void main(String[] args) {
		//중첩 반복문
		
		for (int i=1; i<=5; i++) {
			
			for	(int j=1; j<=5; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		for(int i =1; i<=5; i++)	{
			
			for (int j =1; j<=i; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		for(int i =1; i<=5; i++)	{
			
			for (int j =5; j>=i; j--)	{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*****
*****
*****
*****
*****
 
 
 *
 **
 ***
 ****
 *****
 
 *****
 ****
 ***
 **
 *
 
 */
