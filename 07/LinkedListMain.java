import java.util.Scanner;

public class LinkedListMain {

	public LinkedListMain() {}
	
	public void start()	{
		Scanner scan = new Scanner(System.in);
		LinkedListTest llt = new LinkedListTest();
		
		do {
			try {
				System.out.print("메뉴선택[1: In, 2:Out]");
				//1-> PersionDTO 객체를 만들어 LinkedList추가
				//2-> LinkedList에서 제일 앞에 있는 객체를 꺼내기
				int menu = scan.nextInt();
				switch (menu) {
				case 1: llt.inGuest();	break;
				case 2: llt.outGuest();	break;
				
				default :
					System.out.println("메뉴를 잘못입력하였습니다.");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴를 다시 입력하세요.");
			}
			} while (true);
				
		
	}
	public static void main(String[] args) {
		new LinkedListMain().start();
	}

}
