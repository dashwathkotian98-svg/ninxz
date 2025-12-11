package com.ninza.hrm.api.projecttest;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
import util.Project;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class ProjectTest {
@Test
public void createProject() throws SQLException
{
//CreatePOjo class
	Random random=new Random();
	int ranNum=random.nextInt(5000);
	
	String expmsg="Successfully Added";
	
	Project pobj=new Project("abc"+ranNum,"Dashwath",0,"created");
	Response rep = given().contentType(ContentType.JSON)
			.body(pobj)
			.when()
			.post("http://49.249.28.218:8091/addProject");
	
			rep.then()
			.assertThat().statusCode(201)
			.assertThat().time(Matchers.lessThan(3000l))
			.assertThat().contentType(ContentType.JSON)
			.log().all();
			
			String actmsg=rep.jsonPath().getString("msg");
			Assert.assertEquals(expmsg, actmsg);
			System.out.println("ugujyf");
	System.out.println("new data")
			
			//verify the projectName in db layer
//			Driver driverref=new Driver();
//			DriverManager.registerDriver(driverref);
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ninza_hrm","root@%","root");
//			ResultSet result=con.createStatement().executeQuery("select * from project");
//			while(result.next())
//			{
//				System.out.println(result.getString(1));
//				con.close();
//			}
			
			}

}
