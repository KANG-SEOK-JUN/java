
public class ATM implements Runnable {
	private int money = 20000;

	public ATM() {

	}
	// 스레드 오버라딩
	// 스레드 메소드 전체 동기화 하기
	// 동기화 (synchronized) : 스레드 실행 중 다른 실행이 대기모드가 된다.
	// run()메소드 표기, run()메소드 내에 전체 또는 일부에 표시할 수 있다.

	// public synchronized void run() {
	// 스레드 시작 시 1000원 씩 10번 연속 출금
	public void run() {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {
				getCash(1000);

				if (money % 2000 == 0) { // 잔액의 2000의 배수일 때 동기화 해제
					try {
						this.wait();
					} catch (InterruptedException e) {
					}
				} else {// 다시 동기화
					this.notify();
				}
			}
		}
	}

	public void getCash(int cash) {
		if (money >= cash) {// 잔고가 없을 때
			money -= cash;
			System.out.println(Thread.currentThread().getName() + "출금, 잔액=" + money + "원");
		} else {// 잔고가 없을 때
			System.out.println("잔액이 부족합니다.");
		}
	}

	public static void main(String[] args) {
		ATM atm = new ATM();

		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");

		son.setPriority(Thread.MAX_PRIORITY);// 우선순위
		mother.start();
		son.start();
	}

}
