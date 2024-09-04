package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seldemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	// driver.get("https://tutorialsninja.com/demo");
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	Thread.sleep(2000);
	
	WebElement userId =  driver.findElement(By.id("input-email"));   // Locate Web element
	userId.sendKeys("testometer12@gmail.com");    // Find Web Element
	
	// WebElement userPass = driver.findElement(By.id("input-password"));  this is also Correct done by ID
	WebElement userPass = driver.findElement(By.name("password"));
	userPass.sendKeys("testometer12");
	
	// WebElement click= driver.findElement(By.)//No need to store in another element we can write another method there
														// This is called Method chaining
	
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//input[@value='Login']")).click();  // Clicking on Login button using xpath by value
	driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]")).click(); // Clicking on Login button using xpath using contains by class name
	
	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
	
	Thread.sleep(2000);

	  // driver.findElement(By.xpath("//span[text()='My Account']")).click();	while using text we don't have to use @
	
	//  driver.findElement(By.linkText("Logout")).click();  // Clicking on Logout button
	
	driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();  // Clicking on Logout button by xpath using index
	
		
	
}

}