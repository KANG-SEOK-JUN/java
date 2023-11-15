import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class ArrayListMain {

	public ArrayListMain() {
	}

	public void start() {
		ArrayListTest alt = new ArrayListTest();
		ArrayList al = alt.memberList();

		for (int i = 0; i < al.size(); i++) {// index :0,1,2,3
			MemberDTO dto = (MemberDTO) al.get(i);
			System.out.printf("%s\t %s\t %s\t %s\n", dto.getUserid(), dto.getUsername(), dto.getTel(), dto.getEmail());
		}
		System.out.println("------------------------------");

		// 컬렉션 ArrayList의 객체를 배열로 얻어오기
		Object[] memObj = al.toArray();
		for (Object m : memObj) {
			MemberDTO dto = (MemberDTO) m;
			System.out.println(dto.toString());
		}

		System.out.println("=====ArrayList 확장 for문 ============");
		for (Object m : al) {
			MemberDTO dto = (MemberDTO) m;
			System.out.printf("%s\t %s\t %s\t %s\n", dto.getUserid(), dto.getUsername(), dto.getTel(), dto.getEmail());
		}
		System.out.println("*******제너릭사용한 경우*******");
		ArrayList<MemberDTO>alt2 = alt.memberList2();
		
		for(MemberDTO dto : alt2) {
			System.out.println(dto.toString());
		}
		
		System.out.println("------------------------------");
		for(int i=0; i<alt2.size();i++) {
			//제너릭이 설정된 컬렉션은 Object이 아니라 제너릭으로 리턴하므로 형변환하지 않아도 된다.
			MemberDTO dto = alt2.get(i);
			System.out.printf("%-10s %-10s %-15s %s\n",dto.getUserid(),dto.getUsername(),dto.getTel(),dto.getEmail());
		}
	}

	public static void main(String[] args) {

		new ArrayListMain().start();

	}

}
