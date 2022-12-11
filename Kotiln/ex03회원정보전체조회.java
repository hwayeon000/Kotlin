package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03ȸ��������ü��ȸ {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// -> finally���� �����ͺ��̽� �ڿ��� �ݳ��ϱ����ؼ� �� ���� ���𱸹��� ������!

		try {
			// 1.�����ͺ��̽�����
			// 1-1. ����̹� �����ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1-2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			// 2.Query�� ����
			// 2-1. sql���� �غ�
			String sql = "select * from aimember";
			// 2-2. �԰ݿ� �°� ����ֱ�
			psmt = conn.prepareStatement(sql);
			// 2-3. ����ǥ ���ڰ� �ִٸ� ä���ֱ�!
			// 2-4. sql���� ����!
			rs = psmt.executeQuery();
			// select������ ������ executeQuery����!
			// rs�� ���̺�� ���� ���¸� ��� �ִ�.
			while (rs.next()) {
				// -> �����Ͱ� �����ٸ� rs.next()�� false�� �ɰŰ�
				// �ش��ϴ� �ݺ����� ���� ������???
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
			// 4. �����ͺ��̽� �ڿ� �ݳ�
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
