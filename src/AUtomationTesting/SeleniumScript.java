package AUtomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Webdriver\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		
//		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
//		driver.findElement(By.xpath("//li[@data-entityname='selenium']")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("zebasheikhshiba385@agentforce.com");
		driver.findElement(By.id("password")).sendKeys("Zeba@170397");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.getPageSource());
		
//		driver.close();
		
	}

}
