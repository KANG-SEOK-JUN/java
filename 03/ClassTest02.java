
public class ClassTest02 {
	String model;//자동차 모델 저장하는 변수
	String color;//자동차 색상
	int maxSpeed;//자동차 최고 속도
	
	ClassTest02()	{
		print();
	}
	public ClassTest02(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		print();
	}
	
	public ClassTest02(int maxSpeed, String model, String color) {
		//생성자 메소드는 같은 클래스에 있더라도 메소드명으로 호출 할 수 없다.
		//ClassTest02();
		//반드시 첫번째 실행문으로 명시하여야 한다.
		
		//this() : 같은 클래스의 다른 생성자 호출하기
		//this(); : 매개 변수없는 다른  생성자 메소드 호출
		this(model,color,maxSpeed); //애가 항상 다른 실행문 보다 위에 있어야 함.
		
		System.out.println("test");
		
		//this.maxSpeed=maxSpeed;
		//this.model=model;
		//this.color=color;
		//print();
	}
	
	public void print()	{
		System.out.println("모델->" +model);
		System.out.println("컬러->" +color);
		System.out.println("최고속도->" +maxSpeed);
		
	}
	
	public static void main(String a[])	{
		ClassTest02 ct1 = new ClassTest02();
		ClassTest02 ct2 = new ClassTest02("소나타","white",200);
		ClassTest02 ct3 = new ClassTest02(250,"그랜저","black");
		
	}
	
}
