import java04_oop.SubTest;

class SuperTest {
	int a;

	SuperTest() {
		this(10);
	}

	SuperTest(int a) {
		this.a = a;
	}
}

class SubTest1 extends SuperTest {
	public SubTest1(int a) {
		super(a);
	}

	public SubTest1() {
		super();
	}

public static void main(String[] args) {
	SubTest1 st = new SubTest1();
	//ob.SubTest(10);
	SubTest1();
}

private static void SubTest1() {
	// TODO Auto-generated method stub
	
}

}
