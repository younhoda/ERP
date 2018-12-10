package erp;

import java.sql.*;
public class BookOrderDAO {

	public void insert(BookOrderDTO dto) {
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/erp";
		String user="root";
		String password="1234";
		
		Connection con=DriverManager.getConnection(url, user, password);
		String sql="insert into books_order values(null,?,?,null)";
		
		
		PreparedStatement ps= con.prepareStatement(sql);
		System.out.println("3.SQL문 결정 성공.....");

		ps.setString(1, dto.getIsbn());
		ps.setInt(2,dto.getPrice());
		
//		ps.setInt(2,dto.getTimeStamp());
//		ps.setInt(2,dto.getDate());
//		ps.setString(2, dto.getTitle());
//		ps.setString(3,dto.getClassification());
//		ps.setString(4,dto.getPublisher());
//		ps.setString(5,dto.getWriter());
//		ps.setInt(6,dto.getPrice());
		
		ps.executeUpdate();
		System.out.println("4. SQL문 실행 요청.....");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}