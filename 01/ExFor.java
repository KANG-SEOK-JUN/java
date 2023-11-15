
public class ExFor {

	public static void main(String[] args) {
		System.out.println("        구구단");

		for(int i=1;i<=9;i+=3) {
			System.out.println("=="+i+"단== "+"=="+(i+1)+"단== "+"=="+(i+2)+"단== ");
			
				for(int k=2;k<=9;k++) {
					System.out.println(i+"*"+k+"="+(i*k)+"\t"+(i+1)+"*"+k+"="+((i+1)*k)+"\t"+(i+2)+"*"+k+"="+((i+2)*k));						
			}				
		}
	}
}
