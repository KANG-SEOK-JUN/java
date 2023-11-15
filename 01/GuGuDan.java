
public class GuGuDan {

	public static void main(String[] args) {
		// 구구단
		
		System.out.println("\t구구단");
		int step =5;
		//1,4,7
		for(int i =1; i<=9; i+=step) {
			//각 단의 제목 1->4, 3->7, 7->10
			for (int j=i; j<i+step;j++) {
				System.out.print("=="+j+"단==\t");
			}
			System.out.println();
			for (int k=2; k<=9;k++) {	//2, 3, 4, 5, 6, 7, 8, 9
				for (int j=i; j<i+step;j++) {	//1-123 4-456 7-789
				System.out.print(j+"*"+k+"="+(j*k)+"\t");
			}
				System.out.println();
			}

		}

		}
}
