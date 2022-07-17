package com.jts.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.*;
import java.util.ResourceBundle;

public class DbPropertiesReader {
	public Properties getProperties() {
		ResourceBundle rd=ResourceBundle.getBundle("db-properties");
		String loadDriver = rd.getString("driver");
		 
        // url of the database
        String dbURL = rd.getString("dburl");
 
        // username to connect db
        String dbUSERNAME = rd.getString("dbuser");
 
        // password to connect db
        String dbPASSWORD = rd.getString("dbpassword");
        System.out.println(dbPASSWORD);
		
		
		
		return null;

	}

	public static void main(String s[]) {
		DbPropertiesReader d = new DbPropertiesReader();
		Properties p = d.getProperties();

//		System.out.println(p.getProperty("dbuser"));
//		System.out.println(p.getProperty("dbpassword"));
//		System.out.println(p.getProperty("dburl"));
//		System.out.println(p.getProperty("drvierclass"));

	}

}
