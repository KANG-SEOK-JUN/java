package java04_oop;
//클래스에 final을 사용하면 상속 불가
public class BBB extends AAA {
	int b=20;
	//상위 클래스의 멤버변수의 접근제한자가 private일 때 하위 클래스에 상속해주지 않는다. 
	private int c=12;
	
	public BBB() {}
	//오버라이딩
	//하위 클래스에서 getData()메소드를 오버라이딩 할 수 없다.
	//public final int getData()	{	//오버라이딩
	public int getData()	{
		System.out.println("c="+c);
		return b;
	}
	private String getWelcome()	{
		return "안녕";
	}
	
}
