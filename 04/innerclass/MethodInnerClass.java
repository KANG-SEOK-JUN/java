package innerclass;

public class MethodInnerClass {

	String email = "test@test.com";
	public MethodInnerClass() {
		System.out.println("MethodInnerClass() 생성자 메소드");
	}
	
	public void emailOutput()	{
		System.out.println("이메일=>"+email+"\n=================");
	}
	public void createInner() {
		int num =100;
		//메소드에 생성하는 내부 클래스
		class InnerClass{
			String name = "세종대왕";
			InnerClass()	{
				System.out.println("num====>"+num);
				System.out.println("name====>"+name);
			}
			void getInformation() {
				emailOutput();//외부 클래스의 메소드 호출
				System.out.println("email*****"+email);
				System.out.println("tel*****"+addr);
			}
		}
		//메소드에서 정의한 내부 클래스 객체 만들기.
		InnerClass ic = new InnerClass();
		ic.getInformation();
	}
	//외부의 멤버영역(클래스영역)
	String addr = "서울시 성동구";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInnerClass mic = new MethodInnerClass();
		mic.createInner();

	}

}
