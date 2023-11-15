import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	Random random =new Random();

	public LottoCollection() {

	}

	public void gamestrat() {

		do {
			int cnt = gameCount();
			for(int i=1; i<=cnt;i++) {
				System.out.print(i+"게임=");
				createLotto();
			}
			if(!endQuestion()) {//true - 계속 , false - 중지
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}while(true);
			

	}

	// 번호 생성
	// 번호 1개 생성
	public void createLotto()	{
		//번호 6개와 마지막 생성된 번호가 보너스 번호 1개를 생성
		//정렬, 중복 검사 -> Tree(정렬)Set(중복 제거)
		TreeSet<Integer> ts = new TreeSet<>();
		int ran=0;
		while(true)	{
			ran = random.nextInt(45)+1;//난수 생성 -마지막 생성 번호
			ts.add(ran);//TreeSet에 추가
			if(ts.size()==7){//7개가 되면 난수 생성을 중단.
				break;
			}
		}
		//마지막 생성번호 ran이 가지고 있다.
		ts.remove(ran);	//보너스 번호를 TreeSet에서 지운다.
		System.out.print(ts.toString());	//[3,6,12,25,32,37]
		System.out.println(", bonus="+ran);
	}
	// 게임 수 입력
	public int gameCount() {
		int cnt;
		do {
			try {
				System.out.print("게임 수->");
				String cntString = scan.nextLine();
				cnt = Integer.parseInt(cntString);// 15,-58, yj 예외 처리 해주어야 함
				
				//게임 수의 최대 최소 확인.
				if(cnt >=1 && cnt <=10) {//정상 게임 수
					return cnt;
				}else { //게임 수 범위 벗어남.
					System.out.println("게임 수는 1~10까지만 가능합니다.");
				}
			} catch (NumberFormatException nnf) {
				System.out.println("게임 수는 숫자이여야 합니다.");
			}
		} while (true);

	}

	// 계속 여부 확인
	public boolean endQuestion() {
		//y,Y :예
		//n,N :아니요(중단)
		//그 외는 다시 질문
		do {
			System.out.print("계속 하시겠습니까(y or Y : 예, n or N :아니요?) :");
			String yn = scan.nextLine();
			//문자열은 비교할 때 == 사용하면 안되고 메소드 사용해야함. 
			//equals() -> 대소문자 구별
			//equalsIngnoreCase() -> 대소문자 구분 X
			if(yn.equalsIgnoreCase("y")) {//계속한다.
				return true;
			}else if(yn.equalsIgnoreCase("n")) {//그만한다
				return false;
			}
		}while(true);
	}
	
	
	public static void main(String[] args) {
		LottoCollection lotto = new LottoCollection();
		lotto.gamestrat();

	}

}
