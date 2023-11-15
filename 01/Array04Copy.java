
public class Array04Copy {

	public static void main(String[] args) {
		// 배열의 복사
		// 배열은 생성이 되면 크기를 변경할 수 없다.
		// 새로 배열을 생성하여 기존 배열의 정보를 복사하기
		
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//클래스 형 메소드. Object=객체 Pos=포지션
		
		int data[] = {54, 87, 15, 79, 34, 79, 32};
		
		//새로운 배열을 생성하여 원래값(일부, 전체) 복사
		int targetData[] =new int[20];
		//			원본배열명,원본 복사 시작 위치,복사할 배열명,타겟의 복사 시작 위치, 복사할 데이터의 갯수
		System.arraycopy(data,			2,			targetData,			3,							4);
		
		for(int i=0; i<targetData.length;i++) {
			System.out.println("targetData["+i+"]="+targetData[i]);
		}
	}

}
