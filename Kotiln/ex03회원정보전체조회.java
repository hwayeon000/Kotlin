package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03회원정보전체조회 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// -> finally에서 데이터베이스 자원을 반납하기위해서 맨 위에 선언구문을 빼놓기!

		try {
			// 1.데이터베이스연결
			// 1-1. 드라이버 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1-2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			// 2.Query문 전송
			// 2-1. sql문장 준비
			String sql = "select * from aimember";
			// 2-2. 규격에 맞게 담아주기
			psmt = conn.prepareStatement(sql);
			// 2-3. 물음표 인자가 있다면 채워주기!
			// 2-4. sql문장 전송!
			rs = psmt.executeQuery();
			// select구문을 쓸때는 executeQuery쓰자!
			// rs는 테이블과 같은 형태를 띄고 있다.
			while (rs.next()) {
				// -> 데이터가 없었다면 rs.next()는 false가 될거고
				// 해당하는 반복문은 끝이 나겠지???
				String id = rs.getString("ID");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + "\t" + name + "\t" + age);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 4. 데이터베이스 자원 반납
			// rs -> psmt -> conn
			try {
				if(rs != null)
					rs.close();
				if(psmt != null)
					psmt.close();
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
