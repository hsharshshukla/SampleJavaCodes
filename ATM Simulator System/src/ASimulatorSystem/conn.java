package ASimulatorSystem;

import java.sql.*;

public class conn {
 Connection c;
 Statement s;
 	public conn() {
 		try {
 			Class.forName("com.mysql.jdbc.Driver");
 				c =  DriverManager.getConnection("jdbc:mysql:///projects","root","password");
 				s = c.createStatement();
 				
 		}catch(Exception e) {
 			System.out.println(e);
 		}
 	}
}
