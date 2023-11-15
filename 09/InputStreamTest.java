

import java.io.InputStream;
import java.util.Arrays;

public class InputStreamTest {

	public InputStreamTest() {
		//InputStream : InputStream은 추상 메소드를 포함한 추상클래스으미로 상속을 받아서
		//				추상 메소드를 오버라이딩해야 한다.
		//				System.in필드에 객체가 생성 되어 있다.
		//				입력 시 한번에 1byte만 입력한다.
		InputStream is = System.in;
		try {
			while(true) {
				/*
			//read() : 콘솔, 파일, 네트워크에서 자바로 읽어오기
			int code = is.read();	//사용자가 값(문자)을 입력 후 enter를 입력할 때 까지 기다림.//enter의 값도 들어감?
			//데이터를 읽고 넘겨줘야 하는데 데이터가 없다?
			//입력 후 값이 없을 때 -1 = 코드에 -1은 없음.
			if(code == -1) {
				break;
			}
			
			System.out.println(code+", "+(char)code);
			*/
			
			//read(Byte[]): 한번에 바이트 배열 크기만큼 읽어오기
				byte[] data = new byte[10];
				int cnt = is.read(data);
				System.out.println(Arrays.toString(data));
				System.out.println("cnt ->"+cnt);
				//byte배열의 값을 문자열로 변환해서 출력하기
				System.out.println(new String(data,0,cnt)+"---------");
			}
		} catch (Exception ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("프로그램이 종료되었습니다.");
		
	}

	public static void main(String[] args) {
		new InputStreamTest();
	}

}
