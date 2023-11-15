import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		//표준 체중 구하기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 =");
		int age = scan.nextInt();
		System.out.print("성별(1:남성,2:여성) =");
		int gender = scan.nextInt();
		System.out.print("키 =");
		double height = scan.nextDouble();
		System.out.print("현재체중 =");
		double Weight = scan.nextDouble();	//nextInt = 메소드
		
		//표준체중
		double w = 0.90;
		if(age>36 && gender==1) {
			w = 0.95;
		}else if (age<36 && gender==2)	{
			w=0.85;
		}
		
		double standardWeight = (height-100)*w;
		
		//표준체중지수
		double standarIndex =(Weight/standardWeight)*100;
		
		//체형
		String standardStr ="";
		if(standarIndex<86) {
			standardStr ="마른형";
		} else if(standarIndex<96) {
			standardStr ="조금마른형";
		}else if(standarIndex<116) {
			standardStr ="표준형";
		}else if(standarIndex<126) {
			standardStr ="조금비만형";
		}else {
			standardStr ="비만형";
		}
		
		System.out.println("표준체중 = "+(int)standardWeight);
		System.out.print("당신의 표준체중지수는 "+standarIndex+"으로 "+standardStr+"입니다.");
		
/*		Scanner scan = new Scanner(System.in);
		System.out.print("나이 =");
		int age = scan.nextInt();
		System.out.print("성별(1:남성,2:여성) =");
		int gender = scan.nextInt();
		System.out.print("키 =");
		int height = scan.nextInt();
		System.out.print("현재체중 =");
		int Weight = scan.nextInt();
		double standardWeight;
		if (age<35) {
			if	(gender==1) {
				 standardWeight = (double)(height-100)*0.9;
			}else {
				 standardWeight = (double)(height-100)*0.85;
			}
			
			
		}else	{
			if	(gender==1) {
				 standardWeight = (double)(height-100)*0.95;
			}else {
				 standardWeight = (double)(height-100)*0.90;
			}
		}
		double standardWeightIndex;
		standardWeightIndex=((double)Weight/standardWeight)*100;
		
		System.out.println("표준체중 = "+(int)standardWeight);

		String grade;
		if(standardWeightIndex<=85) {
			grade ="마른형";
		} else if(standardWeightIndex<=95) {
			grade ="조금마른형";
		}else if(standardWeightIndex<=115) {
			grade ="표준형";
		}else if(standardWeightIndex<=125) {
			grade ="조금비만형";
		}else {
			grade ="비만형";
		}
		System.out.print("당신의 표준체중지수는 "+standardWeightIndex+"으로 "+grade+"입니다.");

		*/	
		
	}
}
