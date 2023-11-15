import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money_num[] = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int money_num2[] = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		System.out.println("실행");
		System.out.print("금액을 입력하세요?=");
		int money = scan.nextInt();

		for (int i = 0; i < money_num.length; i++) {
			int sub = money / money_num[i];
			money = money % money_num[i];
			money_num2[i] = sub;
		}
		for (int i = 0; i < money_num.length; i++) {
			if (money_num2[i] != 0 && money_num[i] >=1000) {
				System.out.println(money_num[i] + "원=" + money_num2[i] + "장");
			}else if(money_num2[i] != 0) {
				System.out.println(money_num[i] + "원=" + money_num2[i] + "개");
			}
		}

	}
}
