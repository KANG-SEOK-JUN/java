
public class Array01 {

	public static void main(String[] args) {
		
		// 배열 : 같은 데이터형의 변수가 여러개 필요할 때 선언하여 사용한다.
		// JAVA의 배열은 크기를 변경할 수 없다.
		
		// 1차원 배열 선언하는 방법
		
		//배열은 객체형
		//stack = 변수들을 관리하는 메모리 
		//		  기본형 변수는 stack에 값이 저장되고
		//		  객체형 변수는 heap에 저장되고 stack은 해당 데이터의 조수인 [hash code]저장
		//heap =  객체형 변수의 데이터를 저장
		
		int score[];	//배열 선언: 변수 옆
		int[] jumsu;	//배열 선언: 데이터 타입 옆
		
		//정수 값을 5개 저장할 수 있는 배열형 객체
		int[] data = new int[5];	//메모리를 할당 받고 초기값 0이 들어가 있음.
									//정수 :0, 실수:0.0, 논리:false, 그외 객체 타입: null
		int a;						//초기값 = null
		String name[] = new String[5];	//null
		
		data[2] = 90;
		name[1] = "홍길동";
		
		//배열명.length = 배열의 길이 
		for (int i=0;i<data.length;i++) {
			System.out.println("data["+i+"]="+data[i]+"\t,name["+i+"]="+name[i]);
		}
		
	}

}
