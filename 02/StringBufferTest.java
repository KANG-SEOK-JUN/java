//html 자바스크립터 java 객관식 20문제
//60점 미만이면 재시험
//오후에 리뷰 진행 하고 시험은 쉽게 나옴.
public class StringBufferTest {

	public static void main(String[] args) {
		// 문자열 처리 하는 클래스 : string, StringBuffer, StringBuilder
		
		StringBuffer sb = new StringBuffer();
		sb.append(1234);
		sb.append("ABCDE");
		sb.append("5555.3698");
		sb.append(true);
		//1234ABCDE5555.3698true
		//원하는 위치에 추가
		sb.insert(5, "스트림버퍼");
		
		//1234A스트림버퍼BCDE5555.3698true

		//문자열의 일부 지우기
		sb.delete(3, 6);
		
		System.out.println("capacity->" + sb.capacity());
		System.out.println(sb.toString());
		
		sb.reverse();
		System.out.println(sb.toString());
		

	}

}
