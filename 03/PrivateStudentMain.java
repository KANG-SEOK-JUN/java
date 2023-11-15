
public class PrivateStudentMain {
	
	public PrivateStudentMain()	{
		// private 접근제한자는 클래스 외부에서 접근허용하지 않는다.
		//객체명.필드명, 객체명.메소드(), new 클래스 메소드
		PrivateStudent ps = new PrivateStudent();
		//String n = ps.name;
		//System.out.println("name->"+n);
		
		ps.output();
		
		String name = ps.getName();
		System.out.println(name);
		
		//name이 private접근제한자 이기때문에 객체명, 필드를 사용할 수 없다.
		//ps.name = "이순신"
		
		ps.setName("이순신");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrivateStudentMain();
	}

}
