package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FileUtility.PropertiyFile;
import Keywords.Keyword;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {


	@Before
	public void tearDown() throws Exception {
		Keyword.selectAndOpenBrowser("chrome");
		Keyword.enterUrl("http://www.demo.guru99.com/V4/");
		Keyword.maxiMizeWindow();
	}


	@Given("^Enter the url$")
	public void enter_the_url() throws Throwable {
		System.out.println("Url entered");
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
		Keyword.enterText("XPATH", PropertiyFile.getProperty("username"), arg1);
		Keyword.enterText("XPATH", PropertiyFile.getProperty("password"), arg2);
		
	}

	@Then("^Msg Display Login successFully$")
	public void msg_Display_Login_successFully() throws Throwable {
		Keyword.clickOnElements("XPATH", PropertiyFile.getProperty("submit"));
		Keyword.clickOnElements("XPATH", PropertiyFile.getProperty("clickOnCust"));
		Keyword.enterText("XPATH", PropertiyFile.getProperty("nameOfCust"), "Vishwajit");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("address"), "Bhosari Dhawade wasti pune");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("city"), "Pune");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("state"), "Maharastra");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("pin"), "411039");
		Keyword.enterText("telephone", PropertiyFile.getProperty("telephone"), "7040007049");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("email"), "Kailas0101@Gmail.com");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("EmailPassword"), "kailas0101");
		Keyword.clickOnElements("XPATH", PropertiyFile.getProperty("submitNewCust"));

		
	}
	
	
}
