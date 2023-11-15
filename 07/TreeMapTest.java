import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public TreeMapTest() {
		//TreeMap
		//key와 value를 가진다
		//key를 정렬한다.
		
		TreeMap<String, MemberDTO> tm = new TreeMap<>();
		
		tm.put("홍길동", new MemberDTO("hong","홍길동","010-1234-1234"));
		tm.put("이순신", new MemberDTO("Lee","이순신","010-2345-6789"));
		tm.put("세종대왕", new MemberDTO("king","세종대왕","010-3456-7890"));
		tm.put("강감찬", new MemberDTO("chan","강감찬","010-4567-8901"));
		tm.put("안중근", new MemberDTO("jung","안중근","010-5678-9012"));
		
		System.out.println("------------key 목록을 구하여 전체 출력 ----------");
		Set<String> keyList = tm.keySet();
		System.out.println(keyList.toString());
		
		System.out.println("------------value 목록을 구하여 전체 출력---------");
		Collection<MemberDTO> valueList = tm.values();
		
		Object[] objList = valueList.toArray();
		for(Object obj:objList) {
			MemberDTO dto = (MemberDTO)obj;
			System.out.println(dto.toString());
		}
		
	}

	public static void main(String[] args) {
		new TreeMapTest();
	}

}
