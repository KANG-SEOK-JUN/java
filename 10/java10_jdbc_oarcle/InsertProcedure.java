package java10_jdbc_oarcle;

import java.sql.Types;
import java.util.Scanner;

public class InsertProcedure extends DBConnection {
	Scanner scan = new Scanner(System.in);
	public InsertProcedure()	{
		
	}
	public void insertStart() {
		//콘솔에서 책 정보를 입력받아 DB에 등록하는 클래스.
		// 책이름, 가격, 출판일, 카테고리, 작가명, 출판사명
		System.out.print("도서명->");
		String bookname = scan.nextLine();
		
		System.out.print("가격->");
		int price = Integer.parseInt(scan.nextLine());

		System.out.print("출판일->");
		String pub_date = scan.nextLine();
		
		System.out.print("카테고리->");
		String category = scan.nextLine();

		System.out.print("자가명->");
		String author = scan.nextLine();

		System.out.print("출판사명->");
		String pub_name = scan.nextLine();
		try {
			//DB연결
			getConnection();
			
			//프로시저 호출
			//	{call 프로시저명(값1, 값2,....)}
			sql = "{call booksInsert(?,?,?,?,?,?,?)}";
			
			cstmt = connection.prepareCall(sql);
			//데이터 셋팅
			cstmt.setString(1, bookname);
			cstmt.setInt(2, price);
			cstmt.setString(3, pub_date);
			cstmt.setString(4, category);
			cstmt.setString(5, author);
			cstmt.setString(6, pub_name);
			
			//프로시저에서 out받을 물음표
			cstmt.registerOutParameter(7, Types.INTEGER);//결과 담김
			
			//실행
			cstmt.executeUpdate();
			
			//실행결과
			if(cstmt.getInt(7)>0) {
				System.out.println(bookname+"이 등록되었습니다.");
			}else {
				System.out.println(bookname+"이 등록되지 않았습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InsertProcedure iProcedure = new InsertProcedure();
		
		iProcedure.insertStart();
	}

}
