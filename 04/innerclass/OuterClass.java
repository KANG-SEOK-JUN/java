package innerclass;

public class OuterClass {
	int productNo = 1234;
	String productName ="컴퓨터";
	public OuterClass() {
		
		
	}
	public void productList()	{
		System.out.println("상품 번호 ->"+productNo);
		System.out.println("상품 명 ->"+productName);
	}
	
	public void createInner()	{
		//내부 클래스 객체를 외부 클래스의 영역에서 사용할 때는 내부 클래스 객체를 외부 클래스를 이용하지 않고 생성할 수 있다.
		//클래스 내에서 내부 클래스 객체를 선언해서 사용 가능.
		InnerClass i1= new InnerClass();
		i1.memberOutput();
	}

	/*
	 내부 클래스란?
	 클래스내에 선언한 클래스
	 1. 클래스 영역에 내부클래스 만들기
	 2. 메소드 내에 내부클래스 만들기
	 3. 익명의 내부 클래스 만들기	 
	 */
	
	class InnerClass{
		int code =999;
		String userid = "ggm";
		InnerClass(){
			System.out.println("InnerClass() 생성자");
			}

		void memberOutput() {
			System.out.println(code+"="+userid);
		}
		
		void changeData()	{
			code = 888;	//내부클래스
			productNo = 5555;//외부 클래스의 멤버변수 접근가능
			memberOutput();//내부 클래스
			productList();//외부 클래스
		}
	}

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		
		oc.productList();
		
		//내부 클래스 객체 생성: 외부 클래스가 없이 객체를 생성할 수 없다.
		//new OuterClass.new InnerClass();
		OuterClass.InnerClass oi = oc.new InnerClass();
		
		oi.memberOutput();
		
		oi.changeData();
		
		oc.createInner();

	}

}
