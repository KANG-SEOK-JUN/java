
public class BreakTest {

	public static void main(String[] args) {
		// break : 반복문 다음 실행문으로 이동
		// 라벨을 만들어 원하는 반복문을 중지시킬 수 있다.

		ggm:for (int i=1; ;i++) {	//무한 루프
			System.out.println("i="+i);
			for(int j=1; ;j++)	{
				System.out.println("j->"+j);	//무한 루프
				if(j>=5)
					break ggm;
			}
			//break 동작 시 해당 위치로 이동
			
			//ggm으로 break 시 종료 위치가 try catch 다음으로 이동하여 예외 처리가 진행될 수 없어 오류 표시
//			try	{
//				Thread.sleep(1000);	//Thread : 자세한 내용은 추후 따로 학습.
//			}catch(Exception e)	{}
			
		}
	}

}
