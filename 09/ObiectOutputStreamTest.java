import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObiectOutputStreamTest {

	public ObiectOutputStreamTest() {
		try {
			//ObjectOutputStream : 객체를 쓰게 할 수 있는 클래스
			
			File f = new File("F://javatest/object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			VectorTest vt = new VectorTest();
			vt.msg = "ObjectOutputStream이용한 파일로 기록하기";
			oos.writeObject(vt);
			
			oos.close();
			fos.close();
			System.out.println("객체 쓰기 완료");
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		new ObiectOutputStreamTest();

	}

}
