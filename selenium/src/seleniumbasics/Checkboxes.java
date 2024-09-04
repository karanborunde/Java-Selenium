package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/checkboxes");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='checkbox1']")).click();  //checking the checkbox
		
		WebElement check1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));  // another way of writing or checking checkbox 
		 check1.click();
		
		WebElement check2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	 check2.click(); // Unchecking the checkbox 2
		
		
		// Requirement is that if checkbox is unchecked then it should be checked & if it is checked then Un-check
		
		
		
		
	boolean isChecked = check2.isSelected();
 	 System.out.println(isChecked);
	 if(check1.isSelected()== true)
	 	{
	 		check1.click();
	 	}
	 else if(check2.isSelected()== false)  //  ***********it is not checking checkbox 2
		 
	 {
		 check2.click();
	 }
 	
	Thread.sleep(2000);
	
	boolean c1 = check1.isDisplayed(); // isDisplayed()  to find whether checkbox is displayed or
	System.out.println(c1);
		
	
	boolean c2 = check2.isEnabled();
	System.out.println(c2);
	//	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();  // Unchecking the checkbox
	
	// Radio Button
	
	driver.get("https://practice.expandtesting.com/radio-buttons");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='black']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='football']")).click();
	
		
	}
}


//input[@id='checkbox1']"