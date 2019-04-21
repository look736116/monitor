package com.my.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Logger;

public class BaseMethod {
	private static Logger logger = Logger.getLogger(BaseMethod.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet result = null;
		ResultSetMetaData metaData = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/monitor";
			String user = "root";
			String password = "";
			String sql = "SELECT * FROM tbl_user u  where u.user_type = ? ";

			con = DriverManager.getConnection(url, user, password);
			logger.info("数据库连接成功！");
			pre = con.prepareStatement(sql);
			pre.setString(1, "U");
			result = pre.executeQuery();
			metaData = result.getMetaData();
			logger.info("表头为:");
			for (int i = 0; i < 5; i++) {
				System.out.print(metaData.getColumnName(i + 1) + " ");
			}
			System.out.println("=======");
			logger.info("数据为：");
			while (result.next()) {
				System.out.println(result.getInt(1));
				for (int i = 1; i < 5; i++) {
					System.out.print(result.getString(i + 1));
				}
			}
			System.out.println("=======");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				result.close();
				if(pre!=null){
					pre.close();
				}
				if(con!=null){
					con.close();
				}
				logger.info("数据库关闭成功！");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
