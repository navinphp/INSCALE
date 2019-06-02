package Inscale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Topdanmark \n");
		element.submit();

	}

}
