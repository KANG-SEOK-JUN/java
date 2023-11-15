
public class FinalTestMain {

	public FinalTestMain()	{
		
	}
	public void start()	{
		
		FinalTest ft = new FinalTest();
		System.out.println(ft.COMPANY);
		System.out.println(FinalTest.PHONE);
		//System.out.println(ft.ADDRESS);	//private는 객체를 통한 접근 불가
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalTestMain().start();
	}

}
