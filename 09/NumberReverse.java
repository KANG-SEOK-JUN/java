import java.util.Scanner;

public class NumberReverse {

	public NumberReverse() {
	}
	
	static void numberReverse(int data) {
		//123 ->321
		//정수형을 역순으로 출력한다.
		
		StringBuilder sb = new StringBuilder(String.valueOf(data));
		sb.reverse();
		System.out.println(Integer.parseInt(sb.toString()));
		
	}
	//배열을 이용한숫자의 역순
	static void numberReverseArray(int data) {
		StringReverseArray(String.valueOf(data));
	}
	
	static void StringReverseArray(String data) {
		char c[] = data.toCharArray();	//배열로 만듬
		//배열의 교환
		for(int i=0; i<c.length/2; i++) {
			// i = c.length-1-i
			char temp =c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		System.out.println(String.valueOf(c));
		
	}

	public static void main(String[] args) {
		// 클래스 이용
		numberReverse(86152);
		// 배열 이용
		numberReverseArray(215668);
		
		StringReverseArray("Java AGORITHM");
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		int data = Integer.parseInt(n);
		
		while(data!=0) {
			num = num*10+data%10;
			data /= 10;
		}
		System.out.println(num);
	}

}
