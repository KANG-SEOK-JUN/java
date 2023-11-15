import com.multi.Student;

public class ModiferTest01 {

	public ModiferTest01() {
		
		
		Student student = new Student();	//사용하는 클래스는 multi package 안에 있어 import를 해줘야함
		
		System.out.println("이름 : " + student.name);
		
	}

	public static void main(String[] args) {
		new ModiferTest01();
			
		
	}

}
