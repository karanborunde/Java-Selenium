package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String browser = "CHROME";
		
		if(browser.equals("CHROME"))
		{																		// ChromeDriver c = new ChromeDriver();  // Launching chrome browser
			driver = new ChromeDriver();										//	EdgeDriver e = new EdgeDriver();
		}																		//	FirefoxDriver f = new FirefoxDriver()
		else if(browser.equals("EDGE"))
		{
			driver = new EdgeDriver();;
			
		}
		
		else
		{
			System.out.println("Incorrect browser");
		}
		
		driver.manage().window().maximize();  // Maximizing the chrome window
		driver.get("https://www.google.com"); // Hitting Google using GET method
		Thread.sleep(2000);    // Stoping or breaking Action for 2000 millisec   which means 2 Seconds
		driver.navigate().to("https://www.facebook.com");  // Launching Facebook url
		Thread.sleep(2000);
		driver.navigate().back();  // Performing back action on Chrome browser where Facbook URL is hit
		Thread.sleep(2000);
		driver.navigate().forward();  //Performing forward  on Chrome browser where Facbook URL is hit
		Thread.sleep(2000);
		driver.navigate().refresh();  // Performing refresh on Chrome browser where Facbook URL is hit 
		
		 String title = driver.getTitle();		
		 
		 if(title.contains("Facebook"))
		 {
			 System.out.println("Testcase is Passed");
		 }
		 else
		 {
			 System.out.println("Testcase is Fail");
		 }
		 
											
																
																
		
		
	}

}
