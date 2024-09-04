package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KARAN");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BORUNDE");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testometer@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Testometer123");
		
		
	//	driver.findElement(By.xpath("//select[@id='day']//option[@value='11']")).click();  // one way of selecting Drop-down
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		for( WebElement day:days)                        //   this LOoop is writen to select 15th date using For-Each loop
		{
			String dayText= day.getText();
		//	System.out.println(dayText);
			
			if(dayText.equals("15"))
			{
			day.click();
			break;
			}
			
		}
		
		
		
		WebElement selectOption = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel = new Select(selectOption);
	//	sel.selectByIndex(2);       // Only for Select tag we can use selectby method using index
		// sel.selectByValue("2");
		sel.selectByVisibleText("Oct");
		
		 List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']//option"));
		 
		 for(WebElement year:years)
		 {
		String getYear=	year.getText(); // getYear cntains text of all years
		// System.out.println(getYear);
		
			if(getYear.equals("1998")) // string getYear holding all text is comparing with value we want
			{
				
				year.click();
				break;
			}
		 }
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	//	driver.findElement(By.xpath("//button[@id='u_0_n_QD']")).click();	-- Clicking on Submit button
		
	
	}
}
