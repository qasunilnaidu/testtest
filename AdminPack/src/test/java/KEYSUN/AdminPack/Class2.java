package KEYSUN.AdminPack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 extends Class1{

	
	
	@Test()
	
	public void m5(){
		
		
		System.out.println(" Test 1");
	}
	
@Test()
	
	public void m6(){
		
		
		System.out.println(" Test 2");
	}

@Test()

public void m7(){
	
	
	System.out.println(" Test 3");
}
	

@AfterSuite()
public void m8(){
	
	
	System.out.println(" After Suite");
}

@AfterTest()
public void m9(){
	
	
	System.out.println(" After Test");
}

	
}
