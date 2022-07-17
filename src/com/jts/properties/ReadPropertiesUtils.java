package com.jts.properties;

import java.io.*;
import java.util.*;
public class ReadPropertiesUtils {
   public static void main(String args[]) throws IOException {
      Properties prop = getPropertiesFile();
      System.out.println("username: "+ prop.getProperty("dbuser"));
      System.out.println("password: "+ prop.getProperty("dbpassword"));
   }
   public static Properties getPropertiesFile() throws IOException {
      FileInputStream fis = null;
      Properties prop = null;
      try {
         fis = new FileInputStream("db-properties.properties");
         prop = new Properties();
         prop.load(fis);
      } catch(FileNotFoundException fnfe) {
         fnfe.printStackTrace();
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } finally {
         fis.close();
      }
      return prop;
   }
}