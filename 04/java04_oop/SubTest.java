package java04_oop;


public class SubTest extends SuperTest {


	public SubTest()	
	{
		//a=10;
		//this(a);
		//super(10);
		//super.a =10;
		//this.a =10;//하위에 변수가 없으면 상위의 변수에 적용한다.
		}	
	
	public SubTest(int a)	{
		super(a);
		}

	public static void main(String[] args) {
		SubTest st = new SubTest();
		//ob.SubTest(10);
		System.out.println("st.a="+st.a);
	}

}


