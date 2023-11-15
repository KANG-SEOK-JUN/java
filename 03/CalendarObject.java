import java.util.Calendar;
import java.util.Scanner;


public class CalendarObject {
	//멤버 변수 없이
	public void Start()	{
		int year = inputData("년도");
		int month = inputData("월");
		int week = getWeek(year,month);
		int lastday = getLastDay(year,month);
		titlePrint(year,month);
		spacePrint(week);
		dayPrint(lastday, week);
	}
	
	public void start2(int y, int m)	{
		int w = getWeek(y,m);
		int lastday = getLastDay(y,m);
		spacePrint(w);
		dayPrint(lastday, w);
	}
		
	public int inputData(String msg)	{
		Scanner scan = new Scanner(System.in);	
		System.out.print(msg+"=>");
		return scan.nextInt();
	}
	//요일 구하기(1일)
	public int getWeek(int year, int month)	{
		Calendar now= Calendar.getInstance();
		now.set(year,month-1,1);
		return now.get(Calendar.DAY_OF_WEEK);
	}
	//마지막 날 구하기
	public int getLastDay(int year, int month) {
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
		}
		return lastDay;
	}
	//title 출력
	public void titlePrint(int year, int month) {
		System.out.println("\t\t"+year+"년 "+month+"월");		
		weekTitle();
	}
	
	public void weekTitle() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	//공백 출력
	public void spacePrint(int week) {
		for(int space=1; space<week;space++)	{
			System.out.print("\t");
		}
			
	}
	//날짜 출력

		public void dayPrint(int lastDay, int week) {
		for(int day=1;day<=lastDay;day++) {
			System.out.print(day+"\t");
			
			if((week-1+day)%7==0)	{	//줄바꾸기
				System.out.println();
			}
		}
		}

	/*
	public CalendarObject()	{}
	
	// 년, 월을 입력 받는 메소드
	public int inputYear()	{
		Scanner scan = new Scanner(System.in);	
		System.out.print("년도=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month = scan.nextInt();
		
		outputDate(year,month);
		return year;
		
	}
	
	//달력 기본 틀 출력
	public static void praimDalendar(int year, int month)	{
		System.out.println("\t\t"+year+"년 "+month+"월");		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	
	//날짜 출력
	public static void outputDate(int year, int month)	{
		Calendar date= Calendar.getInstance();
		date.set(year,month-1,1);
		
		//1일에 대한 요일
		int week = date.get(Calendar.DAY_OF_WEEK);	//1~7
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);	

		praimDalendar(year,month);
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
	*/

}
