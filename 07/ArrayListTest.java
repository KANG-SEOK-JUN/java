import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public ArrayListTest() {
	}

	public ArrayList memberList() {//메소드는 소문자 부터 실행. memberList
		//회원 1명의 정보를 DTO에 셋팅하고
		//DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		ArrayList memList = new ArrayList();
		//add(Object) : 마지막에 객체 추가
		//add(int, Object) : int 위치에 객체 추가하고 int 위치에 객체가 있다다면 다음으로 이동한다.
		memList.add(new MemberDTO("hong","길동","010-1234-1234","hong@naver.com"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("lee","순신","010-1234-5678"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin");
		dto.setUsername("관리자");
		dto.setEmail("admin@naver.com");
		memList.add(dto);
		
		return memList;
	}
	
	public ArrayList<MemberDTO> memberList2() {//메소드는 소문자 부터 실행. memberList
		//회원 1명의 정보를 DTO에 셋팅하고
		//DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		//컬렉션에 제너릭을 설정하면 컬렉션 추가 할 수 있는 객체타입을 지정할 수 있다.
		//컬렉션에 설정된 타입과 다르면 추가 할 수 없다.
		
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
		//add(Object) : 마지막에 객체 추가
		//add(int, Object) : int 위치에 객체 추가하고 int 위치에 객체가 있다다면 다음으로 이동한다.
		memList.add(new MemberDTO("hong","길동","010-1234-1234","hong@naver.com"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("lee","순신","010-1234-5678"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("admin");
		dto.setUsername("관리자");
		dto.setEmail("admin@naver.com");
		memList.add(dto);
		
		//제너릭 설정된 MomberDTO가 아니므로 추가할 수 없다.
		//memList.add(new Scanner(System.in));
		
		return memList;
	}

}