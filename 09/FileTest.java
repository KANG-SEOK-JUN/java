import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File : 하드 디스크, USB 등 메모리의 드라이브, 폴더, 파일을 처리할 수 있는 객체.
		
		//file 객체 생성하기
		//1. 
		File f1 = new File("F://javatest");	//(\ = 제어 문자 : \n , \t)
		File f2 = new File("F://javatest/calendar.java");
		File f3 = new File(f1,"calendar.java");
		File f4 = new File("F://javatest" , "calendar.java");
		//mkdir() : 하위에 디렉토리가 없을 때 폴더 생성
		//mkdirs() : 하위 디렉토리까지 폴더 생성.
		//isDirectory() : 디렉토리인지 파일인지 알려줌.
		//exists() : 디렉토리 또는 파일이 존재하는 확인. - 있으면 true 없으면 false
		File f5 = new File("F://sample");	//mkdir 폴덩 생성
		File f6 = new File("F://goguma/folder");
		
		f5.mkdir();
		f6.mkdirs();
		
		//파일 생성.
		File f7 = new File(f5, "dddd.txt");
		try {
			boolean result = f7.createNewFile();
			if(result) {
				System.out.println("파일 생성됨");
			}else {
				System.out.println("파일 생성 안됨.");
			}
			
			//마지막 수정일
			// 마지막 수정일을 밀리초로 구해준다.
			//1970:01:01:00:00:00:0 - 가 밀리초 
			//					  1000
			//					  2000
			//2023				  1673850159672
			long lastSave =f2.lastModified();
			System.out.println(lastSave);
			
			//밀리초로 calendar 객체 만들기
			Calendar dateTime = Calendar.getInstance();//오늘 현재
			dateTime.setTimeInMillis(lastSave);
			
			//2023-01-16 오후 3:22
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy=MM=dd a HH:mm");
			String dateStr = fmt.format(dateTime.getTime());
			System.out.println("마지막 수정일 ->"+dateStr);
			
			File f8 = new File("C:\\");
			File[] fileList = f8.listFiles();
			for(File f9: fileList) {
				//getPath() : 드라이브, 경로, 파일명
				//getName() : 파일명(확장자 포함)
				//getAbsolutePath() : 드라이브, 경로, 파일명
				//getParent() : 드라이브, 경로
				
				if(f9.isDirectory()) {//폴더
					if(f9.isHidden())	{//숨김폴더
						System.out.println(f9.getPath()+"[숨김폴더]");
					}else {
						System.out.println(f9.getPath()+"[그냥 폴더]");
					}
				}else {//폴더가 아닐 떄
					if(f9.isHidden()) {
						System.out.println(f9.getPath()+"[숨김파일]");
					}else {
						System.out.println(f9.getPath()+"[그냥 파일]");
					}
				}
				//String pathFile = f9.getPath();
				//System.out.println(pathFile);
			}
			
			//현재 컴퓨터의 드라이브 목록
			File[] drive = File.listRoots();
			for (File f9:drive) {
				System.out.println(f9.getPath());
			}
			
			//파일 크기 (byte)
			System.out.println("파일크기 ="+f2.length());
			
			//파일 삭제 -자료실 같은 거 만들 때 사용. DB 등록 실패 - 이미 업로드 된 파일삭제
			f7.delete();
			//폴더 삭제 - 폴더 안에 파일이 없어야 함.
			f5.delete();
			
			//파일 안의 데이터 읽어오기
			
			
			
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileTest();

	}

}
