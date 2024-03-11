package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapLogin {
	public static void main(String[] args) {
	//- Initialize the WebDriver (ChromeDriver).
	ChromeDriver driver=new ChromeDriver();
	//- Load the URL http://leaftaps.com/opentaps/.
	driver.get("http://leaftaps.com/opentaps/");
		//- Maximize the browser window
	driver.manage().window().maximize();
	//- Enter a username and password.
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//- Click the "Login" button.
	driver.findElement(By.className("decorativeSubmit")).click();
	//- Click on the "CRM/SFA" link.
	driver.findElement(By.partialLinkText("CRM")).click();
	//- Click on the "Accounts" tab.
	driver.findElement(By.linkText("Accounts")).click();
	//- Click on the "Create Account" button.
	driver.findElement(By.linkText("Create Account")).click();
	//- Enter an account name.
	driver.findElement(By.id("accountName")).sendKeys("VetriSP");
	//- Enter a description as "Selenium Automation Tester."
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	System.out.println(driver.getTitle());
	//- Select "ComputerSoftware" as the industry.
	WebElement inDD = driver.findElement(By.name("industryEnumId"));
	Select sec = new Select(inDD);
	sec.selectByValue("IND_SOFTWARE");
	//- Select "S-Corporation" as ownership using SelectByVisibleText.
	WebElement inScDD = driver.findElement(By.name("ownershipEnumId"));
	Select sec1 = new Select(inScDD);
	sec1.selectByVisibleText("S-Corporation");
	//- Select "Employee" as the source using SelectByValue.
	WebElement insrcDD = driver.findElement(By.id("dataSourceId"));
	Select sec2 = new Select(insrcDD);
	sec2.selectByValue("LEAD_EMPLOYEE");
	//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	WebElement inmcDD = driver.findElement(By.id("marketingCampaignId"));
	Select sec3 = new Select(inmcDD);
	sec3.selectByIndex(6);
	//- Select "Texas" as the state/province using SelectByValue.
	WebElement instpDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select sec4 = new Select(instpDD);
	sec4.selectByValue("TX");
	//- Click the "Create Account" button.
	driver.findElement(By.className("smallSubmit")).click();
	//- Verify that the account name is displayed correctly.
	System.out.println(driver.getCurrentUrl());
	//- Close the browser window.
	driver.close();
}
}