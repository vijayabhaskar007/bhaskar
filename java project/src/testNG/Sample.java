package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void abc()
	{
		
System.out.println("welcome to abc");
	}
	
	@Test
	public void xyz()
	{
		
System.out.println("welcome to xyz");
	}

	@Test(priority=1,groups= {"regression","functional"})
	public void testC()
	{
		
System.out.println("welcome to TestC");
	}

	@Test(priority=3,enabled=false)
	public void testD()
	{
		
System.out.println("welcome to TestD");
	}

	@Test(priority=1,groups= {"functional"})
	public void testE()
	{
		
System.out.println("welcome to TestE");
	}

	@Test(priority=2,groups= {"smoke"})
	public void testF()
	{
		
System.out.println("welcome to TestF");
	}

	@Test
	public void login()
	{
		Assert.fail();
System.out.println("welcome to login");
	}

	@Test(dependsOnMethods= {"login"})
	public void homepage()
	{
		//Assert.fail();
System.out.println("welcome to homepage");
	}

	@Test(dependsOnMethods= {"login","homepage"})
	public void logout()
	{
		
System.out.println("welcome to logout");
	}


}
