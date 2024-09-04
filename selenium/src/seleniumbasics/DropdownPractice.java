package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownPractice {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("KARAN");
		//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KARAN");

		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")).sendKeys("Borunde");
		
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("This is address entered for Testing purpose");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("Testometer@123.hmail.com");
		driver.findElement(By.xpath("//input[@type='tel']"));
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		 List<WebElement> skills = driver.findElements(By.xpath("//select[@id='Skills']//option"));
		 
		 for (WebElement skill:skills)
		 {
			 
			String skil = skill.getText();
			System.out.println(skil);
		 }
		
		
		
		
	}
}
