
public class IfElseIf {

	public static void main(String[] args) {
		//if-else if문:
		//분류 기준이 2개 이상일 때 사용할 수 있다.
		
		int kor = 80;	//국어 점수의 학점
		
		String grade = "A";	//한글자 String char 선택
		if(kor>=90 ) {	// kor>=90 && kor <=100
			grade = "A";
		}else if(kor>=80) {	// kor>=80 && kor <90
			grade = "B";
		}else if(kor>=70) {
			grade = "C";
		}else if(kor>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("학점 ="+grade+"학점");
	}

}

/*
90-100 	A학점
80-89 	B학점
70-79	C학점
60-69	D학점
0-59	F학점
*/