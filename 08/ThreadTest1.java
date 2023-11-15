//스레드 처리되는 클래스 생성하기
//1. Thread 클래스 상속
//2. 스레드 처리할 실행문을 run()메소드에 오버라이딩하여 구현한다.
//3. start() 메소드를 이용하여 자바가상머신의 스레드 스케줄러에 등록한다.
public class ThreadTest1  extends Thread{
	String msg;
	public ThreadTest1() {
	}
	
	public ThreadTest1(String msg)	{
		this.msg = msg;
	}
	
	public void multiThread()	{
		for (int i=1;;i++)	{
			System.out.println(msg+"-->"+i);
			try {
				//예외처리를 해주어야 함
				Thread.sleep(200);	
			}catch (InterruptedException ie) {
			}
			
		}
	}

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫 번째");
		ThreadTest1 tt2 = new ThreadTest1("두 번째");
		ThreadTest1 tt3 = new ThreadTest1("세 번째");
		
		//스레드 시작
		tt1.start();
		tt2.start();
		tt3.start();
	}
}
/*
스레드
1. 스레드 class를 상속 받기
2. 스레드 class의 run 메소드를 오버라이딩 
** 스레드 -> Runnale을 상속 받고 Run은 Rubbale에 있음.
3. 스레드 시작 ->Start 
++ start는 스레이 안에 있음.
*/