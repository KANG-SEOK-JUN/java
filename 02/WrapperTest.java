
public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper : 기본 데이터형을 객체로 생성해주는 클래스
		
		int num =1234;
		//Integer형으로 변경	Integer intObj = new Integer(num)
		Integer intObj = num;	//오토박싱 : 기본데이터형을 객체로 자동변환하여 대입해준다. 	1.5버전 부터 가능.
		//Integer intObj2 = new Integer(num);	//버전이 오르면서 삭제 예정 기능. 사용을 권장하지 않음.
		
		int num2 =intObj;		//오토언박싱 : 객체형을 기본데이터형으로 변환하여 대입해준다.
		System.out.println(intObj.MAX_VALUE);
		System.out.println(intObj.floatValue());
		System.out.println(intObj.hashCode());
		
		int age = Integer.parseInt("25");	//문자를 숫자로 바꿈.
		System.out.println(age+10);
		double conData = Double.parseDouble("25.596");
		System.out.println(conData+10.2);
		
		System.out.println(age+10);
		
	}

}
