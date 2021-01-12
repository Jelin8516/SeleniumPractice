package org.beta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.worldometers.info/coronavirus/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("abc@gmail.com");
		
		driver.switchTo().defaultContent();
		
		WebElement multiple = driver.findElement(By.xpath("//a[@class='analystic']"));
		multiple.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//div[@class='row']"));
		driver.switchTo().frame(outerframe);
		
		
		
		
	}

}
