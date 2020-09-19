package sumamaventutorial.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testng xml file from Maven
	//how to execute all the test cases from test folder - mvn test
	
	@Test
	public void browserAutomation() {
		System.out.println("browserAutomation");
	}
	
	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
	}

}
