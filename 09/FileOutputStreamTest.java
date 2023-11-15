import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public FileOutputStreamTest() {
		//FileOutputStream :byte 단위로 파일로 쓰기
		
		try {
			File file = new File("F://javatest", "my_data.txt");
			
			FileOutputStream fos = new FileOutputStream(file);
			
			String [] inData = {"자바에서 문자열을","파일로 쓰기 연습중","FileOutPutStream 객체 활용함"};
			for(String data :inData) {
				//문자열 -> byte배열
				fos.write(data.getBytes());
				
			}
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileOutputStreamTest();

	}

}
