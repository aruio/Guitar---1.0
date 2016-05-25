package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	public class Util {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Util t=new Util();
			System.out.print(t.getConnection());
		}
		
		
		public static Connection getConnection(){
			
		    try {
				Class.forName("org.sqlite.JDBC");
			
		    Connection conn =
		      DriverManager.getConnection("jdbc:sqlite://d:/HrGuitar.db");
		    	return conn;
		    } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return null;
			
		}
		public void closeConnection(Connection conn){
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

