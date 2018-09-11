package package1;



	import java.sql.*;

	public class DbConnections 
	{
	   public static void main(String args[]) throws SQLException 
	     {
	       Connection conn=null;
	         try
	         {
	            // Load the Driver class.
	               Class.forName("oracle.jdbc.driver.OracleDriver");
	             // Create the connection using the static getConnection method
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@sairam-PC:1521:XE", "SYSTEM","admin");
	            //Create a Statement class to execute the SQL statement
	            Statement stmt=conn.createStatement();
	            //Execute the SQL statement and get the results in a Resultset 
	            ResultSet rs=stmt.executeQuery("select * from EMP");
	            // Iterate through the ResultSet, displaying two values
	// for each row using the getString method 
	         while(rs.next())
	             {
	                System.out.println(rs.getString("ID") +"   "+rs.getString("NAME")+"   "+rs.getString("AGE") +" "+rs.getString("ADDRESS"));
	             }
	        }
	   catch(SQLException se)
	             {
	                System.out.println("Sql Exception "+se);
	             }
	                  catch(ClassNotFoundException cnfe)
	                  {
	                     System.out.println("Class not found Exception"+cnfe);
	                   }

	                 finally
	                {
	                      try {
	                 if(conn != null)
	                 conn.close();
	                 }
	        catch(Exception e) {
	         e.printStackTrace();
	       }
	                }
	       }
	  }

