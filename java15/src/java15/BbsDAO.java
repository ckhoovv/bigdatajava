package java15;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	//CRUD
	//������ �޼ҵ�� ������ �Ѵ�.
	//SQL�� select * from bbs where id = ?
	public BbsDTO select(String inputId) {
		BbsDTO dto = null; //������ ��������: ������ ��ġ!!
		
		try {
			//1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK..");
			//2. DB����
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� OK..");
			//3. SQL�� ����(��üȭ)
			String sql = "select * from bbs where id = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL�� ��üȭ OK..");
			//4. SQL�� ����
			rs = ps.executeQuery();
			System.out.println("4. SQL�� ���� OK..");
			//SQL���� ����� ������, �޾Ƽ� ó��
			
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}else {
				System.out.println("�˻� ����� �����ϴ�.");
			}
			
		} catch (Exception e) {
			System.out.println("DBó�� �� ���� �߻�...");
			System.out.println(e.getMessage());
		} finally {
			//���� �߻� ���ο� ������� ������ ���� ���Ѿ� �ϴ� �ڵ�.
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println("�ڿ� ������ �����߻�!!");
			}//catch
		}//try - catch - finally
		return dto;
	}//select
	

	
}//class
