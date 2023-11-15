import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex11Lotto {

	//다이아몬드 만들기
	public static void main(String[] args) {
		//로또 번호 생성기
		Scanner scan = new Scanner(System.in);
		Random random = new Random();	//Math.random	Random클래스

		int bonus = 0;
		int start = 1;
		int count = 0;
		
		do {//전체 반복
			//1. 게임수 입력
			System.out.print("게임 수 = ");
			int cnt = scan.nextInt();
			
			for (int i=1; i<=cnt; i++)	{//게임 수 만큼 반복 수행
				//난수생성(7개)
				int lotto[] = new int[7]; //번호 6개와 보너스를 담을 배열
				for(int j=0; j<lotto.length;j++) {// j->0
					
					lotto[j] = random.nextInt(45) + 1;	// 1~45 =45-1+1					
					//중복 검사 : 이전에 만든 값중 같은 값이 존재하는 지 찾는 후 중복되면 지금 만든 값을 버려야 한다.
					for(int k=0; k<j;k++) {
						if(lotto[k]==lotto[j]) {
							j--;//0
							break;
						}
					}
					///
				}
				//7 개의 난수 생성이 된 경우
				int lottoNum[] =Arrays.copyOfRange(lotto, 0, 6);
				Arrays.sort(lottoNum);
				System.out.print(i + 1 + "게임="+	Arrays.toString(lottoNum));
				//보너스
				System.out.println(", bonus="+lotto[6]);
			}//게임수
			System.out.print("계속하시겠습니까(1:예, 2:아니요)? ");
			int que = scan.nextInt();
			if(que == 2) break;
		}while(true);
		System.out.print("프로그램이 종료되었습니다.");
		
	}

}
