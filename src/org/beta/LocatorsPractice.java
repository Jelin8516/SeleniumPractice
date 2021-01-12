package org.beta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type = 'text']"));
		email.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("1234567");
		
		Thread.sleep(2000);
		
		WebElement createpage = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String gtext = createpage.getText();
		System.out.println(gtext);
		
		WebElement connectppl = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook')]"));
		String cppl = connectppl.getText();
		System.out.println(cppl);
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
	}

}
