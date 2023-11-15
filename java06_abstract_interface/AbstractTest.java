package java06_abstract_interface;
//추상 클래스는 일반메소드와 추상 메소드가 1개 이상 포함한 클래스를 말한다.
//일반 메소드와 추상 메소드를 가진 클래스를 말한다.
//추상 메소드는 메소드 명만 존재하고 실행부(바디,블럭)를 명시하지 않은 미완성 메소드를 말한다.
//추상 메소드는 반환형 왼쪽에 abstract 키워드를 표기하여야 한다. 
public abstract class AbstractTest {
	public AbstractTest()	{}
	public void add(int a, int b) {
		int hap = a+b;
		System.out.println(a+"b"+"="+hap);
		
	}
	
	public abstract void minus(int a, int b);	//추상메소드
	public void multiple(int x, int y) {
		int mul = x* y;
		System.out.println(x+"*"+y+"="+mul);
	}
	public abstract void divide (int x, int y);
}
