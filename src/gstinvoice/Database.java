/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gstinvoice;

/**
 *
 * @author DELL PC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Database {

	/**
	 * @param args
	 */
	static Connection conn;
	public Database()
	{
		// TODO Auto-generated method stub
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
//d:\\derby\\db1
	    String dbName = "d:\\invoicedatabase\\gst";
	    String connectionURL = "jdbc:derby:" + dbName + ";create=true";
	    String createString1 = "CREATE TABLE invoice (invnum VARCHAR(32) ,comname VARCHAR(32) , comadd VARCHAR(100) , gstin VARCHAR(32), st_co VARCHAR(32),vehnum VARCHAR(32),mile VARCHAR(32),surname VARCHAR(32),date VARCHAR(32),cusname VARCHAR(32),addr VARCHAR(100),uid VARCHAR(32),phone VARCHAR(32),email VARCHAR(32),paymode VARCHAR(32),supplace VARCHAR(32),grandtotal varchar(32) , amtword varchar(150) )";

            String createString2 = "CREATE TABLE invoicedetails (invnum VARCHAR(32),serial VARCHAR(4),descrip VARCHAR(200) , hsn VARCHAR(10),qty VARCHAR(4), unit VARCHAR(4),price VARCHAR(4),amount VARCHAR(8),sgstr VARCHAR(4),cgstr VARCHAR(4),igstr VARCHAR(4),sgsta VARCHAR(10), cgsta VARCHAR(10),igsta VARCHAR(10) , total VARCHAR(10),grandtotal VARCHAR(10) )";
             String createString3 = "CREATE TABLE register (name varchar(50),uname varchar(50),pass varchar(50),dob varchar(50),addr varchar(200) )";
            System.out.println("abc");
	  try{
            Class.forName(driver);

	    conn = DriverManager.getConnection(connectionURL);

	    Statement stmt1 = conn.createStatement();
	    stmt1.executeUpdate(createString1);

	    Statement stmt2 = conn.createStatement();
	    stmt2.executeUpdate(createString2);
            
            Statement stmt3 = conn.createStatement();
	    stmt3.executeUpdate(createString3);

            
            System.out.println("tables are created");
            
         
            /*PreparedStatement psInsert = conn
	        .prepareStatement("insert into invoice values (?,?)");

	    psInsert.setString(0, driver);


PreparedStatement psInsert = conn
	        .prepareStatement("insert into invoice values (?,?)");

	    psInsert.setString(1, "rahul khanna");
	    psInsert.setString(2, "sec-11 chandigarh");

	    psInsert.executeUpdate();

	    Statement stmt3 = conn.createStatement();
	    ResultSet rs = stmt3.executeQuery("select * from invoice");
	    System.out.println("Addressed present in your Address Book\n\n");
	    int num = 0;

	    while (rs.next()) {
	      System.out.println(++num + ": Name: " + rs.getString(1) + "\n Address"
	          + rs.getString(2));
	    }
	    rs.close();*/
	  }
          
          catch(Exception e)
          {
                  System.out.println("exception has caught "+e);
              
          }

}
}


