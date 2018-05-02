package KEYSUN.AdminPack;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Class1 {

	
	
	@BeforeSuite()
	public void m1(){
		
	System.out.println("Method 1");	
	}
	
	
	@BeforeTest()
	public void m2(){
		
	System.out.println("Method 2");	
	}
	
	
	@BeforeClass()
	public void m3(){
		
	System.out.println("Method 3");	
	}
	
	@BeforeMethod()
	public void m4(){
		
	System.out.println("Before Method");	
	}
	
	
	
	
	
}
