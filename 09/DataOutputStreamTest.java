import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public DataOutputStreamTest() {
		try {
			// DataOutputStream : 기본 데이터형의 값을 해당 데이터형의 byte만큼 확보하여 저장한다.
			File file = new File("F://javatest","data.txt");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);	
			
			int dataInt = 5434;
			double dataDouble = 562.2358;
			boolean dataBoolean =true;
			char dataChar = 'Z';
			
			dos.writeInt(dataInt);
			dos.writeDouble(dataDouble);
			dos.writeBoolean(dataBoolean);
			dos.writeChar(dataChar);
			
			dos.close();
			fos.close();
			System.out.println("쓰기완료...");
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
		}
		
	}

	public static void main(String[] args) {
		new DataOutputStreamTest();
	}

}
