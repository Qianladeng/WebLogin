package org.qcy.dao;

import java.sql.*;

// 数据访问层：JDBC增删改查
// 目前 查+增

public class UserDao {
		
	//查
	public static boolean queryUser(String name, String psw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useSSL=false", "root",
					"password");
			String sql = "select * from xuesheng where name=? and psw=?";
			
			ps=connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, psw);
			
			rs=  ps.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(connection!=null) connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//增
		
	}
	

}
