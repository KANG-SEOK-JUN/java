import java.util.Calendar;
import java.util.Scanner;

public class Ex05CondoleCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar date= Calendar.getInstance();
		
		//년, 월 입력.
		System.out.print("년도=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month = scan.nextInt();
		
		//현재 날짜 시간 객체
		//년 월 1일로 변경
		date.set(year,month-1,1);
		
		//1일에 대한 요일
		int week = date.get(Calendar.DAY_OF_WEEK);	//1~7
		
		
		//30-> 4, 6, 9, 11
		//31-> 1, 3, 5, 7, 8, 10, 12
		//28,29-> 2
		
		/*
		int lastDay =31;
		switch(month)	{
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30;break;
		case 2:
			//윤년 = 년도가 4의 배수이고 100으로 나눠지지 않아야 한다.
			//윤년 = 400의 배수의 해는 윤년
			if(year%400==0 || year%4==0 && year%100!=0) {//윤년일 때
				lastDay = 29;
			}else	{//평년일 때
				lastDay = 28;
			}
		}*/
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);	
		
		System.out.println("\t\t"+year+"년 "+month+"월");		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//공백 출력
		for(int space=1; space<week;space++)	{
			System.out.print("\t");
		}
		//날짜 출력
		for(int day=1;day<=lastDay;day++) {
			System.out.print(day+"\t");
			
			if((week-1+day)%7==0)	{	//줄바꾸기
				System.out.println();
			}
		}	
	}
}
		/*
		Scanner scan = new Scanner(System.in);
		Calendar now= Calendar.getInstance();
		
		System.out.print("년도=");
		int YearInt = scan.nextInt();
		System.out.print("월=");
		int MonthInt = scan.nextInt();
		
		now.set(Calendar.YEAR, YearInt);
		now.set(Calendar.MONTH, MonthInt-1);
		now.set(Calendar.DATE, 1);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int LastDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);	
		
		System.out.println("\t\t"+year+"년 "+month+"월");		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for (int i =1;i<week;i++) {
			System.out.print("\t");
		}
		for (int i =1;i<=LastDay;i++) {
			System.out.print(i+"\t");
			week++;
			if(week==8) {
				week=1;
				System.out.println();
			}
		}		
	}	
}*/

	//int LastWeek = now.getActualMaximum(Calendar.WEEK_OF_MONTH);
