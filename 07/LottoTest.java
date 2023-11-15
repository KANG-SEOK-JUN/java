import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class LottoDTO {
	private int no1;
	private int no2;
	private int no3;
	private int no4;
	private int no5;
	private int no6;
	
	public LottoDTO() {}
	
	public LottoDTO(int no1,int no2, int no3, int no4, int no5, int no6)	{
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
		this.no4 = no4;
		this.no5 = no5;
		this.no6 = no6;
	}

	@Override
	public String toString() {
		return "[" + no1 + ", " + no2 + ", " + no3 + ", " + no4 + ", " + no5 + "], bouse="
				+ no6;
	}

	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getNo3() {
		return no3;
	}
	public void setNo3(int no3) {
		this.no3 = no3;
	}
	public int getNo4() {
		return no4;
	}
	public void setNo4(int no4) {
		this.no4 = no4;
	}
	public int getNo5() {
		return no5;
	}
	public void setNo5(int no5) {
		this.no5 = no5;
	}
	public int getNo6() {
		return no6;
	}
	public void setNo6(int no6) {
		this.no6 = no6;
	}
	
}

public class LottoTest {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	public LottoTest() {
		
		HashMap<Integer, LottoDTO> hm = new HashMap<>();
		LottoDTO lto = new LottoDTO();
		
		int start = 1;
		int num = 0;

		while (start == 1) {
			System.out.print("게임 수 = ");
			int gameNum = scan.nextInt();

			for (int i = 0; i < gameNum;) {
				hm.put(i, null);
				while (num < 6) {
				int ranNum = ran.nextInt(45) + 1;
				
				if()
				
				
				lto.setNo1(ranNum);
				
				}
		}
			
			System.out.print("계속하시겠습니까(1:예, 2:아니요)? ");
			start = scan.nextInt();
		}
	}



	public static void main(String[] args) {

		new LottoTest();

	}
			
		

}
