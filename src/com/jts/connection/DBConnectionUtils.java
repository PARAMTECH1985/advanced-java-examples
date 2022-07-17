package com.jts.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.jts.properties.ReadPropertiesUtils;

public class DBConnectionUtils {
	public static Connection getConnection() {
		Connection con = null;
		Properties props=null;
//		try {
//			props=ReadPropertiesUtils.getPropertiesFile();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			con = DriverManager.getConnection(
//					props.getProperty("dburl"), props.getProperty("dbuser"), props.getProperty("dbpassword"));
			
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test","root","root");
		} 
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		catch (SQLException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}
