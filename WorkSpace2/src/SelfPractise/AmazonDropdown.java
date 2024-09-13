package SelfPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			
		ChromeDriver driver = new ChromeDriver();
		//Launching Chrome browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		//launching amazon India
		
		driver.manage().window().maximize();
		//Maximize your browser
		
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		
		dd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dd.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dd.sendKeys(Keys.ARROW_DOWN);

	}

}
