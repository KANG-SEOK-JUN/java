import java.awt.print.Printable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public HashMapTest() {
	}

	public void start()	{
		//HashMap
		//key 와 value를 가진다.
		//키는 중복될 수 없다.
		//	
		HashMap<String, MemberDTO> hm = new HashMap<>();
		
		hm.put("홍길동", new MemberDTO("goguma","고구마","010-1234-1324"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("guest");
		dto.setUsername("손님");
		dto.setEmail("guest@naver.com");
		
		hm.put("손님", dto);
		hm.put("세종대왕", new MemberDTO("king","세종대왕","010-1111-2222"));
		hm.put("안중근", new MemberDTO("jung","안중근","010-3333-2222"));
		
		//Map 컬렉션에 객체 얻어오기
		//key를 이용하여 value얻어오기
		MemberDTO value = hm.get("세종대왕");
		System.out.println(value.toString());
		//System.out.println(value.));
		if(value.getUserpwd()==null) {
			System.out.println("null");
		}
		
		//모든 key 얻어오기
		Set<String> keyList = hm.keySet();
		Iterator<String> li = keyList.iterator();
		System.out.println("==================key를 이용한 정보 얻어오기 ===========");
		while(li.hasNext()) {
			MemberDTO dto2 = hm.get(li.next());
			System.out.println(dto2.toString());
		}
		
		//key없이 모든 value 가져오기
		Collection<MemberDTO> valueList = hm.values();
		Iterator<MemberDTO> iii = valueList.iterator();
		System.out.println("==================value를 이용한 정보 얻어오기 ===========");
		
		while(iii.hasNext()) {
			System.out.println(iii.next().toString());
		}	
	}
	public static void main(String[] args) {
		HashMapTest hmh = new HashMapTest();
		hmh.start();
	}

}
