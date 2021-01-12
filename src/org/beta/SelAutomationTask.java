package org.beta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelAutomationTask {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		WebElement signin_Btn = driver.findElement(By.xpath("//a[@class='login']"));
		signin_Btn.click();
		driver.findElement(By.id("email")).sendKeys("jelinthavarathna@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Almighty2020$");
		driver.findElement(By.id("SubmitLogin")).click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
        Actions ac = new Actions (driver);
       ac.moveToElement(women).perform();
       Thread.sleep(2000);
       
       WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
       ac.moveToElement(tshirt).perform();
       ac.click(tshirt).perform();
       
       
       Thread.sleep(3000);
       
       WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
       image.click();
       
       driver.switchTo().frame(0);
       
       WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
       quantity.clear();
       quantity.sendKeys("2");
       
//       Thread.sleep(3000);
       WebElement size = driver.findElement(By.id("group_1"));
      Select s = new Select(size);
      s.selectByValue("2");
//      
      WebElement color = driver.findElement(By.id("color_14"));
      color.click();
      
      WebElement cart = driver.findElement(By.xpath("//button[@class='exclusive']"));
      cart.click();
      Thread.sleep(3000);
      
      WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
      checkout.click();
      
      
		WebElement lastchkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		lastchkout.click();
		
//		WebElement user_name = driver.findElement(By.id("email"));
//		user_name.sendKeys("jelinthavarathna@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("passwd"));
//		pwd.sendKeys("Almighty2020$");
//		
//		WebElement login = driver.findElement(By.id("SubmitLogin"));
//		login.click();
		
		WebElement chkout2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		chkout2.click();
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chkbox.click();
		
		WebElement chkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		chkout3.click();
       
       //driver.findElement(By.xPath("//img[@title='Faded Short Sleeve T-shirts']"));
      
       
       
     
	}

}
