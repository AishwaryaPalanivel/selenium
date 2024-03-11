package seleniumSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String[] args) {
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//- Click on the Create new account button.
		driver.findElement(By.partialLinkText("Create new account")).click();
		//- Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Aishwarya");
		//- Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("sp");
		//- Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("spaishwarya@gmail.com");
		//- Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("Aish@123");
		//- Handle all three dropdowns in Date of birth
		WebElement inDteDD = driver.findElement(By.id("day"));
		Select sec1 = new Select(inDteDD);
		sec1.selectByValue("25");
		WebElement inmthDD = driver.findElement(By.id("month"));
		Select sec2 = new Select(inmthDD);
		sec2.selectByValue("7");
		WebElement inyrDD = driver.findElement(By.id("year"));
		Select sec3 = new Select(inyrDD);
		sec3.selectByValue("2000");
		//- Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
}
