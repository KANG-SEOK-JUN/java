package java10_jdbc_oarcle;

import java.awt.dnd.DropTargetContext;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;

public class UpdateTest extends DBConnection {
	Scanner scanner = new Scanner(System.in);
	public UpdateTest() {
		
	}

	public void start() {
		//수정할 사원번호 입력
		//담당업무, 급여, 보너스 수정하기
		
		try {
			System.out.print("수정할 사원번호 ->");
			int empno = Integer.parseInt(scanner.nextLine());
			
			System.out.print("담당업무 :");
			String job = scanner.nextLine();
			
			System.out.print("급여 :");
			Double sal = Double.parseDouble(scanner.nextLine());

			System.out.print("보너스 :");
			Double comm = Double.parseDouble(scanner.nextLine());
			
			getConnection();
			
			sql = "update emp2 set job=?, sal =?, comm=? where empno=?";
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, job);
			pstmt.setDouble(2, sal);
			pstmt.setDouble(3, comm);
			pstmt.setInt(4, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println(empno+"사원의 정보가 수정되었습니다.");
			}else {
				System.out.println("사원정보가 수정되지 않았습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	public static void main(String[] args) {
		new UpdateTest().start();
	}

}
