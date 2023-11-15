import java04_oop.MyData;

public class ProtectedTestMain extends MyData {

	public ProtectedTestMain() {
		// TODO Auto-generated constructor stub
	}

	public void start()	{
		//다른 패키지의 protected 접근제한자 생성자이므로
		//객체를 생성할 수 없다.
		//MyData md = new MyData();
		//MyData class는 public //객체를 만드는 MyData() 생성자 메소는 default 그래서 오류 발생.
		
		username = "안중근";
		System.out.println(getUsername());
		setUsername("윤봉길");
		System.out.println(username);
		System.out.println(super.username);
	}
	
	public static void main(String[] args) {
		new ProtectedTestMain().start();
	}

}
