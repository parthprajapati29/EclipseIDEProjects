package classicmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class storedProcedure {
	Connection con=null;
	Statement stmt;
	ResultSet rs;
	
	@BeforeClass
	void setup() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","");
	}
	
	@AfterClass
	void tearDoen() throws SQLException {
		con.close();
	}
	
	@Test(priority = 1)
	void test_storedProcedureExists() throws SQLException {
		stmt = con.createStatement();
		rs=stmt.executeQuery("show procedure status where name='getcustomer'");
		rs.next();
		Assert.assertEquals(rs.getString("Name"), "getcustomer");
	}
	
}
 