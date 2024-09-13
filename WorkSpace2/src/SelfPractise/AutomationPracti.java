
package SelfPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracti {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title='Women']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		driver.findElement(By.id("email_create")).click();		
		driver.findElement(By.id("email_create")).sendKeys("madhudevara.to@gmail.com");		
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Madhu Devarakonda");
		
	}

}
