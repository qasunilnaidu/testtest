package KEYSUN.AdminPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Class3 extends Class2
{

@AfterClass()
public void m11(){
	
	
	System.out.println(" After Class");
}
@AfterMethod()
public void m10(){
	
	
	System.out.println(" After Method");
}

	
	
	
}
