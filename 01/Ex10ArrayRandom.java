import java.util.Arrays;
import java.util.Random;

public class Ex10ArrayRandom {

	public static void main(String[] args) {
		Random ran = new Random();
		// 1~1000사이의 값을 100개 만들어 배열에 저장하고
		// 총합, 제일 큰 값, 제일 작은 값, 평균을 구하라.
		// MAX, MIN 사용하지 말고 반복문 사용.
		
		//데이터 준비
		int data[] = new int[100];
		
		for (int i=0; i<data.length; i++) {
			data[i] = ran.nextInt(1000)+1;	//1000 = 0~999
		}
		System.out.println(Arrays.toString(data));
		//계산
		int tot =0;
		int max = data[0];
		int min = data[0];
		
		for (int i=0; i<data.length; i++) {
			tot +=data[i];
			if(max<data[i])	max=data[i];
			if(min>data[i])	min=data[i];
		}
		int avg = tot/ data.length;
		System.out.println("전체합="+tot);
		System.out.println("평균="+avg);
		System.out.println("최고값="+max);
		System.out.println("최저값="+min);
	}
}
		/*
		int ranNum[] = new int[100]; 
		int total = 0;
		int max =0;
		int min =1001;
		
		for (int i=0; i<100; i++) {
			int num = Math.abs(ran.nextInt(1000-1+1))+1;	//	Math.abs() -> 절대치
			ranNum[i]=num;
			
			total+=ranNum[i];
			
			if(max<ranNum[i]) {
				max=ranNum[i];
			}
			if(min>ranNum[i]) {
				min=ranNum[i];
			}
			
			
//			System.out.print(num+"\t");
//			if(i%10==0) {
//				System.out.println("");
			}
		System.out.println("전체합="+total);
		System.out.println("평균="+total/100);
		System.out.println("최고값="+max);
		System.out.println("최저값="+min);
		}

}*/

/*
	
전체합 =
평균 =
최고값 =
최저값 =

	  
*/