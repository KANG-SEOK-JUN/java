import java.util.Enumeration;
import java.util.Properties;

import javax.sound.sampled.Port;

public class PropertiesTest {

	public PropertiesTest() {
		//key와 value를 문자열로만 처리하는 컬렉션.
		Properties pro = new Properties();
		
		//객체추가
		pro.setProperty("/seoul/index.do", "/index.jsp");
		pro.setProperty("/test.do", "/borad/boradList.jsp");
		pro.setProperty("11111", "22222");
		pro.setProperty("22222", "BBBBB");
		
		//key를 이용하여 값 얻어오기
		System.out.println("/test.do -->"+ pro.getProperty("/test.do"));
		
		//getProperty(String key, String defaultValue)
		//key가 없으면 defautValue로 결과가 얻어진다.
		System.out.println("/notice.do -->"+ pro.getProperty("/seoul/index.do","/error.jsp"));
		//해당 key의 값(notice.do)이 없으면 /error.jsp을 가져온다.
		
		//모든 키 목록 구하기
		Enumeration keyList =pro.propertyNames();
		while (keyList.hasMoreElements())	{//객체가 있으면 true 없으면 false
			String key = (String)keyList.nextElement();
			String value = pro.getProperty(key);
			System.out.println(key+"="+value);
		}
 	}

	public static void main(String[] args) {
		new PropertiesTest();
	}
}
