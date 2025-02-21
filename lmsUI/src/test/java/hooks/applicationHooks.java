package hooks;


import driverFactory.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class applicationHooks extends BasePage {

	
	@Before
	public void setUp() {
		 System.out.println("Initializing WebDriver in Before Hook and will use it in setp def");
		getDriver("chrome");
		
	}
	
	@After
	public void tearDown() {
		
		quitDriver();
	}
	
}
