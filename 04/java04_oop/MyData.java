package java04_oop;

public class MyData {
	protected String username ="세종대왕";
	
	//생성자 메소드에 protected가 있으면 
	//같은 패키지에서는 객체를 생성할 수 있고
	//다른 패키지에서는 반드시 상속받아야 한다.
	protected MyData()	{}
	
	protected String getUsername() {
		return username;
	}
	
	protected void setUsername(String username)	{
		this.username = username;
	}
}
