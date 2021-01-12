package org.beta;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(15000);
		WebElement bestseller = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		Actions ac = new Actions(driver);
		//ac.moveToElement(bestseller).build().perform();
		ac.contextClick(bestseller).build().perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(mobile).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement todaydeal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(todaydeal).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		
		String parent = driver.getWindowHandle();
		
		driver.switchTo().window(parent);
		System.out.println("parent id"+parent);
		
	
		
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		Object[] ar = all.toArray();
		
		for (int i = 0; i < ar.length; i++) {
			//System.out.println(ar[2]);	
			String s = ar[3].toString();
			driver.switchTo().window(s);
			
		}
		
		
		
				
	}

}
