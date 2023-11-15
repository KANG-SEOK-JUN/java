import java.util.Calendar;

public class CalendarTest {
	//가져올 때 get
	//변경할 때 set

	public static void main(String[] args) {
		// 현재 시스템의 날짜, 시간 관련 객체 만들기.
		
		//static이 있는 메소드는 클래스명.메소드명
		//get -> 필드의 값을 구해서 return	//변수 = 필드?
		//final 변경 불가? 1=YEAR
		Calendar now= Calendar.getInstance();	//Calendar 객체가 구해짐.
		
		//원하는 날짜와 시간으로 변경 set()
		now.set(2024, 2-1,11);
		
		//단일 단위 변경
		now.set(Calendar.YEAR, 2024);//년도만 변경. 날짜 시간 중 1개만 변경을 원할 때 Calendar.[속성],[변경 값]
		
		//년도 구하기
		int year = now.get(Calendar.YEAR);
		//now.get(1) == now.get(Calendar.YEAR)
		
		//월 구하기
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);//요일 1~7 1:일요일 ...7:토요일
	
		//오늘은 2023-01-04 수요일입니다.
		
		String weekStr = "";
		switch(week) {
		case 1: weekStr ="일"; break;
		case 2: weekStr ="월"; break;
		case 3: weekStr ="화"; break;
		case 4: weekStr ="수"; break;
		case 5: weekStr ="목"; break;
		case 6: weekStr ="금"; break;
		case 7: weekStr ="토"; break;
		}
		System.err.format("오늘은 %d-%02d-%02d %s요일입니다.\n",year,month,day,weekStr);
		System.out.println("오늘은 "+year+"-"+month+"-"+day+" "+weekStr+"요일입니다.");
		
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		
		// now의 날짜 정보에서 월의 마지막날 구하기
		System.out.println("마지막날->" +now.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}
		
		
		
		
		
	/*	//System.out.println(year+"년 "+month+"월");
		//System.out.println(week);
		//System.out.println(now);
		//컴퓨터의 월은 0-11 우리가 보는 방식은 +1을 해줘야함.
		//WEEK_OF_YEAR 년에서 몇번째 주?
		//WEEK_OF_MONTH 월에서 몇번째 주?
		//등등 존재.
	}
}*/
