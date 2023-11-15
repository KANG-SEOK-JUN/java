import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCompareMain {
	List<ProductDTO> list = new ArrayList<ProductDTO>();

	public ObjectCompareMain() {
		//객체내의 값을 이용하여 정렬하기
		list.add( new ProductDTO(10001,"샴푸",23500,12));
		list.add( new ProductDTO(10021,"본체",32000,6));
		list.add( new ProductDTO(10051,"셔츠",10000,32));
		list.add( new ProductDTO(10005,"운동화",9000,25));
		list.add( new ProductDTO(10100,"식용유",25000,3));
		list.add( new ProductDTO(10011,"올리브",7200,15));
		
		System.out.println("=============정렬 전 =============");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
		//문자
		//문자(상품명)를 오름차순으로 정렬
		//				정렬대상, 정렬 기준
		Collections.sort(  list , new CompareProductNameAsc() );
		System.out.println("=============정렬 후 =============");

		productPrint();
		//문자(상품명) 내림차순 정렬
		Collections.sort(list, new CompareProductNameDese());
		System.out.println("=======내림차순 정렬 후 ==========");
		productPrint();
		
		Collections.sort(list, new ComparePriceAsc());
		System.out.println("=======가격 오름순 정렬 후 ==========");
		productPrint();
		
		Collections.sort(list, new ComparePriceAsc());
		System.out.println("=======가격 내림순 정렬 후 ==========");
		productPrint();
		
		//숫자
	}
	
	public void productPrint()	{
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	//내림차순
	class ComparePriceDesc implements Comparator<ProductDTO>{
		public int compare(ProductDTO d1, ProductDTO d2) {
			//d1의 가격이 크면 +, d2의 가격이 작으면 -, d1,d2 가격이 같으면 0 리턴
			return (d1.getPrice() < d2.getPrice())? 1:(d1.getPrice()==d2.getPrice() ? 0 : -1);
		}
	}
	
	//숫자 (가격)을 오름차순 정렬
	class ComparePriceAsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO d1, ProductDTO d2) {
			//d1의 가격이 크면 +, d2의 가격이 작으면 -, d1,d2 가격이 같으면 0 리턴
			return (d1.getPrice() < d2.getPrice())? -1:(d1.getPrice()==d2.getPrice() ? 0 : 1);
			
		}
	}
	
	
		//문자(상품명)를 오름차순으로 정렬
		//크기를 비교해주는 
	class CompareProductNameAsc implements Comparator<ProductDTO>{
		public int compare(ProductDTO dto1, ProductDTO dto2) {
			//반환값이 -인 경우 그냥 두고
			//반환값이 +인 경우 dto1의 상품 명이 크것이기 때문에 교환(sort()메소드)
			return dto1.getProductName().compareTo(dto2.getProductName());
		}		
	}
	//문자에 대한 내림차순
	class CompareProductNameDese implements Comparator<ProductDTO>{
		public int compare(ProductDTO d1, ProductDTO d2) {
			//반환값이 -인 경우 그냥 두고
			//반환값이 +인 경우 d2의 상품 명이 크것이기 때문에 교환(sort()메소드)
			return d2.getProductName().compareTo(d1.getProductName());
		}		
	}

	public static void main(String[] args) {
		new ObjectCompareMain();

	}

}
