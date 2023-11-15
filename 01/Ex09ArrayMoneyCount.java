import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09ArrayMoneyCount {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);

			int money[] = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

			System.out.print("금액을 입력하세요?=");
			int won = scan.nextInt();

			for (int i = 0; i < money.length; i++) {
				// 화폐수 구하기
				int cnt = won / money[i]; // 5
				// 화폐수가 0보다 크면 출력
				if (cnt > 0) {
					System.out.print(money[i] + "원=" + cnt);
					if (money[3] <= money[i]) {
						System.out.print("장");
					} else {
						System.out.print("개");
					}
					// 금액에서 게산한 화폐수 금액을 뺀다.
					won = won - money[i] * cnt;
				}
			}
		} catch (InputMismatchException e) {// try 영역에서 예외가 발생하면 해당 catch로 이동한다.
			System.out.println("정수를 입력하세요.");

		}
	}
}
