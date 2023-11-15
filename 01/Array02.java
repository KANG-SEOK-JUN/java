
public class Array02 {

	public static void main(String[] args) {
		// 배열 생성시 초기값 설정하기.
		
		String colorName[] =new String[] {"RED","GREEN","BLUE","YELLOW", null, null};
		
		for(int idx=0; idx<colorName.length; idx++) {
			System.out.println("colorName["+idx+"]="+colorName[idx]);
		}
		int jumsu[] = {25,95,36,48,75};	//new int[] 생략 가능
		for (int i=0; i<jumsu.length;i++) {
			System.out.println("jumsu["+i+"]->"+ jumsu[i]);	//index = 첨자값
		}
		
		//확장된 for 문
		//데이터형 변수 : 배열형 변수, 컬렉션
		for(   int data : jumsu) {	//왼쪽에 있는 변수를 오른쪽으로 이동.
									//jumsu [25,95,36,48,75]가 순차적으로 data에 담김.
			System.out.println(data);
			
		}
	}

}
