package SelfPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.onlinesbi.sbi/");
					
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
		driver.findElement(By.xpath("//a[@class='login_button']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='label2']")).sendKeys("123456");

	}

}
