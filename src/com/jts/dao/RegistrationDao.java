package com.jts.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jts.bean.RegistrationBean;
import com.jts.connection.DBConnectionUtils;

public class RegistrationDao implements RegistrationDaoInterface {
	public boolean registerStudent(RegistrationBean rb) {
		Connection conn = DBConnectionUtils.getConnection();
		try {
			Statement stmt = conn.createStatement();
			String sql="insert into students values('"+rb.getStudentName()+"','"+rb.getEmailId()+"','"+rb.getMobileNumber()+"')";
			System.out.println("SQL="+sql);
			int result = stmt.executeUpdate(sql);
			if (result==1)
			{
				return true;
			}
			else
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
