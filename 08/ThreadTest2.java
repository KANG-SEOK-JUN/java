//스레드 처리 클래스 생성
//1. 인터페이스 Runnable을 상속받는다.
//2. runnable에 있는 추상 메소드 오버라이딩
	
public class ThreadTest2 implements Runnable {
	String msg;
	int i =0;

	public ThreadTest2() {
	}
	
	public ThreadTest2(String msg) {
		this.msg = msg;
	}
	//2. runnable에 있는 추상 메소드 오버라이딩
	//	 스레드 구현 코드 기술.
	public void run()	{
		while(true)	{							 //현재 실행중인 스레드 객체
			System.out.println(msg+"=====>"+ ++i+"___" + Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		//인터페이스 Runnable을 상속받아 run()메소드를 오버라딩한 경우
		//해당 클래스를 객체 생성 후 Thread 클래스를 객체생성하여야 한다.
		ThreadTest2 tt1 = new ThreadTest2("first");
		Thread t1 = new Thread(tt1,"첫 번째");
		
		ThreadTest2 tt2 = new ThreadTest2("second");
		Thread t2 = new Thread(tt2,"두 번째");
		
		ThreadTest2 tt3 = new ThreadTest2("three");
		Thread t3 = new Thread(tt3,"세 번째");
		
		//4. 스레드 스케줄러 등록
		t1.start();
		t2.start();
		t3.start();
	}

}
